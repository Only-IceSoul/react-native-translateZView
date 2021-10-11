package com.jjlf.translatezview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import java.util.Objects;


public class ZView extends ViewGroup {


    ZView(Context context){
        super(context);
        setClipChildren(false);
    }

    protected float mTranslationZ = 0f;
    public void setTranslateZ(float v) {
        if(mTranslationZ != v ){
            mTranslationZ = v;
            setTranslationZ(mTranslationZ);
        }
    }

    protected float mTranslationZParent = 0f;
    public void setTranslateZParent(float v) {
        if(mTranslationZParent != v ){
            mTranslationZParent = v;
            if(!updateParentZ()){
                updateParentZOnLayout();
            }
        }
    }

    private boolean updateParentZ(){
        if(getParent() != null){
            ((View) getParent()).setTranslationZ(mTranslationZParent);
            return true;
        }
        return false;
    }
    private void updateParentZOnLayout(){
        addOnLayoutChangeListener(new OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                v.removeOnLayoutChangeListener(this);
                updateParentZ();
            }
        });
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }


}

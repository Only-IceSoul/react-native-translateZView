package com.jjlf.translatezview;


import androidx.annotation.NonNull;


import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;


class TranslateZViewManager extends ViewGroupManager<ZView> {

 
    @Override
    public String getName() {
        return "JJSTranslateZView";
    }
    
    @Override
    protected ZView createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new ZView(reactContext);
    }
    @ReactProp(name = "translateZ",defaultFloat = 0f)
    public void setTranslateZ(ZView view ,float v) {
        view.setTranslateZ(v);
    }

    @ReactProp(name = "translateZParent",defaultFloat = 0f)
    public void setTranslateZParent(ZView view ,float v) {
        view.setTranslateZParent(v);
    }


}
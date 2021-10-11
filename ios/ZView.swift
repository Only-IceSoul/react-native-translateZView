//
//  ZView.swift
//  ReactNativeTranslatezview
//
//  Created by Juan J LF on 10/11/21.
//  Copyright © 2021 Facebook. All rights reserved.
//


import Foundation
import UIKit

@objc(ZView)
class ZView: UIView {
    
    private var mTransZParent:CGFloat = 0
    
    init() {
        super.init(frame: .zero)
    }
    override init(frame: CGRect) {
        super.init(frame: frame)
    }
    
    required init?(coder: NSCoder) {fatalError("init(coder:) has not been implemented")}
    
    
    @objc func setTranslateZ(_ v:NSNumber?){
        let ev = CGFloat(truncating: v ?? 0)
        layer.zPosition = ev

    }
    
    @objc func setTranslateZParent(_ v:NSNumber?){
        let ev = CGFloat(truncating: v ?? 0)
        mTransZParent = ev
        superview?.layer.zPosition = ev

    }
    
    override func layoutSubviews() {
        super.layoutSubviews()
        superview?.layer.zPosition = mTransZParent
    }

}

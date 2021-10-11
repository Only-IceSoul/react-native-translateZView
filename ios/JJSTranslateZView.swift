//
//  JJSTranslateZView.swift
//  ReactNativeTranslatezview
//
//  Created by Juan J LF on 10/11/21.
//  Copyright © 2021 Facebook. All rights reserved.
//

import Foundation
import UIKit

@objc(JJSTranslateZView)
class JJSTranslateZView: RCTViewManager {

    override func view() -> UIView! {
       return ZView()
     }
   override class func requiresMainQueueSetup() -> Bool {
        return true
    }
}

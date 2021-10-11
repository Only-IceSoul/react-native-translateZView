//
//  JJSTranslateZView.m
//  ReactNativeTranslatezview
//
//  Created by Juan J LF on 10/11/21.
//  Copyright © 2021 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "React/RCTViewManager.h"
#import <React/RCTBridgeModule.h>


@interface


RCT_EXTERN_MODULE(JJSTranslateZView,RCTViewManager)

RCT_EXPORT_VIEW_PROPERTY(translateZ, NSNumber)
RCT_EXPORT_VIEW_PROPERTY(translateZParent, NSNumber)


@end

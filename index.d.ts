import React from "react";
import { Constructor, NativeMethods, ViewProps } from "react-native";


interface ZViewProps extends ViewProps {
  
    translateZ?:number
    translateZParent?:number
    
}

declare class ZComponent extends React.Component<ZViewProps> {}
declare const ZViewBase: Constructor<NativeMethods> & typeof ZComponent;

export default class ZView extends ZViewBase {}
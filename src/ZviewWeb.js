import React, { useEffect, useMemo, useRef } from 'react'
import { StyleSheet } from 'react-native'



const ZViewWeb = React.forwardRef((props,ref)=>{

      const localReft = useRef()
      const myRef = ref || localReft
      const {style,translateZ,translateZParent, ...others } = props

      const styleObject = useMemo(()=>{
          if (typeof style === 'number') return StyleSheet.flatten(style) 
          if(Array.isArray(style)){
            var styleJs = {}
            style.forEach((v)=>{
              if(typeof v === 'number'){
                  let ss = StyleSheet.flatten(style) 
                  Object.assign(styleJs,ss)
              }else{
                Object.assign(styleJs,v)
              }
            })
            styleJs.zIndex = translateZ
            return styleJs
          }
          return style
        },[style,translateZ])


        useEffect(()=>{
            if(myRef.current){
               if(myRef.current.parentElement) {
                myRef.current.parentElement.style.zIndex = `${translateZParent}`;
                myRef.current.parentElement.style.overflow = `visible`;
               }
            }
        },[translateZParent])

      return(
          <div  {...others} style={styleObject} ref={myRef} >

          </div>
      )
})

export default ZViewWeb
# TranslateZView

Change the zIndex 

(Useful to change z Index of view that you have no control and faster than the css zIndex)

android: api 21+   
ios : 10.0+   


## Getting started

`$ npm install react-native-translatezview --save`  
`$ react-native link react-native-translatezview`

yarn:

`$ yarn add react-native-translatezview`


## Usage
```javascript
import ZView from 'react-native-translatezview';

// TODO: What to do with the module?
 <ZView {...props}>
```

## Props     
   
Android: Behavior as elevation without shadow  
IOS: The layer’s position.  

| Name  | type | default |  
| --- | --- | --- | --- |  
| translateZ  | Number | 0 |  
| translateZParent | Number | 0 |  

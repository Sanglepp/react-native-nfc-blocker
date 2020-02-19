# react-native-nfc-blocker

## Getting started

`$ npm install react-native-nfc-blocker --save`

### Mostly automatic installation

`$ react-native link react-native-nfc-blocker`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-nfc-blocker` and add `NfcBlocker.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libNfcBlocker.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.nfcblocker.NfcBlockerPackage;` to the imports at the top of the file
  - Add `new NfcBlockerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-nfc-blocker'
  	project(':react-native-nfc-blocker').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-nfc-blocker/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-nfc-blocker')
  	```


## Usage
```javascript
import NfcBlocker from 'react-native-nfc-blocker';

// TODO: What to do with the module?
NfcBlocker;
```

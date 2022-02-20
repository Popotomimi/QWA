import * as React from 'react';
import { Text, View, StyleSheet, TextInput } from 'react-native';
import Constants from 'expo-constants';

// You can import from local files
import AssetExample from './components/AssetExample';

// or any pure javascript modules available in npm
import { Card } from 'react-native-paper';

export default function App() {
     
  return (
    <View style={styles.container}>
      <Text style={styles.corpo}> Email </Text>
      <Text style={styles.paragraph}>
        <TextInput placeholder="Seu nome..." style={styles.textInput} />
        <TextInput placeholder="Seu e-mail..." style={styles.textInput} />
      </Text >
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    paddingTop: Constants.statusBarHeight,
    backgroundColor: 'white',
    padding: 8,
    textAlign: 'center',
  },
  paragraph: {
    margin: 24,
    fontSize: 18,
    fontWeight: 'bold',
    textAlign: 'center',
    backgroundColor: 'white',
  },
  corpo: {
    backgroundColor: '#006557',
    position: 'fixed',
    top: 0 ,
    right: 0,
    left: 0,
    padding: 50,
    color: 'white', 
  },
  textInput: {
    width: '100%',
    height: 40, 
    backgroundColor: 'white',
    border: 'solid 2px ',
    borderRadius: 20,
    paddingLeft: 10,
    marginBottom: 10,
  }
});

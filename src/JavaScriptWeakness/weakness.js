console.log("5" - 3);
console.log("5" + 3); 

//Schwächen:
//Variablen ohne typangaben: Rechnungen werden manchmal unerwartet berechnet wie in diesem beispiel
//Gleitkommazahlen werden in 64-Bit verarbeitet was auch zu problemen führen kann mit ungenauen berechnungen
//Callback hell: Verschachtelte Callbacks im code, kann unübersichtlioch werden
//wenn man var statt let verwendet kann es zu unerwartetem ergebnis führen. man soll eher let verwenden um die fehler schneller zu erkennen weil zb bei var nur "undefined" als fehler kommt
/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

//This example shows attributes of car and its functions

class Car {

    String _name
    String _carName
    int _carModel
    String _carColor

    def getCarDetails(){
        println "Hello $_name"
        println "You car  is " +_carName +", with model $_carModel and color is $_carColor."
    }

    def startEngine(){
        println "Starting engine for $_carName"
        println "Enjoy your ride!!!"
    }

    //Defining main method and created object in a separate Carobject Class.groovy


}

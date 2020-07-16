/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

class InheritanceCars {

//variables
    String _name
    String _carName
    int _carModel
    String _carColor

    //methods
    def startEngine(){
        println "Engine is started for $_carName journey begins yeah."
    }

    def stopEngine(){
        println "Reached to destination, therefor engine is stopped for $_carName"
    }

    def driving(){
        println "Driving $_carName"
    }
}

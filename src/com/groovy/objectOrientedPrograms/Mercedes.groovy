/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

class Mercedes extends InheritanceCars {

    int topSpeed

    def topSpeed(){
        println "Top speed is $topSpeed"
    }

    static void main(String[] args){
        Mercedes mercedes = new Mercedes()
        mercedes._carName = "Mercedes"
        mercedes._carColor = "Black"
        mercedes._carModel = 2020
        mercedes.startEngine()
        mercedes.driving()
        mercedes.topSpeed = 180
        mercedes.topSpeed()
        mercedes.stopEngine()
    }
}

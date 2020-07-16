/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

class Carobjects {


    static void main(String[] args) {

        Car car1 = new Car()
        Car car2 = new Car()
        Car car3 = new Car()

        //adding car1 configurations
        car1._name = "Rutu"
        car1._carName = "Mercedes"
        car1._carColor = "Black"
        car1._carModel =2020

        //adding car2 configurations
        car2._name = "John"
        car2._carName = "Odi"
        car2._carColor = "White"
        car2._carModel =2018

        //adding car3 configurations
        car3._name = "Alie"
        car3._carName = "Ford"
        car3._carColor = "Red"
        car3._carModel =2019

        //calling car1 methods
        car1.getCarDetails()
        car1.startEngine()

        println("========================================")

        //calling car2 methods
        car2.getCarDetails()
        car2.startEngine()

        println("========================================")

        //calling car3 methods
        car3.getCarDetails()
        car3.startEngine()

    }

}

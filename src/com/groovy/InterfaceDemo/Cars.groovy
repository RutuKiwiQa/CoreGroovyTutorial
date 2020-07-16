/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */
package com.groovy.InterfaceDemo

class Cars implements Car {
    @Override
    def startEngine() {
        println "Start"
    }

    @Override
    def stopEngine() {
        println "Stop"
    }

    static void main(String[] a){
        Cars cars = new Cars()
        cars.startEngine()
        cars.stopEngine()
    }
}

/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.abstractDemo

class SubClassCar extends AbstractClassGroovy{

    int topSpeed

    @Override
    def topSpeed() {
        println "Top speed for $_carName is $topSpeed"
    }

    static void main(String[] args){
        SubClassCar subClassCar = new SubClassCar()
        subClassCar._carName = "Mercedes"
        subClassCar.topSpeed = 180
        subClassCar.startEngine()
        subClassCar.topSpeed()
    }
}

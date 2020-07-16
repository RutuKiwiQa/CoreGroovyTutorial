/**
 *  Prepared By : Rutu Shah
 *  Date : 07/07/2020
 */
package com.groovy.BasicGroovy
/**
 * Instance method example
 */

class Methods {

    //Here we will be calling method by creating class object
    static void main(args){
        Methods m1 = new Methods() //create object of class
        m1.myMethod()
    }

    def myMethod(){
        println("Inside my method.")
    }


}

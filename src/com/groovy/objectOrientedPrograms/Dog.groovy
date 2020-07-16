/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

//creating subclass dog for parent class inheritance

class Dog extends Inheritance {

    //adding functionalities of dog

    def barks(){
        println "$_animalName is barking."
    }

    def plays(){
        println "$_animalName is playing ball." //here i am calling dog name from parent class
    }

    def breed(){
        println "Breed of $_animalName is $_animalBreed"
    }
}

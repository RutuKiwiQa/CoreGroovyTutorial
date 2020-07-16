/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

/**
 * Inheritance : - os a process where one class acquires properties (i.e methods and attributes) from another class.
 * Class from where inheritance is done is called parent class, superclass and base class
 * and inherited class is called child class,subclass and derived class.
 *
 * we use extends keyword for inheritance.
 */
//this example will show inheritance by animal example

class Inheritance {

    String _animalName, _animalBreed;

    def eating(){
        println "$_animalName is eating."
    }

    def moving(){
        println "$_animalName is moving."
    }

}

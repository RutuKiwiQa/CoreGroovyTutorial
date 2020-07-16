/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

/**
 * Class and Objects in groovy
 * To begin with,
 * class is a collection of data & methods that represent a real world object.
 */

class Fruits {

    //defining private variables

    String _fruitName
    String _fruitColor

    //defining methods

    def setFruitName(String name){
        _fruitName = name
    }

    def setFruitColor(String color){
        _fruitColor = color
    }

    def getFruitName(){
        println "Name of the fruit is : $_fruitName"
    }

    def getFruitColor(){
        println "Color of the fruit is : $_fruitColor"
    }

    static void main(String[] args){

        //creating objects
        Fruits f1 = new Fruits()
        f1.setFruitName("Mango")
        f1.setFruitColor("Yellow")
        f1.getFruitName()
        f1.getFruitColor()

    }
}

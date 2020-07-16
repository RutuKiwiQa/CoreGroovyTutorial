/**
 *  Prepared By : Rutu Shah
 *  Date : 07/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Methods in Groovy
 *
 * 1.  What is method?
        Method is a block of code , that makes our code modular and reusable.
        Significantly it can take parameters as well as can have a return type.
 Syntax :
        def methodName{
            //code inside method
        }
 * How to create methods?
 * Method parameters
 * Return Type
 * Instance methods
 *
 */

//Example a method to print Hello
def printHello(){
    println("Hello...")
}
//after defining method we need to call them.
printHello()

//Creating a method with parameters

def addition(int a = 10, int b = 20){
    println "Addition is : " +(a+b)
}

addition(5,4)
addition() // will print addition of default parameters.
addition(5) // will print 5 with default parameter b.

//Defining method with return type
def subtraction(int a, int b){
    def c = a - b
    return c
}

def result = subtraction(5,2) // storing subtraction in result variable
println "Substraction is : " +result

//Note: To learn how to call method using class object go to Methods class (Instance Method)


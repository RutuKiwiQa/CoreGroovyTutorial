/**
 *  Prepared By : Rutu Shah
 *  Date : 07/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Conditional Statements also known as Decision making statements
 *
 * In Groovy we have 2 decision making statements
 *   1. if-else and
 *   2.switch case
 *
 * In Groovy we have control structers and
 * Conditional Statements
 * Looping and
 * Exception Handling are part of it.
 *
 *  Reference Link : https://groovy-lang.org/semantics.html
 */

//1. If -else
/**
 * Groovy supports usual if-else statements from java
 *
 * Syntax
        if(condition){
            //Code to execute
        }else{
            //Code to execute
        }

 * Groovy also supports the normal Java "nested" if then else if syntax:
         if ( ... ) {
         ...
         } else if (...) {
         ...
         } else {
         ...
         }
 * */

//Example to check whether number is positive or negative

def num = 10
if (num > 0){
    println("Number is positive")
}else{
    println("Number is negative")
}

//Same program using nested if - else to check whether num is positive, negative or zero

def num1 = 0

if (num1 > 0){
    println("Positive")
}else if (num1 == 0){
    println("Zero")
}else {
    println("Negative")
}

// Switch Case
/**
 * The switch statement in Groovy is backwards compatible with Java code;
 * so you can fall through cases sharing the same code for multiple matches.
 *
 * One difference though is that the Groovy switch statement can handle any kind of switch value
 * and different kinds of matching can be performed.
 */

def x = 10
def result = ""

switch (x){
    case 0:
       result = " x is zero"
        break
    case {x>0}:
        result = "X is positive"
        break
    case {x<0}:
        result = "X is negative"
        break
    default:
        result = "Invalid number"
}

println(result)

/**
 * Switch supports the following kinds of comparisons:
 *
 * Class case values match if the switch value is an instance of the class
 *
 * Regular expression case values match if the toString() representation of the switch value matches the regex
 *
 * Collection case values match if the switch value is contained in the collection. This also includes ranges (since they are Lists)
 *
 * Closure case values match if the calling the closure returns a result which is true according to the Groovy truth
 *
 * If none of the above are used then the case value matches if the case value equals the switch value
 *
 * When using a closure case value, the default it parameter is actually the switch value (in our example, variable x).
 *
 * */
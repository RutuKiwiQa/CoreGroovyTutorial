/**
 *  Prepared By : Rutu Shah
 *  Date : 08/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Groovy closures
 *
 * What are closures
 *  A closure is a block of code that can take parameters, refer variables,
 *  return values and can be passed as parameter in the method.
 * How to use closures
 * why do we use closures
 *
 * Reference Links : https://groovy-lang.org/closures.html#:~:text=A%20closure%20in%20Groovy%20is,declared%20in%20its%20surrounding%20scope.
 *  https://medium.com/@dis_is_patrick/practical-uses-for-closures-c65640ae7304
 */

//Create closure

def str = "Hello"

def myClosure1 = {
    println "Helllo world.."
}

// after calling we need to call closure
myClosure1.call()

//We can also pass parameters in closure

def myClosure2 = {
    name -> println "Hello  ${name}"
}

//calling second closure
myClosure2.call("Rutu") //passed parameter name "rutu" in closure

//We can also refer from variable
def myClosure3 = {
    name1 -> println "$str $name1"
}
//calling closure
myClosure3.call("Rutu")

//Note : we cannot refer the variables into methods directly, however in closure we can refer variables directly.

//Passing closure parameters in methods

def myMethod(closure){
    closure.call("Calling Groovy from method")
}

myMethod(myClosure2)

//We can also have return type in closure
def myClosure4 = {
    a,b,c ->
            return (a+b+c)
}

def resultOFClosure4 = myClosure4(10,20,30)
println "Result of closure 4 : " +resultOFClosure4

//closure inlist
def myList = ["Orange","Banana","Mango","Apple","Watermelon", "Chiku"] //defining the list
println myList.each { it } //printing the list using .each which is used to print each and every element in closure

//closure in maps
def myMaps = [
        'subject' : 'groovy',
        'topic' : 'closure'
] //creating maps

// calling the maps and printing it using closure

println myMaps.each { it }

//some other functions which can be directly used in closures.

//creating a list
def myList2 = [1,2,3,4,5]
//here the variable name is item
println myList2.find { item -> item == 3} //it will find the element which is 3 in list and print it
println myList2.find {item -> item == 6 }// it is calling the element not present in list so it will return null
println myList2.findAll {item -> item > 3} // it will find all the elements greater then 3 and print it
println myList2.any {item -> item > 3} // it will check if elements greater then 3 are there, if yes then will print true else print false
println myList2.any {item -> item > 5} // it will check if elements greater then 5 are there, if yes then will print true else print false
println myList2.every {item -> item >3 }//it will return true only if all the elements in list are greater then 3, else it will return false
println myList2.collect{ item -> item * 2 } //it will multiple every item by 2 in the list and print it


//Note : Closure is not only present in groovy, but we can also use in javascript as well

//closure program to check even odd
def isOdd = { int i -> i%2 != 0 }
println isOdd(3)
assert  isOdd(3) == true
println isOdd.call(2)
assert  isOdd.call(2) == false

def isEven = { it%2 == 0 }
println isEven(3)
assert isEven(3) == false
println isEven.call(2)
assert isEven.call(2) == true


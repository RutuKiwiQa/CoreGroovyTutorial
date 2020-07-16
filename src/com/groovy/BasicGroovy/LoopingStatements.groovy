/**
 *  Prepared By : Rutu Shah
 *  Date : 07/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Loops in Groovy
 *
 * for, for in and while loop
 *
 * We also have some keywords to perform some single operations like
 * upto, times and step
 *
 * Reference Link :  https://groovy-lang.org/semantics.html
 */

//For Loop
println("==================Normal for loop ====================")
for (int i = 1;i<=5;i++){
    println(i)
}
println("==================Using def keyword in for loop ====================")
//We can also use def keyword here
for(def i = 1; i<=5;i++){
    println(i)
}

println("==================Using for in loop ====================")
for (a in 1..5){
    println a
}

println("====================upto keyword=======================")
1.upto(5)
        {
            println "$it"  //$it is used to print in iterations
        }

println("====================times keyword=======================")
    5.times {
    println "$it" //5.times will iterate the loop 5 times
    }

println("====================step keyword=======================")


/**
 * Syntax
    Number.step(to, stepnumber){
    Number means the starting num, to means number upto which we want to iterate,
    stepnumber means the number of steps to do.
 }
 */

1.step(20,2){
    println "$it" //here 1 is the starting num and will print till 20 by taking step = 2
}

//for in loop iterate over a list
println("===================iterator over a list for in=============")
x = 0
for ( i in [0, 1, 2, 3, 4] ) {
    x += i //x=x+i //0=0+0 //0 //0+1 = 1 //1+2=3//3+3=6//6+4=10
    println(x)
}
assert x == 10

println("for in iterator over an array.")
// iterate over an array
def array = (0..4).toArray()
x = 0
for ( i in array ) {
    x += i
    println(x)
}
assert x == 10

//iterator over a map
println("=========iterator over a map========")
def map = ['abc':1, 'def':2, 'xyz':3]
x = 0
for ( e in map ) {
   // println(e)
    x += e.value
  //  println(e.value)
    println(x)
}
assert x == 6

def nameMap = ["name : Rutu ", "subject:groovy"]
for (n in nameMap){
    println(n)
}

println("===============iterator in characters==============")

// iterate over the characters in a string
def text = "abc"
def list = []
for (c in text) {
    list.add(c)
    println(list)
}
assert list == ["a", "b", "c"]

//While Loop
println("=================while loop===================")
int i = 1
while (i<=6){
    println(i)
    i++
}
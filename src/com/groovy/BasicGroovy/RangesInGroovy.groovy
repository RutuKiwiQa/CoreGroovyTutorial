/**
 *  Prepared By : Rutu Shah
 *  Date : 08/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Ranges in groovy
 * ranges is also one of the collection type .
 *
 * used whenever we want to create a list of sequential values
 * denoted by first and last value of the sequence
 *
 * There are 2 types of ranges inclusive and exclusive
 * Example 1..10 -> is an inclusive range and it will contain the digits 1 to 10
 * however 1..<10 is an exclusive range and it will not include 10, it will only contain 1 to 9.
 *
 * Therefore inclusive is denoted by (..) and exclusive is denoted by (..<)
 *
 * Reference Link : https://www.tutorialspoint.com/groovy/groovy_ranges.htm
 */

//Example
def range = 1..10

println "Printing range : " +range
println "Size of range : " +range.size()
println "Start sequence of range : " +range.getFrom() //getFrom() is used to get start sequence of the range
println "End sequence of range : " +range.getTo() //getTo() is used to get end sequence of the range

//we can also assert this range
assert range.from ==1
assert range.to ==10

println "Printing range at particular position : " +range.get(3)
println "Printing range at particular position : " +range[3]

println "To check whether range contains particular value : " +range.contains(5)
println "To check whether range is reverse or not : " +range.isReverse()

//if range is not reverse, let us reverse the range first
def reverseRange = 10..1
println "To check whether range is reverse or not : " +reverseRange.isReverse()

//we can also create another range from the existing range
def newRange = range.subList(3,7)
println "Start sequence of range : " +newRange.getFrom()
println "End sequence of range : " +newRange.getTo() //getTo() is used to get end sequence of the range

//iterate on a range
for (i in range){
    println i
}

println("=====Range in closure=====")
range.each { i ->
    println "Value is  $i"
}

//range is the instance of java.util.list
println range instanceof java.util.List //it should return true



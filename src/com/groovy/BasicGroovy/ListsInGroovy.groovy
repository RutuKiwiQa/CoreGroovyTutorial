/**
 *  Prepared By : Rutu Shah
 *  Date : 08/07/2020
 */
package com.groovy.BasicGroovy
/**
 * Lists in Groovy
 *
 * A list is a collection datatype.
 * A list is structure to store collection of data items,
 * that means you can store multiple elements or multiple data items.
 * Syntax :
        [obj1, obj2, obj3....and so on] which can be of any data type , int , float,string ,etc
 Example
    [1,2,3,4] - > List of integers
    ["Orange","Banana"] - > List of strings
    [1,2,3,4,5,['A','B','C']6,7,8,9,10] -> Nested List
    [1,2,"Test",3.4] -> known as hyterogenous list or list of objects.
    [] -> Empty List

 */

//Example
//creating a list of colors
def color = ["Red","Green","Blue","Black","White"]

//print using indexes
println color[2] // it will print element at index position 2.ie. blue
println color.get(1) // we can even get index using get() index method

def myList = [1,2,3,['A','B',"Groovy"],4]

println myList[3] // print another list
//in order to print groovy we will do
println myList[3][2]
// we can do the same using get(index) method
println myList.get(3).get(2)

println myList[0..2] //it will print all the elements starting from index position 0 and print till 2
println myList[4..2] // print from backwards

// to check for contains whether it is containing elements or not
println myList.contains(2) //return if list has 2
println myList[3].contains("Groovy")

println myList.size() // check the size of the list
// to get size of internal list
println myList[3].size()

//To add elements in list
myList.add(30)
println myList

// adding using << =>concatination operator
myList<<40
println myList

// adding element at some index position
myList.add(3,67) // adding 32 at index position 3
println myList

//we can also remove the element using index position
myList.remove(5)
println myList

//we can also add elements in list using "+" operation
myList = myList + [50,60]
println myList

//we can also add elements in list using "plus" operation
myList = myList.plus(70)
println myList

// we can also use "-" operation to remove elements from list
myList = myList - [50,60]
println myList

//we can also remove elements from list using "minus"
myList = myList.minus(70)
println myList

//we can also use stack functions like pop that will remove first element from the list
myList.pop()
println "Pop List : " +myList

//we can also remove last item from the list using "removeLast" function
myList.removeLast()
println "Remove Last : " +myList

//we can also match and return intersecting elements from the list
def myList2 = [1,2,3,4]
println "Checking list intersection : " +myList.intersect(myList2)

//we can also reverse the elements of list
def reverseList = [1,24,56,67,576,78,57,88,42,45]
reverseList = reverseList.reverse()
println "Reverse List : " + reverseList // it will reverse the list

//we can also sort the elements of list
def sortList = [1,24,56,67,576,78,57,88,42,45]
sortList = sortList.sort()
println "Sort List : " + reverseList

//we can also check whether or list is empty or not, if it is not empty it should return false
println "Checking List empty or not : " + sortList.isEmpty()

//Note : we can also clear the list using clear() function
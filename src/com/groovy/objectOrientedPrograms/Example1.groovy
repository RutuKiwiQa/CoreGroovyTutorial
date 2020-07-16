/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.objectOrientedPrograms

//This example contains student name and marks of two subjects, and it will print total of two subjects.
class Example1 {

    String _studentName
    int _sub1, _sub2

    def printTotal(){
        int total = _sub1+_sub2
        println "Hello $_studentName your total score is : " +total
    }
     static void main(String[] args) {

         Example1 obj = new Example1()
         //calling variable through object and passing its value
         obj._studentName = "Rutu"
         obj._sub1 = 99
         obj._sub2 = 98
         obj.printTotal()

         //we can also have multiple objects

         Example1 obj2 = new Example1()
         obj2._studentName = "Student2"
         obj2._sub1 = 89
         obj2._sub2 = 78
         obj2.printTotal()


         Example1 obj3 = new Example1()
         obj3._studentName = "Student3"
         obj3._sub1 = 49
         obj3._sub2 = 58
         obj3.printTotal()
    }
}

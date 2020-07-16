/**
 *  Prepared By : Rutu Shah
 *  Date : 07/07/2020
 */
package com.groovy.BasicGroovy

/**
 * Exception Handling in groovy
 * In groovy we use
 * try-catch block
 * try-catch-finally block
 * try-finally block
 * lets learn all this with example
 *
 * Reference Link : https://groovy-lang.org/semantics.html
 */

//Example of divide by zero in try-catch
println("==================Inside Try Catch==========================")
try {
    int i = 1/0

}catch(Exception e){
    println("Inside catch block")
    println e.getCause()  //getCause() method is used to get cause of the exception
    println e.getMessage() //getMessage() method is used to get messaage for the exception
   // e.printStackTrace() //stacktrace will give you the entire information of the exception caused including the line on which exception was handled.
}

println "Outside try-catch block of Arithmetic"

//Multiple catch block
/**
 * One can have multiple catch blocks to handle multiple types of exceptions. For each catch block,
 * depending on the type of exception raised you would write code to handle it accordingly.
 *
 * Let’s modify our above code to catch the ArrayIndexOutOfBoundsException specifically. Following is the code snippet.
 */
println("==================Inside Multiple Catch Block==========================")
try {
 def arr = new int[3]
    arr[5] = 5;
}catch(ArrayIndexOutOfBoundsException ae){
    println("Catch ArrayIndexOutOFBoundException.")
}catch(Exception e){
    println("Catch exception.")
}

println("Outside try catch-block of ArrayIndexOutOFBoundException.")

//Finally Block
/**
 * The finally block follows a try block or a catch block.
 * A finally block of code always executes, irrespective of occurrence of an Exception.
 *
 * Using a finally block allows you to run any cleanup-type statements that you want to execute,
 * no matter what happens in the protected code. The syntax for this block is given below.
 *
 * Syntax

     try {
     //Protected code
     } catch(ExceptionType1 e1) {
     //Catch block
     } catch(ExceptionType2 e2) {
     //Catch block
     } catch(ExceptionType3 e3) {
     //Catch block
     } finally {
     //The finally block always executes.
     }
 */

//Example
println("==================Inside Try Catch finally==========================")
try {
    def arr = new int[3]
    arr[5] = 5;
}catch(ArrayIndexOutOfBoundsException ae){
    println("Catch ArrayIndexOutOFBoundException.")
}catch(Exception e){
    println("Catch exception.")
} finally{
    println("Inside Finally.")
}

println("Outside try catch-block of ArrayIndexOutOFBoundException.")

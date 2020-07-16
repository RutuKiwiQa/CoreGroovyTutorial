/**
 *  Prepared By : Rutu Shah
 *  Date : 12/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Input output in groovy, where input is used to take input from user
 * and output is used to print output on console
 */

print "Enter your name : "
def name = System.console().readLine() //it will take your input

println "Hello $name" // print your name

//Note : if we will get error of null pointer in ide, therefore we will run this program through cmd
/**
 * Steps :
 * 1. Go to cmd
 * 2. Enter groovy Filename.groovy and click on enter.
 */

/**
 * For output we have seen
 * print, println and printf
 * where print - > will print on same line
 * println - > will move the cursor to the next line(used when we want to print statements in newline)
 * printf is similar to c language's printf output keyword.
 *
 Example :
 def name = "Rutu"
 printf "My name is %s \n " +name
Here %s - > used for string
 %d -> used for double
 %.2f -> floating point with 2 decimal num
 \n -> for new line

 Reference Link : https://alvinalexander.com/programming/printf-format-cheat-sheet/
 */



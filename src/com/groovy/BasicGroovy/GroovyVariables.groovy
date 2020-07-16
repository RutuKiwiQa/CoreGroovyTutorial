/**
 *  Prepared By : Rutu Shah
 *  Date : 06/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Variables are used to store information and
 * this variables can be of different types
 * eg. String, boolean, Number and so on.
 */

/** NOTE : Normal print is used to print statements without new line, whereas
 * using println we can print statements in a new line
 **/

//1. To define variables we use keyword def
def name = "Rutu" //I have created a variable called name

//2. Printing this name variable using parenthesis
println(name)

//3. We can also print the name without using parenthesis.
println "printing name without using parenthesis : " + name

//4. We can also use datatypes
String name1 = "Rutu"
println "With using data type : " +name1 //using data type string

//5. We can also declare variable without using datatype
name2 = "Rutu"
println "Without using data type : " +name2

//6. Printing name inside double quotes and single quotes

println "Name is ${name} inside single quote print statement." // we pass variable inside print statement using  syntax ${variable_name}

println 'Name is ${name} inside single quote print statement.' // The only difference between single quote and double quote is it in single quote it will print the syntax.

/**7. How to name variables?
* using letters, digits and underscore
 * groovy is case sensitive language.
 * */

//8. Groovy is dynamically typed language
def toy = "minion"
toy = 100
println toy

//9. Multiple assignments in groovy
def (a,b,c) = [30,40,50]
println a
println b
println c

//10. Multiple assigments in groovy using datatypes
def (String a1, int b1, double c1) = [30,40,50]
println a1
println b1
println c1
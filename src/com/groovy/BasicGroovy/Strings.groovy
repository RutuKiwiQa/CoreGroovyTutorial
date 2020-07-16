/**
 *  Prepared By : Rutu Shah
 *  Date : 07/07/2020
 */

package com.groovy.BasicGroovy

/**
 * A String literal is constructed in Groovy by enclosing the string text in quotations.
 *
 * Groovy offers a variety of ways to denote a String literal.
 * Strings in Groovy can be enclosed in single quotes (’), double quotes (“), or triple quotes (“””). Further, a Groovy String enclosed by triple quotes may span multiple lines.
 *Reference Link : https://groovy-lang.org/semantics.html#_strings
 */

def name = "Rutu"
println name
println "My name is : " +name
println "My name is : " .concat(name)
println "My name is : ${name}"
println "My name is : $name"

//triple double quotes and single quotes in string are used when we want to use multiple lines

def s1 = """Today is tuesday and
we are learning strings in groovy using triple double quotes."""

println("============================")
def s2 = '''Today is tuesday and
we are learning strings in groovy using triple single quotes.'''
println s1
println s2

println("==================Other String functions==================")
println "Length of String is : " +name.length()
println "To get a character using index position : " +name[2]
println "By passing negative index it will give character from back : " +name[-3]
println "To know index position of any character we have indexOF function : "
println "Index of u : " +name.indexOf('u')
println name[0..2] // will print characters from index 0 till 2
println name[3..2]//will print from reverse
println name[0,3,2] //will print characters for given index
println name.substring(2) // will print from index position 2
println name.substring(1,3) // will print characters from index 1 to index 3

def str = "This is my groovy tutorial."

println str.split(" ")//splitting string with space
println str - ("groovy") // this will print the string without groovy

println str.replace("tutorial","session") // this will replace tutorial with session
println str.toLowerCase() //will convert entire string into lower case
println str.toUpperCase() //it will convert entire string to upper case
println str.toList() // will convert entire string to list
println "Rutu" *3 // it will print rutu 3 times
println "Groovy".equals("Groovy") // will check whether it is equal or not, if equal then it will return true else false
println "Groovy".equals("groovy") // will return false, because groovy is case sensitivw
println "Groovy".equalsIgnoreCase("groovy") // will return true
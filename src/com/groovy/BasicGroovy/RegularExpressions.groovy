/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Regex are patterns used to find substrings in a text
 * In groovy we use symbol ~ "expression".
 */

def match = "Groovy" =~ "o"

println "Printing directly matcher : " + "Groovy" =~ "Groovy"
println match[0]

//printing without match
def match1 = "Groovy" =~ "123"
if (match1){
    println match1[0]
}else {
    println "No match found"
}

//to print until match is found
if (match){
    def i = 0
    while (match){
        println match[i]
        i++
    }
}else {
    println "No match found"
}
/**
 *  Prepared By : Rutu Shah
 *  Date : 12/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Files in groovy
 * How to read files in groovy
 * 1. How to read file as String
 * 2. How to read file as List
 * 3. How to read file as Array
 * 4. How to read file line by line
 * 5. How to delete file
 */

// Reading files

//1. seting file path
String filepath = "E:\\GROOVY_TUTORIAL\\Files\\file1.txt" //file path
File myfile = new File(filepath) // defining class file

//2. reading entire content as a string
println myfile.text // this will read entire file and print its content

//collect the lines into list
def list = myfile.collect { it } //collect is used to file data into list
println "List is : " +list

//storing file content in an array
def array = myfile as String[] // storing my file as string array
println "Array is : $array"

//read file into a list of String
def lines = myfile.readLines() //readlines will store list into string
println "Lines : $lines"

//read file line by line
//eachLine closure is used to read, line by line
myfile.eachLine { line ->
    println "Line : $line"
}

// read file line by line with line no also
myfile.eachLine { line,lineNo ->
    println "$lineNo : $line"
}

//adding lines based on range
def lineNoRange = 2..4
def linelist = []
myfile.eachLine { line,lineNo ->
    if (lineNoRange.contains(lineNo))
        linelist.add(line)
    //println "$lineNo : $line"
}
println "linelist : $linelist"

//read with reader
def line
myfile.withReader { reader ->
    while((line = reader.readLine()) != null )
        println "Line with reader : $line"
}

//reading with new reader function //creating new file
def outputFile = "E:\\GROOVY_TUTORIAL\\Files\\file2.txt"
def reader = myfile.newReader()
new File(outputFile).append(reader)
reader.close() //manually closing the reader

//when working with binary files and you want to read of show content as bytes
byte [] contents = myfile.bytes
println contents

//to get size in byes
println "file size in bytes : "  +myfile.length()

//to check whether my file is a file or directory
println "To check whether myfile is file or not : " +myfile.isFile()

println "To check whether myfile is directory or not : " +myfile.isDirectory()

//get list of files from a directory
try {
    new File("E:\\GROOVY_TUTORIAL\\Files").eachFile {
        files -> println files.getAbsolutePath() //getAbsolutePAth is used to get path of file directory
    }
}catch(Exception e){
    println "No file found, please add another path"
}


//recursively display all files in a directory or subdirectory
try {
    new File("E:\\GROOVY_TUTORIAL\\Files").eachFileRecurse {
        files -> println files.getAbsolutePath() //getAbsolutePAth is used to get path of file directory
    }
}catch(Exception e){
    println "No file found, please add another path"
}

//copy file data to another file
def newFile = new File("E:\\GROOVY_TUTORIAL\\Files\\file3.txt") //file path to create new file
newFile << myfile.text

def newFile1 = new File("E:\\GROOVY_TUTORIAL\\Files\\file4.txt") //file path to create new file
newFile << myfile.text

//delete the file
newFile1.delete()

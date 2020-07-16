/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.BasicGroovy

/**
 * How to write files in groovy
 */

//Creating file in groovy
File myFile = new File("E:\\GROOVY_TUTORIAL\\Files\\writefile1.txt")

myFile.write("This is line 1 written in file using write() file function, " +
        "\n run this program and go the location as mentioned above" +
        "\n you will find file created by name writefile1 with this lines.....")

myFile << "\n This is new line using left shift operator. "

//we can also write into file using  myfile.text() function
myFile.text = "This line is written using myfile.text() function and it will overwrite the entire file content."

//we can also write into file using withWriter() closure
myFile.withWriter {
    writer ->
        writer.writeLine("This line is written using withWriter closure and it will overwrite the entire file content.")
}

//using append
myFile.append("This line is written using append.")

//to get length of file in bytes
println "Length of file in bytes : " +myFile.length()

println "To check whether it is file or not : " +myFile.isFile()

println  "To check whether it is directory or not :" +myFile.isDirectory()

println "To check whether file is hidden or not :" +myFile.isHidden()

//we can print the content on console using
println myFile.text



//to push or copy the data into new file
def newFile = new File("E:\\GROOVY_TUTORIAL\\Files\\writefile2.txt") //create a file
newFile << myFile.text //copyfile

//remove the file or make my file empty
newFile.bytes = [] //removing data from file

//delete file using filename.delete()

println "Content of newFile : " +newFile
/**
 *  Prepared By : Rutu Shah
 *  Date : 08/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Maps in Groovy
 *
 * Maps are another collection type in groovy like list.
 * Maps is unordered collection
 * The elements in a Map collection are accessed by a key value.
 * The keys used in a Map can be of any class. When we insert into a Map collection, two values are required: the key and the value.
 * Syntax : ['key' :'value']
 *
 * Example ['language' : 'groovy'] where language is keyname and groovy is value of the key
 * We can also create empty map : [ : ] --> Empty Map.
 *
 * Reference Link : https://www.tutorialspoint.com/groovy/groovy_maps.htm
 */

//Examples creating maps in groovy

def programming = [
        'language1' :'Groovy',
        'language2' : 'Java']

//printing the map
println "Printing the map : " + programming

//To access any value from map, we can simply say keyname
println "Accessing value : " +programming.language1 // it will return name of language1

//other methods to access values from key
println "language 1 : " + programming['language1']
println "language 2 : " + programming['language2']
println "language 1 : " +programming.get('language1')
println "language 2 : " +programming.get('language2')
println "language 1 : " +programming.getAt('language1')
println "language 2 : " +programming.getAt('language2')

//to get size of map we have size() function
println "Size of map : " +programming.size()

//to add another key-value pair in map we have 'put' function
programming.put('language3','Python')
println "Adding third language in map : " + programming

//we can also check existence of key and value in map using containsKey and containsValue function
println("==========================Valid key value===================================")
println "Contains Key : " +programming.containsKey("language1") //it will check whether the map has key language1
println "Contains Value : " +programming.containsValue("Groovy") // it will check whether the map has value groovy

println("==========================InValid key value===================================")
println "Contains Key : " +programming.containsKey("language") //it will check whether the map has key language
println "Contains Value : " +programming.containsValue("c++") // it will check whether the map has value groovy
//Note containsKey and containsValue will give true on false as output based on the value

println programming.getClass() //gives the class from where groovy maps are implemented.

//we can also clone the map
def newProgram = programming.clone() // here newProgram map will clone entire map programming map into newProgram and print
println "Cloned map : " +newProgram


//we can also iterate through the maps using key and value

programming.each {
    key,value ->
        println "$key" : "$value"
}

//printing map with key,value and index
//println "printing map with key,value and index"
//programming.eachWithIndex { key, value, int i ->
//    println "$i" "|" "$key" : "$value"
//}

println "Print with entry"
programming.each {entry ->
    println "$entry.key" : "$entry.value"
}

//println "Print maps with entry as well as index"
//programming.eachWithIndex { entry, int i ->
//    println "$i" "|" "$entry.key" : "$entry.value"
//}

def map1 = ['a' :1, 'b' : 2]

def entries = map1.entrySet()

entries.each { entry ->
    assert entry.key in ['a','b']
    assert entry.value in [1,2] //checks presence of keys and values in the set
}

def map2 = ['test' : 'selenium']
println map2
map2.clear()
//clear the map
println "Empty Map : " +map2


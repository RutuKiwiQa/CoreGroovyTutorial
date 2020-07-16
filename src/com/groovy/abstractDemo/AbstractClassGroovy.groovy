/**
 *  Prepared By : Rutu Shah
 *  Date : 16/07/2020
 */

package com.groovy.abstractDemo

/**
 * What is abstract class
 * An abstract class is a class that is declared abstract — it may or may not include abstract methods.
 * Abstract classes cannot be instantiated, but they can be subclassed.
 * An abstract class may have static fields and static methods
 *
 *
 * Features of abstract class
 * 1. An abstract class must be declared with an abstract keyword.
 * 2. It can have both abstract and non-abstract methods.
 * 3. It cannot be instantiated.
 * 4. It can have final methods.
 * 5. It can have constructors and static methods also.
 *
 *
 * When to use abstract class?
 * Abstract class provides a template for future specific classes.
 * Use an abstract class to provide default behaviors (Code reusability)
 * Abstract class defines common interface for its subclasses
 * Abstract operations (methods) can be declared and their, implementation can be provided later in concreate classes.
 * Abstract classes are useful when creating components because they allow us to specify an invariant level of functionality in some methods, but leave the implementation of other methods until a specific implementation of that class is needed.
 * When creating a class library which will be widely distributed or reused especially to clients, use an abstract class in preference to an interface; because it simplifies versioning. This is the practice used by the Microsoft team which developed the Base Class library.

 Reference Link : https://stackoverflow.com/questions/3344816/when-and-why-to-use-abstract-classes-methods

 */

abstract class AbstractClassGroovy {
    String _carName
    int _carModel
    String _carColor

    //methods
    def startEngine(){
        println "Engine is started for $_carName journey begins yeah."
    }

    //defining abstract method
    abstract def topSpeed();
}

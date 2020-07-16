/**
 *  Prepared By : Rutu Shah
 *  Date : 07/07/2020
 */

package com.groovy.BasicGroovy

/**
 * Operators in groovy
 *
 * Operators are symbol that tell the compiler to perform some
 * specific operation
 *
 * Types of operators
 * 1. Arithmetic Operators
 * 2. Relational Operators
 * 3. Logical Operators
 * 4. Bitwise Operators
 * 5. Conditional Operators
 * 6. Object Operators
 * 7. Regular expression operators
 * 8. Other operators
 *
 *  Reference Link : https://groovy-lang.org/operators.html
 */

//1. Arithmetic Operators

//assert is a statement that is use to check whether right hand side is equals to left hand side.
//Normal arithmetic operators
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8
assert 9.intdiv(5) == 1

//it will only print false in output if something is wrong, for true statements it will not print anything

//Groovy also provides some other operators like
assert 2.2.plus(1.1) == 3.3
assert 3.3.minus(1.1) == 2.2

//Unary Operators
//The + and - operators are also available as unary operators:
assert +3 == 3
assert -4 == 0 - 4

assert -(-1) == 1

//Increment ++ and Decrement -- Operators

int i = 10;
println "Post increment assigning increment : " +i++; // post increment. i.e it will increment the value after assigning it //10
println "After assigning " + i //11

println "Pre - increment : " + ++i;//12 bcz i=11

//The postfix increment will increment a after the expression has been evaluated and assigned into b
def a = 2
def b = a++ * 3
assert a == 3 && b == 6

//	The postfix decrement will decrement c after the expression has been evaluated and assigned into d
def c = 3
def d = c-- * 2
assert c == 2 && d == 6

//The prefix increment will increment e before the expression is evaluated and assigned into f
def e = 1
def f = ++e + 3
assert e == 2 && f == 5

//	The prefix decrement will decrement g before the expression is evaluated and assigned into h
def g = 4
def h = --g + 1
assert g == 3 && h == 4

//Assignment Operators
/**
 * The binary arithmetic operators we have seen above are also available in an assignment form:
 *
 * +=
 *
 * -=
 *
 * *=
 *
 * /=
 *
 * %=
 *
 * **= //power
 *
 * */

def a1 = 4
a1 += 3 //a1 = a1 + 3 .i.e 4 + 3 ==7
assert a1 == 7

def b1 = 5
b1 -= 3 //b1 = b1-3
assert b1 == 2

def c1 = 5
c1 *= 3 // c1 = c1 * 3
assert c1 == 15

def d1 = 10
d1 /= 2   //d1 = d1 / 2
assert d1 == 5

def e1 = 10
e1 %= 3 //e1 = e1 % 3
assert e1 == 1

def f1 = 3
f1 **= 2  //f1 = f1**2
assert f1 == 9

//2. Relational Operators
/**
 * Relational operators allow comparisons between objects, to know if two objects are the same or different, or if one is greater than, less than, or equal to the other.
 *
 * The following operators are available:
 *
 * Operator	Purpose
 * == equal
 *
 * !=  different
 *
 * < less than
 *
 * <= less than or equal
 *
 * > greater than
 *
 * >= greater than or equal
 *
 * === identical (Since Groovy 3.0.0)
 *
 * !== not identical (Since Groovy 3.0.0)
 *
 * Here are some examples of simple number comparisons using these operators:
 */

assert 1 + 2 == 3
assert 3 != 4

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//3. Logical operators
/**
 * Groovy offers three logical operators for boolean expressions:
 *
 * &&: logical "and"
 *
 * ||: logical "or"
 *
 * !: logical "not"
 *
 * Let’s illustrate them with the following examples:
 * */

assert !false //not false is true
assert true && true // true && true is true
assert true || false  //true or false is true

//Precedence
//The logical "not" has a higher priority than the logical "and".

assert (!false && false) == false //means first !false will be executed i.e !false means true and then true && false == false

//The logical "and" has a higher priority than the logical "or".

assert true || true && false // && will be executed first i.e true && false == false and then true || false = true

/**
 * Short circuiting
 *
 * The logical || operator supports short-circuiting: if the left operand is true,
 * it knows that the result will be true in any case, so it won’t evaluate the right operand.
 * The right operand will be evaluated only if the left operand is false.
 *
 * Likewise for the logical && operator: if the left operand is false,
 * it knows that the result will be false in any case, so it won’t evaluate the right operand.
 * The right operand will be evaluated only if the left operand is true.
 *
 * */

//Example of short circuiting
boolean checkIfCalled() {
    called = true   //We create a function that sets the called flag to true whenever it’s called
}

called = false
true || checkIfCalled()
assert !called

called = false
false || checkIfCalled()
assert called

called = false
false && checkIfCalled()
assert !called

called = false
true && checkIfCalled()
assert called

//4. Bitwise operators
/**
 * Groovy offers 4 bitwise operators:
 *
 * &: bitwise "and"
 *
 * |: bitwise "or"
 *
 * ^: bitwise "xor" (exclusive "or")
 *
 * ~: bitwise negation
 *
 * Bitwise operators can be applied on a byte or an int and return an int:
*/

//Example
int a2 = 20;
int b2 = 25
println(a2 & b2) // output will be 16 let us understand how?

//Convert the above variable values 20 and 25 to binary

println "Binary of 20  is : " + Integer.toBinaryString(20)  //10100
println "Binary of 25 is : " + Integer.toBinaryString(25)   //11001
                                    //Perform bitwise and here  10000 convert it to integer

println "Back to integer : " + Integer.parseInt("10000",2)

//5. Conditional Operators
/**
 * The "not" operator is represented with an exclamation mark (!) and inverts the result of the underlying boolean expression.
 * In particular, it is possible to combine the not operator with the Groovy truth:
 * */

assert (!true)    == false //the negation of true is false
assert (!'foo')   == false //'foo' is a non empty string, evaluating to true, so negation returns false
assert (!'')      == true //'' is an empty string, evaluating to false, so negation returns true

//Ternory Operator
def result = (2> 0) ? " Greater " : "Not Greater"
println result

def result1 = (2 > 4 ) ? "Greater" :"Not Greater"
println result1

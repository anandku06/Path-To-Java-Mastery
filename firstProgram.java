// package com.company -> A package in Java is used to group related classes. Think of it as a folder in a file directory

public class firstProgram{
    public static void main(String[] args) { // Starting-point function
        System.out.println("Hello World!!");
    }
}

/* basically 'public static void main' is like entry point of the execution for the Java program 
    - public -> an access modifier ; this methods can be accessed publically
    - static keyword -> without making any instance(object) of the class, the class's method can be used.
    - void keyword -> return type of the function ; specifies that the function won't return a thing

We made a class named 'firstProgram' with the same file name and it has a function 'main' and this all is grouped under the package 'com.company'

Basic Structure of a Java Program -> made of two things
- Functions : A piece of code that does a specific task like addition, subtraction
    use camelCasing eg. collegeStudent, etpMarks, etc.

- Classes : A collection of similar type of methods(functions) or properties that represents a group
    works as a template for making objects
    use Pascal Casing eg. Main, Marks, Student, etc.


*/
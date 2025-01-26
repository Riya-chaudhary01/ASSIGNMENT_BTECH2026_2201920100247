# ASSIGNMENT_BTECH2026_2201920100247
Problem 1(HackerRank)

Problem Statement ::

Write the following code in your editor below: A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum. A class named Adder that inherits from a superclass named Arithmetic. Your classes should not be public.

Coding Platform :: HackerRank

Approach and Explaination :: The problem is require to create classes Arithmetic and Adder

where Arithmetic class will have method add(int a, int b) to add two input number.
While Adder class will acts as sub class of Arithmetic
Approach :: Inheritance

Here Adder class will extend Arithmetic, which means it will inherit add method from Arithmetic and can use it directly. In this problem, we don't need to override or modify the inherited method; it works as-is.
Explaination ::

Arithmetic Class
The Arithmetic class defines a method add that accepts two integer parameters (a and b) and returns their sum. This is the basic implementation of the addition operation.
Adder Class
The Adder class extends Arithmetic. By doing so, it inherits the add method from Arithmetic and can use it without needing to implement it again.
Solution Class -This class contains the main method. An Adder object is created, and the add method is called with different sets of integers. However, in the problem context, no input/output is needed from us, as the code testing framework will handle that.
Solution :: code

import java.io.; import java.util.;

class Arithmetic { int add(int a, int b) { return a + b; } }

class Adder extends Arithmetic { }

public class Solution { public static void main(String[] args) { Adder adder = new Adder(); System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName()); System.out.println(adder.add(30, 12) + " " + adder.add(10, 3) + " " + adder.add(15, 5)); } }

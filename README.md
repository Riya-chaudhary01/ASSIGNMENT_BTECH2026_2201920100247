# ASSIGNMENT_BTECH2026_2201920100247
# 22128

26/01/2025
Problem 1(HackerRank)
Java Inheritance 2

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

import java.io.; 
import java.util.;

class Arithmetic { 
  int add(int a, int b) { 
      return a + b;
      } 
  }

class Adder extends Arithmetic { 
  }

public class Solution { 
  public static void main(String[] args) { 
    Adder adder = new Adder(); 
    System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName()); 
    System.out.println(adder.add(30, 12) + " " + adder.add(10, 3) + " " + adder.add(15, 5));
  } 
}





















27/01/2025
Problem 2(HackerRank)
Java Abstract class
Problem Statement :: 
A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses. You should learn about Java Inheritance before attempting this challenge.
If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book(); 
You have to create another class that extends the abstract class. Then you can create an instance of the new class.
Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
In the editor, we have provided the abstract Book class and a Main class. In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.
Your class mustn't be public.

Coding Platform :: HackerRank

Approach and Explaination ::

In this problem we will use abstract and Inheritance concept to achieve this 
1. Structure of Program
    - In this we defines an abstract class 'Book' and a concrete subclass 'MyBook'. The abstract class sets up a basic structure for a book object, while the subclass MyBook provides the implementation for setting the book's title.
2. Abstract Class(Book)
   - Book is a abstract class. The Book has a protected instance variable 'title' which stores the title of the book.
   - The setTitle method is abstract, and the getTitle method is concrete and provides the functionality to retrieve the value of the title.

3. Concrete Class(MyBook)
   - MyBook is a subclass of Book and implements the abstract method setTitle. This method assigns the provided string s to the title instance variable.

Solution : Code :: 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBook myBook = new MyBook();
        String title = sc.nextLine();
        myBook.setTitle(title);
        System.out.println("The title is: " + myBook.getTitle());
    }
    
    abstract static class Book { 
        protected String title;
        
        abstract void setTitle(String s);
        
        String getTitle() { 
            return title;
        }
    }
    
    static class MyBook extends Book { 
        @Override 
        void setTitle(String s) { 
            title = s;
        } 
    }
}

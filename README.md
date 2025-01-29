# ASSIGNMENT_BTECH2026_2201920100247

## 26/01/2025
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

**Solution** :: code

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





















## 27/01/2025
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

**Solution** : Code :: 

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






















## 28/01/2025
Problem 3(HackerRank)
Java Inheritance 1
Problem Statement :: 
Using inheritance, one class can acquire the properties of others. Consider the following Animal class:
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}

Finally, we can create a Bird object that can both fly and walk.

This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.
The code above is provided for you in your editor. You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
I am walking
I am flying
I am singing

Coding Platform :: HackerRank

Approach and Explaination ::
In this problem we have to create a parent class and a child class where child class will inherit properties of parent class. 
1. Parent Class i.e. Animal class
   - Here we don't require any access modifiers , the animal class will have method walk which will print "I am walking" this will be inherited to child class
2. Child class i.e. Bird class
   - This class will we acts as child class of Animal class and inherit it's properties and also have it's own methods fly and sing to print "I am flying" and "I am singing" respectively
In Solution class we have main method where we will create a Bird method and call for walk,fly and sing .

**Solution** :: code :: 

*import java.io.*;
import java.util.*;

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}

public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}*

















## 29/01/2025
Problem 4(HackerRank)
Java Interface
Problem Statement ::
A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.
You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.


Coding Platform :: HackerRank

Approach And Explaination :: 
The program starts by asking the user to input a number, n, using the Scanner class. This number will be the one for which we need to calculate the sum of all its divisors. There’s an interface called AdvancedArithmetic, which defines a method divisor_sum(int n). This method will be responsible for calculating the sum of divisors of the given number n. An interface is like a promise: any class that implements this interface must provide its own version of the divisor_sum method. The class Calculator implements the AdvancedArithmetic interface. Inside the class, the method divisor_sum is implemented. The method goes through each number from 1 to n and checks if it divides n evenly. If it does, that number is added to the sum. The program ensures the input n is between 1 and 1000, as we only want to work with numbers within this range. 

**Solution** :: Code
*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Calculator calc = new Calculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(calc.divisor_sum(n));
        sc.close();
    }
} interface AdvancedArithmetic{
    public int divisor_sum(int n); 
}
class Calculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n ){
        int sum =0;
         if(n>=1 && n<=1000){
            for(int i = 1 ; i <=n ; i++){
                if(n%i ==0){
                    sum+=i;
                }
            }
         }
         return sum;
    }
}*

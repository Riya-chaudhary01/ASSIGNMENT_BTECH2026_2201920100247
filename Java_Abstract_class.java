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
            super.title = s;
        }
}

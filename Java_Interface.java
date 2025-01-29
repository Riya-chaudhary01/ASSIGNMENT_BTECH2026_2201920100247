import java.io.*;
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
}

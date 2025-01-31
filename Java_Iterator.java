import java.io.*;
import java.util.*;

public class Solution {

    public static void helper(ArrayList<String> arr)
{
    for(int i = arr.indexOf("###") + 1 ; i  < arr.size();i++)
    {
        System.out.println(arr.get(i));
    }        
}
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    ArrayList arr = new ArrayList();
    for(int i = 0; i < m ;i++)
    {
        arr.add(sc.nextInt());    
    }
    arr.add("###");
    for(int i = 0; i < n ;i++)
    {
        arr.add(sc.next());    
    }
    // System.out.println(arr);
    helper(arr);

}
}

import java.util.*;
import java.io.*;
public class recur{
    public static void main(String args[]){
    Scanner scan =new Scanner(System.in);
    String A =scan.next();
    String B =scan.next();
    int len_A= A.length();
    int len_B= B.length();
    System.out.println(len_A+len_B);
      System.out.print(((A.substring(0,1)).toUpperCase().concat(A.substring(5,len_A)))+" "+ 
                          ((B.substring(0,1)).toUpperCase().concat(B.substring(5,len_B))));
    
        
    }
}


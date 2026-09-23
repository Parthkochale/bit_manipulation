import java.util.*;


public class evenOrOdd {
  public static void evenOrodd(int n){
    int bitMask = 1;
    if((n & bitMask) == 0){
      System.out.println("The no. is even");
    }else{
      System.out.println("The no. is odd");
    }
      

  }

  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the no.");
    int n = sc.nextInt();
    evenOrodd(n);
  }
}

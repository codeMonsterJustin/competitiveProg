/*************************************
This is a competitive prog algo question from HackerRank
As told by Vivan Dang:

For any set {a_1, a_2,..., a_6 | 1 <= a_i <= 40}
Find the sum of all n < l, where l <= 10**7 is an arbitary number
Such that:
n**2 + a_1
n**2 + a_2
.
.
.
n**2 + a_6
are consecutive prime numbers.
**************************************/
import java.util.*;

public class ContPrime{
  public static void main(String[] args){

      /***************************
      *Ensure input is correct:1
      *a_1 to a_6 ascending
      *l <= 10**7
      *1 <= a_i <= 40
      ****************************/

      int sum =0;
      int l = 1000; //Guarantee to be random
      /*
      int a1 = args[0];
      int a2 = args[1];
      int a3 = args[2];
      int a4 = args[3];
      int a5 = args[4];
      int a6 = args[5];
      */

      for(int n=0; n<l; n++){

        for(int i=0; i<args.length; i++){
          if(i==5){
            sum +=n;
            break;
          }
          int a = Integer.parseInt(args[i]);
          int a_next = Integer.parseInt(args[i+1]);
          int first = n*n+a;
          int second = n*n+a_next;
          if(isConsecPrime(first, second)){
            continue;
          }
          break;
        }
      }
      System.out.println(sum);
  }

//This function is untested.
  public static boolean isPrime(int num){

    if(num <= 1){
      return false;
    }
    if(num == 2){
      return true;
    }
    if(num%2==0){
      return false;
    }
    for(int i = 3; i < Math.sqrt(num); i += 2){
      if(num%i ==0){
        return false;
      }
    }
    return true;
  }


  public static boolean isConsecPrime(int smallPrime, int largePrime){

    for(int i=smallPrime; i<largePrime; i+=2){
      if(isPrime(i)){
        return false;
      }
    }
    return true;
  }
}

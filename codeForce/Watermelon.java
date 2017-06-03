import java.util.*;
public class Watermelon{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int  w = scan.nextInt();

    if(w%2 == 0 && w != 1 && w != 2){
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
  }
}

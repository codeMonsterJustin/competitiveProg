import java.util.*;
public class TheatreSquare{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextInt();
    long m = scan.nextInt();
    long a = scan.nextInt();

    int i = (n%a == 0) ? 0 : 1;
    int j = (m%a == 0) ? 0 : 1;
    long num = ((n/a) + i)*((m/a) + j);
    System.out.println(num);
  }
}

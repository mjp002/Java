import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("a:"); int a = stdIn.nextInt();
    System.out.print("b:"); int b = stdIn.nextInt();
    int c = 0;

    if(a % 2 == 0) c = c + 1 ;
    if(b % 2 == 0) c = c + 1 ; // a짝수 b짝수c= 2  둘중 하나 홀수면 c =1
    if (c == 0) 
      System.out.println("양쪽 모두 홀수입니다.");
    else if (c == 1)
      System.out.println("한쪽만 홀수입니다. ")
    else if (c == 2)
      System.out.println("둘다 짝수입니다. ")
    }
}

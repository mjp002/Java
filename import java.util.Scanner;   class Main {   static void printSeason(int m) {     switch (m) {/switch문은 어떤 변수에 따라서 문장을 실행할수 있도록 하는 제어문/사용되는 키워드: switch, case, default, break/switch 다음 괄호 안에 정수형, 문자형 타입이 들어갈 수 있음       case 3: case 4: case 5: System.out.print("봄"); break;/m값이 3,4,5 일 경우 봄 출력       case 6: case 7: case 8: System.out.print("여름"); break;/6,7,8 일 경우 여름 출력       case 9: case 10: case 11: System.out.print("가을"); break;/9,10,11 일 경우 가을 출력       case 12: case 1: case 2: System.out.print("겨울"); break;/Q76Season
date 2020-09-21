import java.util.Scanner;


class Main {
  static void printSeason(int m) {
    switch (m) {    //switch문은 어떤 변수에 따라서 문장을 실행할수 있도록 하는 제어문
                    //사용되는 키워드: switch, case, default, break
                    //switch 다음 괄호 안에 정수형, 문자형 타입이 들어갈 수 있음
      case 3: case 4: case 5: System.out.print("봄"); break;  //m값이 3,4,5 일 경우 봄 출력
      case 6: case 7: case 8: System.out.print("여름"); break;  //6,7,8 일 경우 여름 출력
      case 9: case 10: case 11: System.out.print("가을"); break;  //9,10,11 일 경우 가을 출력
      case 12: case 1: case 2: System.out.print("겨울"); break; //12,1,2 일 경우 겨울 출력
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int month;
    do {
      System.out.print("몇 월입니까(1-12)?");
      month = stdIn.nextInt();
    } while (month < 1 || month > 12);    
    
    System.out.print("해당 월의 계절은 ");
    printSeason(month);
    System.out.print("입니다.");
  }


}

import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{  // 에러 처리를 위해 익셉션 추가

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(isr);

    String str;
    System.out.println("글씨를 입력하면 따라합니다.");
    str = in.readLine();
    System.out.println(str);
  }
}

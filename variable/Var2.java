package variable;

public class Var2 {
  public static void main(String[] args) {
    int a = 10; // 선언과 동시에 초기화
    int b = 20;
    int c = 70;
    int d = 84;

    // 재할당 - 값을 다시 변경함, 단 재선언 할 수 없음.
    a = 100;
    b = 200;


    // 출력 ("문자열" + 변수) + : 연결
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    System.out.println("c : " + c);
    System.out.println("d : " + d);


  }
}

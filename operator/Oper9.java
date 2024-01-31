package operator;

// 논리 연산자
public class Oper9 {
  public static void main(String[] args) {
    System.out.println("&&:and 그리고 연산자"); // 둘다 true => true
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && false);

    System.out.println("||:or 또는 연산자");
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || false);

    System.out.println("!:not 부정 연산자");
    System.out.println( !true );
    System.out.println( !false );

    System.out.println("변수 + 논리 연산자");
    boolean a = true;
    boolean b = false;
    System.out.println( a && b);
    System.out.println( a || b);
    System.out.println( !a );
    System.out.println( !b );

    System.out.println("논리 연산자 응용");
    int x = 25;
    boolean result ;  // x > 10, x < 20 ture or false

    // result =  x > 10 && x < 20;
    result = ( x > 10 ) && ( x < 20 );

    System.out.println("결과 : " + result);

    System.out.println("논리 연산자 응용2");
    // score = 점수, result1 = 80~100 포함

    int score = 89;
    boolean result1 ;

    result1 = 80 <= score && 100 >= score;
    System.out.println("합격0 : " + result1);

  }
}

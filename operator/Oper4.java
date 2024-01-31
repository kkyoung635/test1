package operator;

// 비교(관계) 연산자 >, <, <=, >=, ==, !=, => true/false
public class Oper4 {
  public static void main(String[] args) {
    int a = 2;
    int b = 5;

    System.out.println(a == b); //false
    System.out.println(a != b); //true
    System.out.println(a > b); //false
    System.out.println(a >= b); //false
    System.out.println(a < b);  //true
    System.out.println(a <= b);  //true

    boolean result = a > b;
    System.out.println("결과 : " + result);

    boolean result2 = a < b;
    System.out.println("결과 : " + result2);
  }
}

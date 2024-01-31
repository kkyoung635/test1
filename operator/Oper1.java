package operator;

//1. 산술 연산자 +, -, *, /, %
public class Oper1 {
  public static void main(String[] args) {
    int x , y;
    int sum, sub, div, mod, mul;

    x= 30;
    y = 4;

    sum = x + y;
    mul = x * y;
    sub = x - y;
    div = x / y; // x/0 => 0으로 나눌 수 없다.
    mod = x % y; // int % int => int 동일한 타입으로만.
    // double mod =  (double) x % y 형변환

    System.out.println("합 : " + sum);
    System.out.println("차 : " + sub);
    System.out.println("곱 : " + mul);
    System.out.println("몫 : " + div);
    System.out.println("나머지 : "+ mod);
  }
}

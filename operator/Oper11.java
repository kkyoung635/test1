package operator;

// 형변환
public class Oper11 {
  public static void main(String[] args) {
    // int x = 3.14; 정수 타입에 실수를 넣으면 오류가 뜸
    int x = (int) 3.14; // 값을 정수로 타입을 바꿔줌
    System.out.println( x );

    // double y = 10/3; 큰 타입은 작은 타입을 넣을 수 있다 / 자동형변환 / 오류가 뜨지 않는다 double이 int 큰 타입
    // double y = (double) 10/3; // 둘 중에 하나만 형변환
    double y = 10/3.0; // 둘 중에 하나만 형변환
    System.out.println( y );


  }
}

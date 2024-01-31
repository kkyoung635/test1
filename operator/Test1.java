package operator;

public class Test1 {
  public static void main(String[] args) {
    int a = 0;
    a = a+1;
    System.out.println("a = "+a);
    /*
    * 연산자 : 계산
    * 1. 산술 연산자
    *   + : 더하기, - : 빼기, * : 곱, / : 나누기 몫, % : 나머지 값
    *
    * 2. 비교(관계) 연산자
    *   >, <, >=, <=, ==, !=
    *   결과 : 참 또는 거짓 => true, false
    *
    * 3. 논리 연산자
    *   && 그리고 and
    *   true && true => true :  둘다 참이면 true
    *   true && false => false :  둘중 하나라도 거짓이면 false
    *   false && true => false
    *   false && false => false
    *
    *   || 또는 or
    *   true || true => true :  둘중 하나라도 참이면 true
    *   true || false => true
    *   false || true => true
    *   false && false => false
    *
    *   ! 부정 not
    *   ! true => false
    *   ! false => true
    * 
    * 4. 대입(복합) 연산자
    *   변수 = 값 => 값을 변수에 대입한다 (치환)
    *   a = a + 10; 우측 a + 10 을 좌측 a 에 대입
    *   예) int a = 10;
    *   a = a + 10; => 20 => a에 대입.
    *   a += 10
    *   a = a - 10; => a -= 10
    *   a = a * 10; => a *= 10
    *   a = a / 10; => a /= 10
    *   a = a % 10; => a %= 10
    *
    * 5. 증감 연산자
    *   ++ : 1증가
    *   -- : 1감소
    * 
    *   a = a + 1 => a += 1 => ++a
    *   a = a - 1 => a -= 1 => --a
    * 
    *   ++(--)변수 : 전위연산
    *   변수++(--) : 후위연산
    * 
    * 6. 삼항 연산자
    *   ( 조건 ) ? 참 : 거짓
    * */
  }
}

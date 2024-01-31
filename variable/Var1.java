package variable; // 폴더 개념, 삭제 금지

public class Var1 {
  public static void main(String[] args) {
    int a = 100; // a 변수 (그릇) 100 값을 대입(치환)
    int score = 80;
    char ch = 'A';
    String str1 = "B"; // 문자열, 문자 => String, char 많이 사용하지 않음.
    String str2 = "안녕자바";
    boolean done = true;
    byte b = 127;
    short s = 32767;
    double num1 = 10.1; // 실수 기본형
    float num2 = 10.2f; // f, F

    System.out.println(a);
    System.out.println(score);
    System.out.println(ch);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(done);
    System.out.println(b);
    System.out.println(s);
    System.out.println(num1);
    System.out.println(num2);
  }
}



/*
* 변수 : 변하는 값을 저장하는 저장공간 (메모리 공간)
* 예) 아이디, 이메일, 비밀번호, 상품명, 상품갯수, 주민번호 등
* 이름규칙 - 변수명 규칙
* 1. 영문자, 숫자, _, $ 사용가능
* 2. 첫글자는 숫자 제외 (영문자 소문자로 시작 - 클래스명이 첫글자 대문자로 시작하기 때문)
* 3. 한글 가능하지만 사용지양
*    예약어 사용불가 (java에서 사용하는 명령어)
* 4. 두 단어 합쳐서 쓸 경우 두번째 단어 첫글자는 대문자로 시작 (dogCat, myName) 낙타표기법
* 5. 이름은 의미에 맞는 영문이름 - 함축보다 의미 그대로 전달하는것이 좋음
*
* 클래스명 : 첫글자 대문자
* 두 단어 합쳐서 쓸 경우 낙타표기법 사용 (DogCat, MyName)
*
* type
* 정수 : int (20억 > long)
* 실수 : double (float 정밀도가 떨어져 오류가 생김)
* 논리값 : boolean - true / false
* 
* 타입 그릇1 = 물;
* 타입 그릇2 = 국;
* */
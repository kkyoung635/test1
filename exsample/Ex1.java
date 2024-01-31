package exsample;

import java.util.Scanner;

// 반복적으로 실행되는 동작을 루프(loop)라고 한다.
// for문, while 문, do~while문
// scanner 웹으로부터 값을 받을 수 있음
public class Ex1 {
  public static void main(String[] args) {
    // 1. 입력 객체 생성 [키보드 입력된 데이터 scanner 객체에 저장]
    // 2. 객체생성 : 클래스명 병수 = new 생성자
    // 문자를 키보드로 입력받기 정수, 실수, 문자
    Scanner scanner = new Scanner(System.in);
    String str = "";
    // str = scanner.next(); // 띄어쓰기 할 수 없다
    str = scanner.nextLine(); // 엔터키를 입력하면 지금까지 입력한 모든 내용을 읽는다.
    System.out.println(str);
  }
}

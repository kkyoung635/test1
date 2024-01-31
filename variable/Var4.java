package variable;

// 이름, 나이, 전화번호, 주소, 키
// name : 문자열, age : 정수, tel : 문자열, addr : 문자열, height : 실수
public class Var4 {
  public static void main(String[] args) {
    // 신상명세서 출력
    String name = "이름";
    int age = 20;
    String tel = "010-0000-0000";
    String addr = "인천";
    double height = 170.0;

    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("전화번호 : " + tel);
    System.out.println("주소 : " + addr);
    System.out.println("키 : " + height + "cm");

  }
}

package condition;

// if - else
// num 0보다 크거나 0이면 양수 또는 0이다.
// 그렇지 않으면 음수
public class If7 {
  public static void main(String[] args) {
    int num = 0;
    // if (num >= 0) {
    if (num > 0 || num == 0) {
      System.out.println("양수 또는 0");
    } else {
      System.out.println("음수");
    }
  }
}


// num 정수가 양수, 음수 / 참, 거짓 2가지 결과만
/*
public class If7 {
  public static void main(String[] args) {
    int num = 5;
    if (num > 0) {
      System.out.println("양수");
    } else {
      System.out.println("음수");
    }
  }
}
 */
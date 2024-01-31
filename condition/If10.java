package condition;

// 5의 배수, 아니다
public class If10 {
  public static void main(String[] args) {
    int a = 16;
    if (a%5 == 0) {
      System.out.println("5의 배수");
    } else {
      System.out.println("5의 배수 아님");
    }
  }
}

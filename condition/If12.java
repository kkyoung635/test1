package condition;

public class If12 {
  public static void main(String[] args) {
    int age = 18;
    String addr = "인천";

    if (age >= 18 && addr.equals("인천")) {
      System.out.println("가입 가능");
    } else {
      System.out.println("가입 불가");
    }
  }
}

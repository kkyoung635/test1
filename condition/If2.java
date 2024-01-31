package condition;

// 단일 if문 -2
//
public class If2 {
  public static void main(String[] args) {
    // 나이가 20 이상이면 성인, 18미만이면 미성년
    int age = 17;
    if (age >= 20) {
      System.out.println("성인");
    }
    if (age < 18) {
      System.out.println("미성년");
    }
  }
}

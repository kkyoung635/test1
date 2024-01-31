package operator;

// 문자열 비교 ==, != 사용불가
// .equlas() 같은지 비교해줌
public class Oper5 {
  public static void main(String[] args) {
    boolean result1, result2, result3;
    String str1 = "문자열1";
    String str2 = "문자열2";

    // 위에서 아래로
    result1 = str1.equals("java");
    result2 = str1.equals("문자열1");
    result2 = str1.equals(str2);
    result3 = "java".equals("java");

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

  }
}

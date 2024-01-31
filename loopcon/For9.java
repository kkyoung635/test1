package loopcon;

public class For9 {
  public static void main(String[] args) {
    // 별 찍기
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < (5 - i); j++) { // i행의 갯수만큼 j 별 갯수가 찍히므로 범위를 i로 제한해준다.
        System.out.print(" * ");
      } // for j
      System.out.println();
    } // for i
  }
}

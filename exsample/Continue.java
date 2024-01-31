package exsample;

public class Continue {
  public static void main(String[] args) {
    // continue 만나면 다시 처음 반복문으로 이동
    // 1 부터 5까지 실행, 단 3은 건너뛰기
    for (int i = 1; i <= 5; i++ ) {
      if (i%2 == 1) {
        continue;
      }
      System.out.println(i);
    }
  }
}

package loopcon;

public class For4 {
  public static void main(String[] args) {
    // 1부터 3 까지 누적 합계구하기
    int sum =  0; // sum 변수에 초기값 0
    sum = sum + 1 ; // sum(0) + 1 => sum(1)
    System.out.println("i ="+ 1 + " sum =" + sum);

    sum = sum + 1; // sum(1) + 1 => sum(2)
    System.out.println("i ="+ 1 + " sum =" + sum);

    sum = sum + 1 ; // sum(2) + 1 => sum(3)
    System.out.println("i ="+ 1 + " sum =" + sum);

    System.out.println("//////////////");

    int hap = 0;
    //1부터 10까지 합 for
    for( int i = 1 ; i<= 10 ; i++ ) {
      hap = hap + i; // hap += i
     // System.out.println("i = "+ i + ", hap=" + hap );
    }
    System.out.println("1 ~ 10까지 합 : " + hap );

    // 무한반복 for( ; ; )

  }
}

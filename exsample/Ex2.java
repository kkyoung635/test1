package exsample;

// for문 기본
public class Ex2 {
  public static void main(String[] args) {
   // 1부터 20까지의 합 구하기
   int sum = 0, len = 20;
   for (int i = 1; i <= len; i++) {
     sum += i ; // sum = sum + i
     // System.out.println("sum : " + sum);  // for 안에 노출소스 넣으면 여러 값이 나옴
   }
     System.out.println("sum : " + sum); // for 중괄호 밖에 넣으면 값이 1개만 나옴
  }
} //  end class


/*
// for문 기본
public class Ex2 {
  public static void main(String[] args) {
    for (int i = 1, num = 2; i <= 10 ; i++, num += 2) {
      System.out.println(" " + i + ", num : " + num);
    } // end for
  } // end main
} //  end class

*/
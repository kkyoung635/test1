package Array;

public class Array3 {
  public static void main(String[] args) {
    // 음식주문 배열선언
    // 타입이 동일한 연속공간 선언
    // String foods[] = new String[5];
    // String[] foods = new String[]{} ;

    // String[] foods = new String[]{"라면", "우동", "쫄면", "짜장", "짬뽕"} ;
    String[] foods = {"라면", "우동", "쫄면", "짜장", "짬뽕"} ;

    // for (int i=0; i <= 4; i++) {
    for (int i=0; i < foods.length; i++) {
      System.out.println(foods[i] + " 하나");
    }

    // 다른 자료형 - 선 선언 후 할당
    int[] x = new int[3];
    x[0] = 10;
    x[1] = 10;
    x[2] = 10;

    // 다른 자료형 2 - 선언 후 간단한 인덱스는 바로 할당하기
    double[] d = new double[] {10.2, 11.6, 12.7};

    // 다른 자료형 3
    boolean[] c = {true, false, true};
    }
  }



/*
* 변수로 처리할 경우 -1
public class Array3 {
  public static void main(String[] args) {
    // 음식주문 문자열
    String foo1 = "라면";
    String foo2 = "우동";
    String foo3 = "쫄면";
    String foo4 = "짜장";
    String foo5 = "짬뽕";

    System.out.println(foo1 + " 하나");
    System.out.println(foo2 + " 하나");
    System.out.println(foo3 + " 하나");
    System.out.println(foo4 + " 하나");
    System.out.println(foo5 + " 하나");
    System.out.println("주문이요~");
  }
}
단 주문자가 30명일 때?

* 배열 선언 -step1
public class Array3 {
  public static void main(String[] args) {
    // 음식주문 배열선언
    // 타입이 동일한 연속공간 선언
    // String[] foods = new String[5];
    String foods[] = new String[5];

    foods[0] = "라면"; // []인텍스는 0부터
    foods[1] = "우동";
    foods[2] = "쫄면";
    foods[3] = "짜장";
    foods[4] = "짬뽕";

    System.out.println(foods[0]+ " 하나");
    System.out.println(foods[1]+ " 하나");
    System.out.println(foods[2]+ " 하나");
    System.out.println(foods[3]+ " 하나");
    System.out.println(foods[4]+ " 하나");
    System.out.println("주문이요~");

  }
}

* 배열 선언 - step2
public class Array3 {
  public static void main(String[] args) {
    // 음식주문 배열선언
    // 타입이 동일한 연속공간 선언
    // String[] foods = new String[5];
    String foods[] = new String[5];

    foods[0] = "라면"; // []인텍스는 0부터
    foods[1] = "우동";
    foods[2] = "쫄면";
    foods[3] = "짜장";
    foods[4] = "짬뽕";

    // for (int i=0; i <= 4; i++) { // 길이를 숫자로 해줘도 되지만
    for (int i=0; i < foods.length; i++) { // 길이를 모를 수 있으니 length 넣기
      System.out.println(foods[i] + " 하나");
    }
    System.out.println("주문이요~");
  }
}
* */
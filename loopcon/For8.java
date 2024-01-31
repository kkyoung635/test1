package loopcon;
/*
구구단
=====2단====
*/
public class For8 {
  public static void main(String[] args) {
    // int dan, result, i = 0;
    int result = 0;
    for (int dan = 2; dan <= 9; dan++) {
      System.out.println("==== "+dan+"단"+" ====");
      for (int i = 1; i <=9; i++) {
        result = dan * i;
        System.out.println(dan+"x"+i+"="+result);
      }
      System.out.println();
    }
  }
}

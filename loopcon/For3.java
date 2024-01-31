package loopcon;

public class For3 {
  public static void main(String[] args) {
    /*
    1 ~ 100 까지 출력
    1 2 3 4 5 6 7 8 9 10
    11 12 13 ~        20
    21 22 ~           30
    ...
    91 92 93  ~       100
    * */
    for( int i = 1 ; i<= 100; i++ ) {
      System.out.print(i+" ");
      if( i % 10 == 0 ) {
        System.out.println();
      } // end if
    } // end for

    System.out.println("/////////////");

    for( char ch = 'a' ; ch <= 'z'; ch++ ) {
      System.out.print(ch + " , ");
    }

  }
}

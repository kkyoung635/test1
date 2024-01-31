package loopcon;

public class Break2 {
  public static void main(String[] args) {
    // while 문 무한루프 true
    // x 10 이면 중단
    int x = 0;
    while ( true ) {
      System.out.println( x );
      if( x == 10 ) {
        break;
      }
      x++;
    } //end while
  }
}

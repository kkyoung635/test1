package loopcon;

public class Break1 {
  public static void main(String[] args) {
    // 반복문안에 특정조건을 만나면 중단
    // for +if+ break : 횟수 개수에
    // while +if+ break : 무한루프 중단
    // 1 ~ 10 반복 ( for문 ) 5가되면 중단
    for( int i = 1 ; i<=10 ; i++ ) {
      System.out.println( i );
      if( i == 5 ) {
        break;
      } // end if
    } // end for
  }
}

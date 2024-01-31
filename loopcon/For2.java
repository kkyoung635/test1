package loopcon;

public class For2 {
  public static void main(String[] args) {
    // 0부터 20까지 짝수만 출력
    // for + if문
    for( int i = 0 ; i <= 20 ; i++ ) {
      if( i % 2 == 0) {
        System.out.print( i + ", ");
      }
    } //end for
    System.out.println();
    System.out.println();
    for( int i = 0 ; i <= 20 ; i = i + 2 ) {
      System.out.print( i + ", ");
    }
    System.out.println();
    System.out.println();

    // 0부터 20까지 홀수만 출력 , for + if문
    for( int i = 0 ; i <= 20 ; i++ ) {
      if( i % 2 == 1) {
        System.out.print(i + " , ");
      }
    } //end for
    for( int i = 0 ; i <= 20 ; i++ ) {
      if( i % 2 != 0) {
        System.out.print(i + " , ");
      }
    } //end for

  }
}

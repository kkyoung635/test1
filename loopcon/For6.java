package loopcon;

public class For6 {
  public static void main(String[] args) {
    for (int i = 0; i <= 2; i++) {
      System.out.println("====이중 for 문====");
      for (int j = 0; j <= 2; j++) {
        System.out.println("i : " +i+" , j : "+j+"");
      } // end for j
      System.out.println(); // 공백을 의미함
    } // end for i
  } // end main
} // end class
/*
  다중 for문 (2중) : 변수는 사용자 정의

  for (초기값 ; 조건식; 증감식) {
    for (초기값; 조건식; 증감식) {
      실행문
    }
  }

  for (초기값 ; 조건식; 증감식) { //실행문 위치는 고정이 아님, 때에 따라서 바뀔 수 있다.
    실행문
    for (초기값; 조건식; 증감식) {
      실행문
    }
      실행문
  }

  for (int i = 0; i <= 2; i++ ) { // 행의 의미
    for (int j = 0; j <= 2; j++ ) { // 열의 의미
      실행문
    }
  }

// 실행 순서
  for (0; 1,12; 11 ) { // 행의 의미
    for (2,13; 3,6,9; 5,8 ) { // 열의 의미
      4 실행문 7
    }
    10 j for 문을 벗어남
  }

        열(j)
 행(i) 0 : 0   1   2
 행(i) 1 : 0   1   2
 행(i) 2 : 0   1   2

 행     열
 i = 0, j = 0
 i = 0, j = 1
 i = 0, j = 2

 i = 1, j = 0
 i = 1, j = 1
 i = 1, j = 2

 i = 2, j = 0
 i = 2, j = 1
 i = 2, j = 2


*/
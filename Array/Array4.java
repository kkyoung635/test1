package Array;

// 2차원 배열
public class Array4 {
  public static void main(String[] args) {
    // 배열 3 -> 각각 a코스, b코스, c코스

    // 1차원 배열
    String[] arrA = {"A1", "A2", "A3"};
    String[] arrB = {"B1", "B2", "B3"};
    String[] arrC = {"C2", "C2", "C3"};
    System.out.println("A3 : " + arrA[2]);
    System.out.println("C2 : " + arrC[1]);

    // 2차원 배열
    String[][] arrs = new String[][]{ // 앞[] : 행, 뒤[] : 열
        {"A1", "A2", "A3"}, // 행 A1, A2, A3가 됨
        {"B1", "B2", "B3"},
        {"C1", "C2", "C3"}
    };
    System.out.println("A2 : " + arrs[0][1]);
    System.out.println("C3 : " + arrs[2][2]);
    System.out.println("=====================");

    // 2차원 배열, 이중 for문으로 표현하기
    // length로 범위 설정 할 때는 길이만큼 나오게 되니 숫자 입력값과의 부등호가 다르다.
    for (int i = 0; i < arrs.length; i++) { //  i 행
      for (int j = 0; j < arrs[i].length; j++) { // j 열
        System.out.print(arrs[i][j] + "  ");
      }
      System.out.println();
    }

    // 2차원 배열, 행과 열의 갯수가 다를 때
    String[][] arrs1 = new String[][]{ // 앞[] : 행, 뒤[] : 열
        {"A1", "A2", "A3"}, // 행 A1, A2, A3가 됨
        {"B1", "B2", "B3", "B4"},
        {"C1", "C2", "C3", "C4", "C5"}
    };

    System.out.println("2차원 배열, 열의 갯수 다르게");
    for (int i = 0; i < arrs1.length; i++) {
      for (int j = 0; j < arrs1[i].length; j++) { // 열의 갯수가 달라도 length로 하면 모두 노출된다.
        System.out.print(arrs1[i][j] + "    ");
      }
      System.out.println();
    }

  }
}



/* 행과 열 구분
*   String [][] arrs = new String[][]{}; // 앞[] : 행, 뒤[] : 열
*   열 0     1     2
행0  {"A1", "A2", "A3"},
    ("B1", "B2", "B3"},
    ("C1", "C2", "C3"},
*/


import java.util.Scanner;

// This is for directed graph 
public class Graph_Adj_Matrix_Repres {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int noOfNodes = 5;
    int edges = 5;
    Boolean matrix[][] = new Boolean[noOfNodes][noOfNodes];

    for (int i = 0; i < noOfNodes; i++) {
      for (int j = 0; j < noOfNodes; j++) {
        matrix[i][j] = false;
      }
    }
    for (int i = 0; i < edges; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      matrix[x][y] = true;
      matrix[y][x] = true; // for in ---> directed graph comment this line

    }
    for (int i = 0; i < noOfNodes; i++) {
      for (int j = 0; j < noOfNodes; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

  }
}

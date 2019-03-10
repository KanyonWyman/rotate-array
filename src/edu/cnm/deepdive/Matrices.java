package edu.cnm.deepdive;

public class Matrices {

  static void reverseCol(int data[][])
  {
    for (int i = 0; i < data[0].length; i++)
      for (int j = 0, k = data[0].length - 1;
          j < k; j++, k--) {
        int temp = data[j][i];
        data[j][i] = data[k][i];
        data[k][i] = temp;

      }
  }


  static void flipRow(int data[][])
  {
    for (int i = 0; i < data.length; i++)
      for (int j = i; j < data[0].length; j++) {
        int temp2 = data[j][i];
        data[j][i] = data[i][j];
        data[i][j] = temp2;


      }
  }


  static void printMatrix(int data[][])
  {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[0].length; j++)
        System.out.print(data[i][j] + " ");
      System.out.println("");
    }
  }


  static void rotate(int data[][])
  {
    reverseCol(data);
    flipRow(data);


  }


  public static void main(String[] args)
  {
    int data[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };


    rotate(data);
    printMatrix(data);
  }


}

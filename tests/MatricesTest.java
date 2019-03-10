public class MatricesTest {

  public static void main(String[] args) {
    int[][] mat = {{1, 2}, {3, 4}};
    rotate(mat);
  }


  public static int[][] rotate(int[][] data) {
    if (data == null)
      if (data.length != data[0].length)
        getTranspose(data);
    rotateAlongMidRow(data);
    return data;
  }

  private static void getTranspose(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

  private static void rotateAlongMidRow(int[][] matrix) {
    int len = matrix.length;
    for (int i = 0; i < len / 2; i++) {
      for (int j = 0; j < len; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[len - 1 - i][j];
        matrix[len - 1 - i][j] = temp;
      }
    }
  }
}

import java.io.*;

//This program reverses the order of the elements in each row of the matrix
public class ReversalOfElementsInEachRow {
  static int[][] data = { {3, 2, 5},
                          {1, 4, 4, 8, 13},
                          {9, 1, 0, 2},
                          {0, 2, 6, 3, -1, 8},
                          {-1, -2, -3, 4, 5, 45}, 
                          {56},
                          {0, 1, 2, 3, 4, 5, 6, 7} };                    

  //Prints out the resulting matrix
  private static void printArray() {
    for (int row = 0 ; row < data.length ; row++) {
      for (int col = 0 ; col < data[row].length-1 ; col++) 
         System.out.print(data[row][col] + ", ");
      System.out.println(data[row][data[row].length-1]); 
    }
  }
  
  public static void main(String[] args) { 
    // print out the initial array
    printArray(); 
    System.out.println();
    
    // reverse each row 
    for (int row = 0 ; row < data.length ; row++) { 
      int endInx = data[row].length;
      for (int col = 0 ; col < data[row].length / 2 ; col++) {
        int temp = data[row][col];
        data[row][col] = data[row][endInx - 1 - col];
        data[row][endInx - 1 - col] = temp;
      }
    }
    
    // print out the reversed array
    printArray(); 
  }
}  
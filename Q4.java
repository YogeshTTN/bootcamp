import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = in.nextInt();
        int arr[][] = new int[rows][cols];
        
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("INPUT MATRIX");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int rSum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
                rSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rSum);
        }
        
        for (int i = 0; i < cols; i++) {
            int cSum = 0;
            for (int j = 0; j < rows; j++) {
                cSum += arr[j][i];
            }
            System.out.println("Column " + (i + 1) + " sum = " + cSum);
        }
        
        System.out.println("Sum of all elements = " + sum);
        in.close();
    }
}

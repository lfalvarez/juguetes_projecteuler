package DiagonalDifference;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

        int primaryDiagonal = iteratePrimaryDiagonal(arr);
        int secondaryDiagonal = iterateSecondaryDiagonal(arr);

        return Math.abs(primaryDiagonal - secondaryDiagonal);

    }
    private static int iteratePrimaryDiagonal(int[][] arr){
        return iterateDiagonal(arr, false);
    }
    private static int iterateSecondaryDiagonal(int[][] arr){
        return iterateDiagonal(arr, true);
    }
    private static int iterateDiagonal(int[][] arr, boolean invert) {
        int length = arr.length;
        int sum = 0;
        int index;
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                index = j;
                if(invert){
                    index = length - j - 1;
                }
                if(j == i){
                    sum += arr[i][index];
                }
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
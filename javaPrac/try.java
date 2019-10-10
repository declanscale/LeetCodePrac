import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */



   

}

public class Solution {

    public static int diaDiff(int n, int[][]matrix){
        int i = 0;
        int diaOne = 0;
        int diaTwo = 0;
        for(i = 0; i < n; i++){
            diaOne = diaOne + matrix[i][i];
        }
        int j = 0;
        i = 0;
        for(j = n; j > 0; j--){
            diaTwo = diaTwo + matrix[i][j-1];
            i++;
        }

        if(diaTwo >= diaOne){
            return diaTwo - diaOne;
        }else{
            return diaOne - diaTwo;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner =  new Scanner(System.in);
        int n =  scanner.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(diaDiff(n,matrix));


       
    }
}

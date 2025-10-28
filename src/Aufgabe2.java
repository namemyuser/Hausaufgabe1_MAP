import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Aufgabe2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben die den Wert des Arrays: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element  " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        int max = -1;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int a = 0; a < n; a++){
            if(arr[a] > max)
                max = arr[a];
            if(arr[a] < min)
                min = arr[a];
            sum += arr[a];
        }
        int maxsum = sum - min;
        int minsum = sum - max;
        System.out.println("Max element : " + max);
        System.out.println("Min element : " + min);
        System.out.println("Maximale Sum: " + maxsum);
        System.out.println("Minimale Sum: " + minsum);

    }

}

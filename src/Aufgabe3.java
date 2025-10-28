import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe3 {
    public static long[] Multiplikation(long[] array, int k) {
        long[] arr = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = (long) array[i] * k;
        }
        return arr;

    }

    public static long[] Division(long[] array, int k) {
        long[] arr = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = (long) array[i] / k;
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben sie den Wert der ersten Arrays  : ");
        long a = sc.nextInt();
        System.out.print("Geben sie den Wert der zweiten Arrays  : ");
        long b = sc.nextInt();

        long[] arr1 = {a};
        long[] arr2 = {b};
        long[] sum = new long[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        long[] diff = new long[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (a > b)
                diff[i] = arr1[i] - arr2[i];
            else
                diff[i] = arr2[i] - arr1[i];
        }

        System.out.print("Geben sie den Wert des Multiplikations Zahl: ");
        int zahl = sc.nextInt();


        System.out.println("Die summe der Zahlen ist : " + Arrays.toString(sum));
        System.out.println("Die Differenz der Zahlen ist : " + Arrays.toString(diff));
        System.out.println("Die Multiplikation des ersten Array ist : " + Arrays.toString(Multiplikation(arr1, zahl)));
        System.out.println("Die Multiplikation des zweiten Array ist : " + Arrays.toString(Multiplikation(arr2, zahl)));
        System.out.println("Die Division des ersten Array ist : " + Arrays.toString(Division(arr1, zahl)));
        System.out.println("Die Division des ersten Array ist : " + Arrays.toString(Division(arr2, zahl)));

    }
}

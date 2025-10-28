import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Aufgabe1 {
    public static int[] NichtAusreichend(int[] not){

        int[] arr = new int[not.length];
        int cnt = 0;
        for(int i = 0; i < not.length; i++){
            if(not[i] < 40) {
                arr[cnt] = not[i];
                cnt++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 )
                list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static double Durchsnittwert(int[] not){
        int[] arr = new int[not.length];
        double sum = 0;
        for(int i = 0; i < not.length; i++){
            arr[i] = not[i];
        }
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        sum = sum / arr.length;
        DecimalFormat df = new DecimalFormat("#.00");
        sum = Double.parseDouble(df.format(sum));
        return sum;


    }

    public static int[] Abgerundet(int[] not){
        int[] arr = new int[not.length];
        for(int i = 0; i < not.length; i++)
                    arr[i] = not[i];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 > 2  && arr[i] >= 38)
                arr[i] += 5 - arr[i] % 5;
        }

        return arr;
    }

    public static int Maximal(int[] not){
        int[] max = Abgerundet(not);
        int maxim = 0;
        for(int i = 0; i < max.length; i++){
            if(max[i] > maxim){
                maxim = max[i];
            }
        }

        return maxim;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Gib bitte die Größe des Arrays: ");
        int size = scanner.nextInt();

        int[] Noten = new int[size];

        // Ask the user to enter values for the array
        System.out.println("Gib " + size + " Noten:");
        for (int i = 0; i < size; i++) {
            System.out.print("Note " + (i + 1) + ": ");
            Noten[i] = scanner.nextInt();
        }

        // Print
        //System.out.println("Your array: " + Arrays.toString(numbers));
        int[] nicht = NichtAusreichend(Noten);
        System.out.println("Nichtausreichende Noten : " + Arrays.toString(nicht));
        System.out.println("Durchsnittwert : " + Durchsnittwert(Noten));
        int[] abgerundet = Abgerundet(Noten);
        System.out.println("Abgerundete Noten : " + Arrays.toString(abgerundet));
        System.out.println("Maximal abgerundete Note : " + Maximal(Noten));




        scanner.close();

    }
}

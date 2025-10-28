import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Aufgabe4 {
    public static int BilligsteTastatur(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < min)
                min = arr[i];
        return min;
    }
    public static int TeuersteGegenstand(int[] arr, int[] arr1){
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for(int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max)
                max = arr1[i];
        }
        return max;
    }
    public static int TeuersteUSB(int[] arr){
        int nr = 0;
        Scanner budgetScanner = new Scanner(System.in);
        System.out.println("Geben Sie der buget fur teuerste USB: ");
        int budget1 = budgetScanner.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] <= budget1 && arr[i] >= nr)
                nr = arr[i];
        }
        return nr;
    }
    public static String MaximalGeldbetrag(int[] arr, int[] arr1) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Geben Sie der budget fur maximale Geldbetrag : ");
        int budget = imput.nextInt();
        int max = 0;
        String geldbetrag = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] + arr1[j] <= budget && arr[i] + arr1[j] >= max) {
                    geldbetrag = new String("" + arr[i] + " " + arr1[j]);
                    max = arr[i] + arr1[j];

                }
            }

        }
        if (geldbetrag == "")
            return "-1";
        else
            return geldbetrag;
    }


        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Geben Sie den Wert der Tastaturs Array: ");
            int tastatur = input.nextInt();
            int[] tastaturArray = new int[tastatur];
            for (int i = 0; i < tastatur; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                tastaturArray[i] = input.nextInt();
            }

            System.out.println("Geben Sie den Wert der USBs Arrays: ");
            int usbs = input.nextInt();
            int[] usbsArray = new int[usbs];
            for (int i = 0; i < usbs; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                usbsArray[i] = input.nextInt();
            }

            ///System.out.println("Die billigste tastatur ist : " + BilligsteTastatur(tastaturArray));
            ///System.out.println("Der teuerste Gegenstand ist : " + TeuersteGegenstand(tastaturArray, usbsArray));
            ///System.out.println("Der teuerste USB nach Budget ist : " + TeuersteUSB(usbsArray));
            System.out.println("Der maximal geldbetrag ist :" + MaximalGeldbetrag(tastaturArray, usbsArray));


        }
    }


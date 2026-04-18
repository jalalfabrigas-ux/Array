import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of Array? ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }


        System.out.println("Largest: " + largestNum(arr));
        System.out.println("Lowest: " + lowestNum(arr));


        int[] asc = new int[size];
        for (int i = 0; i < size; i++) asc[i] = arr[i];
        sortAscend(asc);
        System.out.print("Ascending:  ");
        for (int i = 0; i < asc.length; i++) System.out.print(asc[i] + " ");
        System.out.println();

        int[] desc = new int[size];
        for (int i = 0; i < size; i++) desc[i] = arr[i];
        sortDescend(desc);
        System.out.print("Descending: ");
        for (int i = 0; i < desc.length; i++) System.out.print(desc[i] + " ");
        System.out.println();

  
        System.out.print("Search index of value: ");
        int target = sc.nextInt();
        System.out.println("Index: " + searchIndex(arr, target));

        System.out.print("Count occurrences of value: ");
        int occVal = sc.nextInt();
        System.out.println("Occurrences: " + countOccurrence(arr, occVal));
    }   static int largestNum(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
        }
        return largest;
    }   static int lowestNum(int[] arr) {
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < lowest) lowest = arr[i];
        }
        return lowest;
    }   static void sortAscend(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }   static void sortDescend(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int searchIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) count++;
        }
        return count;
    }
}
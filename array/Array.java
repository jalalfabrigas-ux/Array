import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Size of Array? ");
        int size =sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Number "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

       sortAscend(arr);
       sortDescend(arr);

       for(int num : arr){
        System.out.print(num + " ");
       }
       for(int num1 : arr){
        System.out.print(num1 + " ");
       }

        System.out.println();

    }static int largestNum(int[] arr){
        int largest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }static int lowestNum(int[] arr){
        int lowest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<lowest){
                lowest = arr[i];
            }
        }
        return lowest;
    }static void sortAscend(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j= i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){
                   int ascend = arr[i];
                   arr[i] = arr[j];
                   arr[j]= ascend;
                }
            }
        }

    }static void sortDescend(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]< arr[j]){
                    int descend = arr[i];
                    arr[i] = arr[j];
                    arr[j] = descend;
                }
            }
        }

    }
}
//largest
//lowest
//sorttoAscend
//sorttoDescend
//Index
//Occurence
package Array;

import java.util.Scanner;

public class binarySearch {

    public static int BinarySearch(int[] arr ,int k){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                return mid;
            } else if (arr[mid]>k) {
                end =mid-1;
            }else {
                start=mid+1;
            }

        }
        return -1;

    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int find =BinarySearch(arr,5);
        System.out.println(find);
    }
}

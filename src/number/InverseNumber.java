package number;

import java.util.Scanner;

public class InverseNumber {

//    public static int count(int num) {
//
//        int count=0;
//        while(num>0){
//            num /=10;
//            count++;
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int len=count(num);
//        int arr[]=new int[len];
//        int temp=num;
////        for(int i= arr.length-1;i>=0;i--){
////            int mod=temp%10;
////            arr[i]=mod;
////            temp /=10;
////        }
//
//        for(int i=0;i<arr.length;i++){
//            int mod=temp%10;
//            arr[i]=mod;
//            temp /=10;
//        }
//
////        for (int at:arr){
////            System.out.println(at);
////        }
//        int answer=0;
//        for(int i=0;i<arr.length;i++){
//            int tem=arr[i];
//            int pw=(int)Math.pow(10,tem-1);
//            int product=pw*(i+1);
//            answer +=product;
//        }
//        System.out.println(answer);
//
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int index=1;
        int answer=0;
        while(num>0){
//            System.out.println("answer :"+answer);
            int mod=num%10;
//            System.out.println("mod :"+mod);
            int pow=(int)Math.pow(10,mod-1);
//            System.out.println("pow :"+pow);
//            System.out.println("index : "+index);
            int pro=pow*index;
//            System.out.println("pro :"+pro);
            answer +=pro;
//            System.out.println("answer :"+answer);
            num /=10;
            index++;
        }
        System.out.println("answer  final:"+answer);
    }



}

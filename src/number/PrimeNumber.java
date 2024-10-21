package number;

import java.util.Scanner;

public class PrimeNumber {
    public static String sPrime(int num){
//        System.out.println("function");
        String str="not prime";
        if(num<2){
            return str;
        }

        for(int i=2;i<Math.sqrt(num);i++){
//            System.out.println("iterate "+i);
            if(num%i==0){
                str = "not prime";
//                System.out.println("itr arr "+ num%i+ " " +str);
            }else {
                str= "prime";
            }
        }

        return  str;

    }

    public static String isPrime(int num) {
        String str="not prime";
        if (num < 2) {
            return str;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {  // Optimized check up to sqrt(num)
            if (num % i == 0) {
                return str;
            }
        }
        return "prime";
    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
////        System.out.println(num);
//        int[] arr=new int[num];
//
//        for(int i=0;i<num;i++){
//            arr[i]=sc.nextInt();
////            System.out.println("arrr :"+arr[i]);
//        }
//
//        for(int i=0;i<num;i++){
//            System.out.println(isPrime(arr[i]));
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int pre=sc.nextInt();
            int count=0;
            for(int j=2;j*j<pre;j++){
                if(pre%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("prime");
            }else {
                System.out.println("not prime");
            }
        }
    }
}

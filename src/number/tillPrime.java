package number;

import java.util.Scanner;

public class tillPrime {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int strt=sc.nextInt();
//        int end=sc.nextInt();
//
//        for(int i=strt; i<=end;i++){
//            boolean isPrime=true;
//            for(int j=2;j*j<=i;j++){
//                if(i%j==0){
//                    isPrime=false;
//                    break;
//                }
//
//            }
//            if(isPrime && i>1){
//                System.out.println(i);
//            }
//
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int strt=sc.nextInt();
        int end=sc.nextInt();

        for(int i=strt; i<=end;i++){
            int count=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    break;
                }

            }
            if(count ==0){
                System.out.println(i);
            }

        }
    }
}

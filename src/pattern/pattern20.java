package pattern;

import java.util.Scanner;

public class pattern20 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int space=num/2;
//        int star=1;
//
//        for(int i=1;i<=num;i++){
//            for(int j=1;j<=num;j++){
//
//            }
//
//            if(i<=num/2){
//                space--;
//            }
//
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
////        int num=sc.nextInt();
//            int num=9;
//        for(int i=1;i<=num;i++){
//            for(int j=1;j<=num;j++){
//                if(i==1 && i==num){
//                    if(j==num/2+1){
//                        System.out.print("*\t");
//                    }
//                } else if (i>1 && i<num  && i<=num/2) {
//                    if(j==num/2-i || j==num/2+i) {
//                        System.out.print("*\t");
//                    }
//                }else {
//                    System.out.print("9\t");
//
//                }
//
//            }
//            System.out.println();
//
//
//
//        }
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
        int num=9;
        int outter=num/2;
        int inner=-1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=outter;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int j=1;j<=inner;j++){
                System.out.print("\t");
            }
            if(i<num && i>1) {
                System.out.print("*\t");
            }
            System.out.println();
        if(i<=num/2){
            outter--;
            inner+=2;
        }else {
            outter++;
            inner-=2;
        }

        }
    }
}

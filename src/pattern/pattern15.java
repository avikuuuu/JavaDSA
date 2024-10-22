package pattern;

import java.util.Scanner;

public class pattern15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int space=num/2;
        int star=1;

        for(int i=1;i<=num;i++){
           for(int j=1;j<=space;j++){
               System.out.print("\t");
           }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();


            if(i<=num/2){
                space--;
                star +=2;

            }else {
                space++;
                star -=2;
            }


        }
    }

    //self made code
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//
//        int space=num/2;
//        int star=1;
//
//        for(int i=1;i<=num;i++){
//            int j=1;
//            int k=1;
//            while(j<space){
//                System.out.print("\t");
//                j++;
//            }
//            while(k<=star){
//                System.out.print("*\t");
//                k++;
//            }
//            System.out.println();
//
//
//            if(i<num/2){
//                space--;
//                star +=2;
//
//            }else {
//                space++;
//                star -=2;
//            }
//
//
//        }
//    }



//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
////        int num=sc.nextInt();
//    int num=5;
//        for(int i=0;i<num*2;i++){
//            if(i<num) {
//                for (int j = 0; j < num * 2; j++) {
//                    if (j < num - i) {
//                        System.out.print("0");
//                    } else if (j-i>num) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(j);
//                    }
//                }
//                System.out.println();
//            }else {
//                for (int j = 1; j <= num * 2; j++) {
//                    if (j <= num - i) {
//                        System.out.print("3");
//                    } else if (j > num - i && j <= num + i && i <= num) {
//                        System.out.print("4");
//                    } else {
//                        System.out.print("5");
//                    }
//                }
//                System.out.println();
//
//
//            }
//
//
//        }
//    }
}

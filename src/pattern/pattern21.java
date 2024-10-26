package pattern;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int space=num/2;
        int star=1;
        int dig=1;

        for(int i=1;i<=num;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            int su=dig;
            for(int j=1;j<=star;j++){
                if(j<=star/2){
                    System.out.print( su+ "\t");
                    su++;
                }else {
                    System.out.print( su+ "\t");
                    su--;
                }


            }
            System.out.println();
            if(i<=num/2){
                space--;
                star +=2;
                dig++;
            }else {
                space++;
                star -=2;
                dig--;
            }

        }
    }
}

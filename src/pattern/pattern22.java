package pattern;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int len=2*num-1;

        for(int i=1;i<=num;i++){
            for(int j=1;j<=len;j++){
                if(j<=i || j>len-i){
                    if(j <=len/2){
                        System.out.print(i+"\t");

                    }else {
                       int count=len-j+1;
                        System.out.print(count+"\t");
                    }
                }else {

                    System.out.print("\t");

                }


            }
            System.out.println();

        }
    }
}

package number;

import java.util.Scanner;

public class GcdLcm {
    public static void GCD(int num1,int num2){
        int answer=0;
        for(int i=1;i<=num1*num2 ;i++){
            if(num1%i==0 && num2%i==0){
                answer=i;
            }
        }
        System.out.println("GCD :"+answer);

    }

    public static void LCM(int num1,int num2){
        int answer=1;
        for(int i=1;i<=num1*num2 ;i++){
            if(i%num1==0 && i%num2==0){
                answer =i;
                break;
            }
        }
        System.out.println("LCM :"+answer);

    }

    public static void PROgcdLCM(int num1,int num2){
        int n1=num1;
        int n2=num2;
        while (num1%num2!=0){
            int mod=num1%num2;
            num1=num2;
            num2=mod;
        }
        int GCD=num2;
        int LCM=(n1*n2)/GCD;
        System.out.println("GCD== :"+GCD);
        System.out.println("LCM== :"+LCM);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        PROgcdLCM(num1,num2);
        GCD(num1,num2);
        LCM(num1,num2);
    }
}

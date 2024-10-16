package number;
import  java.util.Scanner;

public class hcf {

    public  static  int gcd(int num1,int num2){
        int n=Math.min(num1,num2);
        int max=1;

        for(int i=1;i<=n;i++){
            if(num1%i==0 && num2%i==0) {
                max = i;
            }
        }


       return max;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int hcf=gcd(num1,num2);
        System.out.println(hcf);

    }
}

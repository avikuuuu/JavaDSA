package number;
import java.util.Scanner;

public class lcf {

    public static void lcm(int num1,int num2){
        int max= Math.max(num1,num2);

        for(int i=max;i<=num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                System.out.println(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        lcm(num1,num2);


    }
}

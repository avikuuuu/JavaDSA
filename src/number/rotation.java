package number;

import java.util.Scanner;

public class rotation {
    public static int getCount(int num){
//        System.out.println("inside GetCount function");
        int count=0;
//        System.out.println("count :"+count);
        while(num>0){
//            System.out.println("count inter :"+count);
//            System.out.println("num :"+num);
            num /=10;
            count++;
        }
//        System.out.println("exiting count :"+count);
        return count;
    }


    public static  int rot(int num,int k){
        System.out.println("inside rot function");
        System.out.println("num :"+num );
        System.out.println("k :"+k);
        int count=getCount(num);
        System.out.println("count :"+count);
        if(k>num){
            k =k/count;
            System.out.println("k :"+k);
        }
        if(k<0){
            k /=count;
            k=count+k;
            System.out.println("k :"+k);
        }

        int zs=count-k+1;
        System.out.println("zs :"+zs);
        System.out.println("------------------------");
        for(int i=1;i<=k;i++){
            System.out.println("---------start----------");
            int mod=num%10;
            System.out.println("mod :"+mod);
            num /=10;
            System.out.println("num :"+num);
            System.out.println("zs :"+zs);
            int temp=(int)Math.pow(10,zs);
            System.out.println("temp :"+temp);
            num +=temp*mod;
            System.out.println("num :==="+num);
            System.out.println("zs :"+zs);
//            zs++;
            System.out.println("------------end----------");
        }
        System.out.println("-------------------");
        System.out.println("exiting :"+num);
    return  num;

    }


    public static void pepRot(int num,int k){
        int count=getCount(num);

            k =k%count;
//            System.out.println("k :"+k);

        if(k<0){
            k=k+count;
//            System.out.println("k :"+k);
        }
        int div=(int)Math.pow(10,k);
        int multi=(int)Math.pow(10,count-k);

        int rot=num%div;
        num /=div;


        int answer=rot*multi+num;
        System.out.println(answer);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rt=sc.nextInt();
//        System.out.println("num :"+num );
//        System.out.println("rt :"+rt);
//        System.out.println(rot(num,rt));
            pepRot(num,rt);
    }
}

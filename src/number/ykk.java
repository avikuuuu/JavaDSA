package number;

public class ykk {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,3,4,3,5,4,3};
        int len=arr.length;
        int[] temp=new int[len];

        for(int i=0;i<len;i++){
            temp[arr[i]]++;
        }

        for(int ch:temp){
            if(ch>len/2){
                System.out.println(ch);
            }
        }

    }
}

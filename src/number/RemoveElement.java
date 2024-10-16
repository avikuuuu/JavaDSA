package number;

public class    RemoveElement {

    public static int[] str(int arr[],int digit) {

        for(int ar:arr){
            if(ar==digit) {
                ar = -1;
            }
        }
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==-1)
            {
                j = i;
                arr[j++] = arr[i + 1];
                continue;
            }
             arr[j]=arr[i+1];
            j++;
        }


        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,7};
        int digit=2;
        int av[]=str(arr,digit);

        for(int ch:av){
            System.out.println(ch);
        }



    }
}

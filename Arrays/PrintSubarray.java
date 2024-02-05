package Arrays;

public class PrintSubarray {
    public static void printSubarray(int num[]){
        int ts=0;
        int sum = 0;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length;j++){
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+", ");
                    sum+=num[k];
                }
                ts++;
                System.out.print(")"+" ");
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println("Total Subarray: "+ts);
    }

    public static void main(String[] args){
        int num[] = {2,4,6,8,10};
        printSubarray(num);
    }
}

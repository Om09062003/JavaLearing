package Arrays;

public class MaxSubarraySum {
    public static void maxSubarray(int num[]){
        int ts=0;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length;j++){
                System.out.print("(");
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=num[k];
                }
                System.out.print(sum);
                ts++;
                System.out.print(")"+" ");
            }
            if(maxSum<sum){
                maxSum = sum;
            }
            System.out.println();
        }
        System.out.println("Max Sum Is: "+maxSum);
        System.out.println("Total Subarray: "+ts);
    }
}

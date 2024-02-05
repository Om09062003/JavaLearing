package Arrays;

public class LargestNum {
    public static int largestNumber(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length;i++){
            if(largest<number[i]){
                largest = number[i];
            }else if(smallest>number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest is: "+smallest);
        return largest;
    }

    public static void main(String[] agrs){
        int number[] = {2,4,6,3,5};
        int largest = largestNumber(number);
        System.out.println("Number is: "+largest);
    }
}

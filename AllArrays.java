import java.util.Scanner;
import java.util.*;;

public class AllArrays {
    public static void main(String[] args){
    //basic Creat input output
        //int marks[] = new int[50];
        /* Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        for(int i=1; i<=3;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("1st: "+marks[0]);
        System.out.println("2st: "+marks[1]);
        System.out.println("3rd: "+marks[2]);
        System.out.println("4th: "+marks[3]); */

    //Array Length
        //System.out.println(marks.length);

    //Linear Search
        /* int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int index = linearSearch(number, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("The Index Is: "+index);
        }*/ 

    //largest Number
      /*int number[] = {2,4,6,3,5};
        int largest = largestNumber(number);
        System.out.println("Number is: "+largest); */

    //Binary Search
      /*int num[] = {2,4,6,8,10,12,14};
        int key = 25;
        System.out.println("Inder for Key is: "+binarySearch(num, key)); */
    
    //Reverse An Array
        /* int num[] ={2,4,6,8,10,5};
        reverseArray(num);
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(); */

    //Pairs In An Array
        /* int num[]={2,4,6,8,10};
        pairArray(num); */

    } 

//Liner Search
    /* public static int linearSearch(int number[], int key){
        for(int i=0; i<=number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    } */

//largest Number
    /* public static int largestNumber(int number[]){
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
    }   */

//Binary Search
    /* public static int binarySearch(int num[], int key){
        int start = 0, end = num.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }else if(num[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
    
        }
        return -1;
    } */

//Reverse An Arrary
    /* public static void reverseArray(int num[]){
        int first = 0, last = num.length-1;
        while(first<last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
           
            first++;
            last--;
        }
    } */

//Pasirs In an Array
    /* public static void pairArray(int num[]){
        int tp=0;
        for(int i=0; i<num.length; i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Piars: "+tp);
    } */ 
}

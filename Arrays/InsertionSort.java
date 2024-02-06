package Arrays;

public class InsertionSort {
    public static void insertionSort(int num[]){
        for(int i=0; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;
            while(prev >=0 && num[prev]<curr){
                num[prev+1] = num[prev];
                prev--;
            }
            num[prev+1]=curr;
        }
    }

    public static void printArr(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args){
        int num[] = {5, 4, 1, 3, 2};
        insertionSort(num);
        printArr(num);
    }
}

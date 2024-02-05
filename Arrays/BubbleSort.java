package Arrays;
public class BubbleSort {

    public static void bubbleSort(int num[]){
        int temp = 0;
        for(int turn=0; turn<num.length-1; turn++){
            for(int j=0; j<num.length-1-turn; j++){
                if(num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args){
        int num[] = {5, 4, 1, 3, 2};
        bubbleSort(num);
        printArr(num);
    }
}

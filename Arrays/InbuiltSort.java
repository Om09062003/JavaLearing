package Arrays;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {

    public static void printArr(Integer num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args){
        Integer num [] = {5,4,1,3,2};
        //int num[] = {5,4,1,3,2};
        //Arrays.sort(num);
        Arrays.sort(num, 0,3,Collections.reverseOrder());
        printArr(num);
    }
}

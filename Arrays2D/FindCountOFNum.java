package Arrays2D;

public class FindCountOFNum {
    public static void findCountOFNum(int num[][]){
        int countof7=0;
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[0].length; j++){
                if(num[i][j]==7){
                    countof7++;
                }
            }
        }
        System.out.println("Count of 7 are: "+countof7);
    }

    public static void main(String[] args){
        int num[][] = {{4, 7, 8},
                       {8, 8, 7}};
        findCountOFNum(num);
    }
}

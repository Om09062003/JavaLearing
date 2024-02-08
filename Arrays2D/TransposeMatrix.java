package Arrays2D;

public class TransposeMatrix {

    public static void transposeMatrix(int matrix[][]){
        int row=3, col=4;
        int transposeMatrix[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        printArr(transposeMatrix);
    }

    public static void printArr(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};
        transposeMatrix(matrix);
    }
}

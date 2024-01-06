import java.util.Scanner;

public class AllPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //Print Star Triangle
        /* System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****"); */

    //Solid Rectancle
        /* System.out.print("Enter No Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print(" * ");;
            }
            System.out.println();
        } */

    //Hollow Rectangle
        /* System.out.print("Enter The Number of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        } */

    //Half Pyramid
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        } */
    //Inverted Half Pyramid
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        } */

    //Inverted Half Pyramid(Rotated 180 Deg)
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

    //Half Pyramid With Numbers
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        } */

    //Inverted Half Pyramid With Number
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        } */
    
    //Floyd's Triangle
        /* int num=1;
        System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        } */

    //0-1 Tringle
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        } */
        
    //Solid Rombus
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        } */

    //Number Pyramid
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        } */

    //Palindromic Number Pyramid
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        } */



        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        } */

    //Butterfly Pattern
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        //UPPER HALF
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //LOWER HALF
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } */
        
    //Diamond Pattern
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=2; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=2; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        } */

    //Hollow Buterfly ERROR
        /* System.out.print("Enter The Number Of Rows: ");
        int n = sc.nextInt();
        //UPPER HALF
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //LOWER HALF
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

    }
}

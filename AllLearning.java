import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AllLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

    //Java Starting
        /* System.out.println("Hello World"); */

    //Add Two Numbers
        /* int a = 20;
        int b = 30; 
        int sum = a + b;
        System.out.print("Sum of "+ a + " + " + b +" : "+ sum);
        System.out.println(a+b);*/
        
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Sum of Two Number is: "+(a+b)); */

    //IF ELSE
    //Adult or not Adult
        /* System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You Are Adult");
        }else{
            System.out.println("You Are Not Adult");
        }*/

    //Even or Odd Number
        /* System.out.print("Enter YOur Number: ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Your Number Is Even");
        }else{
            System.out.println("Your Number Is Odd");
        } */

    //Greater Then And Less Then
        /* System.out.print("Enter Your First Number 'A': ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second Number 'B': ");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("A equale to B");
        }else if(a < b){
            System.out.println("A Is Less Then B");
        }else if(a > b){
            System.out.println("A Is Greater Then B");
        } */

    //Print The Greeting
        /* System.out.print("Enter The Number 1 or 2 or 3: ");
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("Hello");
        }else if(n == 2){
            System.out.println("Namaste");
        }else if(n == 3){
            System.out.println("Namaskar");
        }else{
            System.out.println("Enter valid Number:");
        } */

    //Power of Four error
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        while(n=Math.pow(4,i)) 
        if(n%4==0){
            int x=n/4;
            if(x%4==0){
                System.out.println(n+"IS power of 4");
            }else{
                System.out.println(n+" Not ");
            }
        }else{
            System.out.println(n+"Not");
        }  */

    //SWITCH Case
        /* System.out.print("Enter The Number 1 or 2 or 3: ");
        int n = sc.nextInt();
        switch(n){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Namaskar");
            break;
            default: System.out.println("Enter Valid Number");

        }*/
        

    //Print Days OF the Week
        /* System.out.print("Enter The Number No of Days In Week: ");
        int n = sc.nextInt();
        switch(n){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thurday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Saturday");
            break;
        } */

    //Make Calculator
       /*  System.out.print("Enter First Number 'A': ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number 'B': ");
        int b = sc.nextInt();
        System.out.print("Enter Operator +,-,*,/ : ");
        String operators = sc.next();
        switch(operators){
            case "+": System.out.println("A + B = "+(a+b));
            break;
            case "-": System.out.println("A - B = "+(a-b));
            break;
            case "*": System.out.println("A * B = "+(a*b));
            break;
            case "/": System.out.println("A / B = "+(a/b));
            break;
            default: System.out.println("Invalid Enter Operator From Given Operators");
        } */

    //Print Name Of Month
        /* System.out.print("Enter The Number Of Month: ");
        int n = sc.nextInt();
        switch(n){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
        } */

    //Print Prime Number
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n/2 ;i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("1 Is Neither Prime Not Composite");
            }else{
                System.out.println("This Is Prime Number");
            }
        }else{
            System.out.println("This Is Not Prime Number");
        } */

    //FOR Loop
    //Print The Number From 0 To 10
        /* for(int i=0; i<=10; i++){
            System.out.print(i + " ");
        } */

    //Print The Sum n Natural Numbers
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of "+ n + " Number is: "+sum); */

    //Print The Table Of Number Input By User
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+(n*i)); 
        } */
    
    //Print Even Numbers Till n
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        } */

    //Print Odd Numbers Till n
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        } */

    //Print Name Infinite Times
        /* System.out.println("Enter Your Name:");
        String name = sc.next();
        for( ; ; ){
            System.out.println(name);
        } */

    //WHILE Loop
    //Print The Number From 0 To 10
        /* int i=0;
        while(i<=10){
            System.out.print(i + " ");
            i++;
        } */

    //DO WHILE loop
    //Print The Number From 0 To 10
        /* int i=0;
        do{
            System.out.print(i + " ");
            i++;
        }while(i<=10); */

    //Infinite loop
        /* System.out.print("Enter The Number: ");
        double n=sc.nextInt();
        do{
            System.out.println(n);
            n++;
        }while(true); */

    //Enter 1 take Input Marks Give Grades Or Enter 0 To Stop
        /* int input;
        do{
            System.out.print("Enter Marks: ");
            int marks= sc.nextInt();
            if(marks>=90){
                System.out.println("This Is Good");
            }else if(marks>=60 && marks<=89){
                System.out.println("This Is Also Good");
            }else if(marks>=59 && marks<=0){
                System.out.println("Can Do Better");
            }else{
                System.out.println("Invalid");
            }
            System.out.print("Enter 1 To Continue Or 0 To Stop: ");
            input = sc.nextInt();
        }while(input==1); */


    //FUNCTIONS
    //Main
        /* public static void main(String[] args){
            myMethod("Ramesh");
            myMethod("Nisha");
            myNumber();
            System.out.println(sum(10 ));

        }
    //Print Name Greeting
        public static void myMethod(String Name) {
            System.out.println("Good Morning "+ Name);       
        }
    //Add 2 Numbers
        public static void myNumber(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("Sum: "+ sum);
        }
    //Add First 1 0 Numbers
        public static int sum(int k){
            if(k>0){
                return k+sum(k-1);
            }else{
                return 0;
            } 
        } */
    

        
        
    // Example Intersection arrays
        /* Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        list1.retainAll(list2);
        Integer[] resultArray = new Integer[list1.size()];
        resultArray = list1.toArray(resultArray);
        System.out.println(Arrays.toString(resultArray)); */
         
    }
}  

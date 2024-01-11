import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AllLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

    //Java Starting
        /* System.out.println("Hello World"); */

    //char number
        /* char a ='a';
        char b ='b';
        System.out.println((int)(b));
        System.out.println((int)(a)); */

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
    
    //Incaome Tax
        /* System.out.print("Enter The Income: ");
        int income = sc.nextInt();
        int tax=0;
        if(income<500000){
            tax=0;
        }else if(income<=500000 && income<1000000){
            tax= (int) (income*0.2);
        }else{
            tax= (int) (income*0.3);
        }
        System.out.println("Your Tax is: "+tax); */

    //Find number Positive or negative
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println(n+" Number is Positive");
        }else{
            System.out.println("Negative");
        } */

    //Have fever or Not
        /* double temp=103.5;
        if(temp>100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You dont have a fever");
        } */

    //leap year
    //1stMethod 
        /* System.out.print("Enter The Year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is a Leap Year");
                }else{
                    
                    System.out.println("Not a Leap Year");
                }
            }else{
                System.out.println("Is a Leap Year");
            }
        }else{
            System.out.println("Not a Leap Year");
        } */
        
    //2nd Method
        /* System.out.print("Enter The Year: ");
        int year = sc.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%100==0) && (year%400==0));
        if(x && (y||z)){
            System.out.println("It Is Leap Year.");
        }else{
            System.out.println("It Is Not A Leap Year.");
        } */
    

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

    //Possitive, Negative, Zero
        /* int positive = 0, negative = 0, zero = 0;
        System.out.print("Enter 1 to continue: ");
        int input = sc.nextInt();
        while(input==1){
            System.out.print("Enter The Number: ");
            int n = sc.nextInt();
            if(n>0){
                positive++;
            }else if(n<0){
                negative++;
            }else{
                zero++;
            }

            System.out.print("Enter 1 to continue or 0 to exit: ");
            input =  sc.nextInt(); 
        }
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+negative);
        System.out.println("Zero: "+zero) */

    //Reverse of Number
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n=n/10;
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

    //Other
    //Power x^n
        /* System.out.print("Enter The 1st Number: ");
        int x = sc.nextInt();
        System.out.print("Enter The 2nd Number: ");
        int n = sc.nextInt(); */
        //1st method
        /* int result = 1;
        for(int i=1; i<=n; i++){
            result = result*x;
        }
        System.out.println(result); */
        //2nd method
        /* double Ans = Math.pow(x, n);
        System.out.println(Ans); */

    //ternary operator
    //Even or odd
        /* System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        String Type = ((n%2)==0)?"even":"odd";
        System.out.println(Type); */

    //Fail or pass
        /* System.out.print("Enter The Numenr: ");
        int mark=sc.nextInt();
        String result = (mark>=33)?"Pass":"Fail";
        System.out.println(result); */

    //Greater or not
        /* int a = 23, b=10;
        boolean x = (a<b) ? true : false;
        int y = (a>b)?a:b;
        System.out.println(x+ " " +y); */

    //Bill
        /* System.out.println("Enter The cost of pencile, pen, eraser: ");
        float pencile = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();

        float totalCost = pencile+pen+eraser;
        System.out.println("Pencile = "+pencile);
        System.out.println("Pen = "+pen);
        System.out.println("Eraser = "+eraser);
        float newTotal = totalCost+(0.18f*totalCost);
        System.out.println("Total = "+totalCost);
        System.out.println("Bill with 18% = "+newTotal); */


    }
}  

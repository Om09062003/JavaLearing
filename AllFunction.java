import java.util.Scanner;

public class AllFunction {

//Main
    public static void main(String[] args){
        /* myMethod("Ramesh");
        myMethod("Nisha");
        myNumber();
        System.out.println(sum(10 )); */
        //doMultiple();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        /*int n = sc.nextInt();  
        int m = sc.nextInt();
        int r = sc.nextInt(); */
        /* int decNum = sc.nextInt();
        decToBin(decNum); */
        /* int binNum = sc.nextInt();
        binToDec(binNum); */
        //myFactorial(n); 
        //System.out.println(binoCoeff(5, 2)); 
        //myNumber(n);
        //myTable(n);
        //myPrime(n);
        //System.out.println(isPrime(5));
        //primesInRang(10);
        //myAverage();
        //myOdd(n);
        //System.out.println(myGreat(n, m));
        //circumferenceOfCircle(r);
        //myAge(n);
        /* System.out.println(sum(4,5,6));
        System.out.println(sum(2.4f, 4.1f)); */

    } 

//Print Name Greeting
    /* public static void myMethod(String Name) {
        System.out.println("Good Morning "+ Name) ;       
    } */

//Add 2 Numbers
    /* public static void myNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum: "+ sum);
    } */

//Mulyiply 2 numbers
    /* public static void doMultiple(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int b = sc.nextInt();
        int multiple = a*b;
        System.out.print("Your Product: "+multiple);
    } */

    
//Add First 1 0 Numbers
    /* public static int sum(int k){
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

//Print name
    /* public static void main(String[] args){
        myName();
    }

    public static void myName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("My Name Is: "+name);
        return;
    } */

//Factorial
    /* public static int myFactorial(int n){
        int Factorial = 1;
        if(n<0){
            System.out.println("Invalid");
        }else{
            for(int i=n; i>=1; i--){
                Factorial = Factorial * i;
            }
            System.out.println("Factorial: "+Factorial);
        }
        return Factorial;binoCoeff(5, 2);
    } */ 

//Binomial Coefficient
    /* public static int binoCoeff(int n, int r){
        int n_fact = myFactorial(n);
        int r_fact = myFactorial(r);
        int nr_fact = myFactorial(n-r);
        int binoCoeff = n_fact/(r_fact*nr_fact);
        return binoCoeff;
    } */    

//Number Is Even Or Odd
    /* public static void myNumber(int n){
        if(n%2==0){
            System.out.println(n+" is Even Number.");
        }else{
            System.out.println(n+" In Odd Number.");
        }
    } */

//Print Table Of N
    /* public static void myTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+ " * "+i+ " = "+(n*i));
        }
    } */

//check Prime Number
    /* public static void myPrime(int n){
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
        }
    } */

//print prime number
    /* public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRang(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }  */

//Find Average
    /* public static void myAverage(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The subject Number: ");
        float n = sc.nextInt();
        float sum = 0;
        for(int i=1; i<=n; i++){
            System.out.print("Enter The Number: ");
            float num = sc.nextInt();
            sum = sum + num;
        }
        float avg = sum/n;
        System.out.println(sum);
        System.out.println(avg);
    } */

//Sum Of Odd Number Form 1 to n
    /* public static void myOdd(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    } */

//Greatest Number 
     /* public static int myGreat(int n, int m){
        if(n>m){
            return n;
        }else{
            return m;
        }
    }*/

//Circumference of Circle
    /* public static void circumferenceOfCircle(int r){
        final double Pi = 3.14;
        double Circumference = 2*Pi*r;
        System.out.println(Circumference);
    } */

//eligible for vote or not
    /* public static  void myAge(int n) {
        if(n>18){
            System.out.println("Eligibale for vote.");
        }else{
            System.out.println("Not eligible for vote.");
        }
    } */

//Function OverLoading
    /* public static int sum(int n, int m){
        return n+m;
    }

    public static int sum(int n, int m, int r){
        return n+m+r;
    }
    public static float sum(float n, float m){
        return n+m;
    } */

//binary to decimal
    /* public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDight = binNum%10;
            decNum = decNum+(lastDight*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal Number Is: "+decNum);
    } */

//decimal to binary
    /* public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;
        while(decNum>0){
            int rem = decNum%2;
            binNum = binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("Binary no is: "+binNum);
    } */

}



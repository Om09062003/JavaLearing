package BitManipulation;

public class BinaryOperators {
    public static void main(String[] args){
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(5 << 2);
        int num = 5;
        int num2 = ~num;
        int num3 = ~(num2);
        int sum = num3 + 1;
        System.out.println(sum);
        System.out.println(6 >> 1);
    }
}

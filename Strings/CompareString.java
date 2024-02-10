package Strings;

public class CompareString {
    public static void main(String[] args){
        String str1 = "Om";
        String str2 = "Om";
        String str3 = new String ("Om");

        if(str1==str2){
            System.out.println("Equals");
        }else{
            System.out.println("Not");
        }

        if(str1 ==str3){
            System.out.println("equal");
        }else{
            System.out.println("NOt");
        }


        if(str1.equals(str3)){
            System.out.println("Equals");
        }else{
            System.out.println("not");
        }

    }
}

package OOPS;

public class ClassObjectT {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(50);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        Student s1= new Student();
        s1.calPercentage(45, 67, 85);
        System.out.print(s1.percentage);
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    int percentage;
    void calPercentage(int phy, int chem, int eng){
        percentage = (phy+chem+eng)/3;
    }
}

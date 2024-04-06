package OOPS;
public class GettersSetters {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(50);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;
    
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }



    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
package OOPS;

public class Inheritance {

    //Single level
    //multi level
    //hierarchial
    //hybrid

    
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
        shark.swim(); 

        Mammal dog = new Mammal();
        dog.eat();
        dog.walk();

        Bird parrot =new Bird();
        parrot.breathe();
        parrot.fly();


        Dog moti = new Dog();
        moti.eat();
        moti.legs = 4;
        System.out.println(moti.legs); 
    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}


//Derived class
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walks");
    }
} 
//Derived class
class Dog extends Mammal{
    String breed;
}


//Derived Class
class Fish extends Animal{
    int Fins;
    void swim(){
        System.out.println("Swims");
    }
} 


//Derived class
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

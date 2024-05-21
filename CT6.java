class Animal{
    void makeSound(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog");
    }
}
class Cat extends Dog{
    void makeSound(){
        super.makeSound();
    }
}


public class CT6 {
    public static void main(String[] args) {
        Animal a=new Animal();
        Animal b=new Dog();
        Dog c=new Cat();
        

        a.makeSound();//this is 
        b.makeSound();
        c.makeSound();
    
    }
}

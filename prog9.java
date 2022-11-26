class Animal{
    protected String dogs = "Bark Bark";
    protected String cats = "Miau Miau";
}

class Dog extends Animal{
   public void function(){
        System.out.println("Dogs says: "+dogs+" Cat says: "+cats);
    }
}

public class prog9{ // public class will apply in only in main function class
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.function();
    }
}
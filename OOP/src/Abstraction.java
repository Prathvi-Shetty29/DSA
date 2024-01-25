abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("created an animal");
    }
    public void eat(){
        System.out.println("animal eats");
    }


}
class horse extends animal{
    horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
    horse h=new horse();

    }
}

class Shape{
    public void area(){
        System.out.println("displays area");
    }
}
class Triange extends Shape{
    public void area(int l,int h){
        System.out.println(1/2 * l *h);
    }
}
class EquilateralTriangle extends Triange{
    public void area(int l,int h){
        System.out.println(1/2 * l *h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triange t1= new Triange();

    }

}

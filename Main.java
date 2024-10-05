class Bird {
    void fly(){
        System.out.println("bird can fly");
    }
}
    class parrot extends Bird{
        
        void color(){
            System.out.println("color is green");
        }
    }
    class singleparrot extends parrot{
        void sing(){
            System.out.println("I can fly");
        }
    }
class cow extends Bird{
    void whatcoloriam(){
        System.out.println("i am black");
    }
}
public class Main {
    public static void main(String[] args){
       parrot p=new parrot();
       cow s=new cow();
       s.whatcoloriam();
       p.fly();
       p.fly();
        p.color();
    

    }
    class A{

    void testmethod(){

    }
    }
    class B extends A{
        int b=2;
        
    }
    interface c{
        int c=3;
    }
    }

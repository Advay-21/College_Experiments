import java.lang.*;
import java.util.*;

class A{
    A()
    {
        System.out.println("IN THE CONSTRUCTOR OF CLASS A");
    }
    public void show()
    {
        System.out.println("THIS IS IN SHOW METHOD OF CLASS A");
    }
        
}
class B extends A{
    B(){
        System.out.println ("IN THE CONSTRUCTOR OF CLASS B");
    }
    public void show()
    {
        System.out.println("THIS IS IN SHOW METHOD OF CLASS B");
    }
}
class C extends B{
    C(){
        super();
        System.out.println ("IN THE CONSTRUCTOR OF CLASS C");
    }
    public void show()
    {
        super.show();
        System.out.println("THIS IS IN SHOW METHOD OF CLASS C");
    }
}
class Main{
    public static void main(String args[]){
        System.out.println("Advay Sharma 60009220147");
        A r; 
        r=new C(); 
        r.show();
        r=new B(); 
        r.show();
    }
}


import java.lang.*;
import java.util.*;
class A{
    A()
    {
        super();
        System.out.println("In the Constructor of Class A");
    }
}
class B extends A{
    B()
    {
        super();
        System.out.println("In the Constructor of Class B");
    }
    B(int a,int b)
    {
        this();
        System.out.println("Addition of "+a+"+"+b+"="+(a+b));    
    }
}
class C extends B{
    C()
    {
        super(10,20);
         System.out.println("In the Constructor of Class C");
    }
    C(int a)
    {
        this();
        System.out.println("Value of a="+a);  
    }
}

class Main
{
    public static void main(String args[])
    {
        System.out.println("Advay Sharma 60009220147");
        C obj=new C(20);
        
    }
}

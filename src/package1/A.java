package package1;

public class A {
    
    int x = 10;
    protected static int y = 20;
    
}

class B extends A {
    
    public static void m(){
        System.out.println(A.y);
    }
    
}

class C {
    
    public static void m(){
        System.out.println(A.y);
    }
    
}

class Test {
    
    public static void main(String[] args) {
        
        B b = new B();
        System.out.println(b.x);
        System.out.println(b.y);
    }
    
}
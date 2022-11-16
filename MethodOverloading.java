
//Method overloading
public class MethodOverloading {

    //This is a constructor
    MethodOverloading() {
        System.out.println("Constructor called");
    }

    //Main method showing method overloading
    public static void main(String[] args) {
        add(20, 30);//calling with 2 parameters
        add(10.3, 22.4);//calling with 2 parameters but different datatype
        add(2, 3, 4);//calling with multiple parameters
    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
//Creating object
        MethodOverloading mOver= new MethodOverloading();

    }

    //different datatype
    public static void add(double a, double b) {
        System.out.println(a + b);
        MethodOverloading NOver= new MethodOverloading();
    }

    //multiple parameters
    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

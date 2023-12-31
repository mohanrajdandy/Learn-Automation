package Datatypes;
public class Swap {
    public static void main(String[] args) {

        int a=30, b=60;
        /* int a = 10, b = 20;
        int t = a;
        a = b;
        b = t; */
        System.out.println("Before swapping values are...." + a + " " + b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping values are...." + a + " " + b);

    }
}

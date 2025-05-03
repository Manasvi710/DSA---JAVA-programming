package oop;

public class polymorphism_Ex {
    public static void main(String[] args) {
        //1.compile time - (method overloading)
        sum(10,20);
        sum(10,20,30);
        sum(10,20);
    }
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    //1. method overloading by changing No. of arguments
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    //Method overloading by changing type of arguments
    public static void sum(double a, double b){
        System.out.println(a+b);
    }
    //method overloading not possible by changing return type
//    public static int sum(int a, int b){
//        System.out.println(a+b);
//        return 0;
//    }
}

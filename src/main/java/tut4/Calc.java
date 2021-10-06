package tut4;


public class Calc
{
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(subtract(7,4));
    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int subtract(int a, int b){
        int sub = a - b;
        return sub;
    }
}

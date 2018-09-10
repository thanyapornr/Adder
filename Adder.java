import java.util.*;
class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.print("Y = ");
        int y = sc.nextInt();
        int z = x-y;
        System.out.println("Sum = "+z);
    }
}
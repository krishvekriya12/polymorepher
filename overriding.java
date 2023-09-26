import java.util.Scanner;

public class overriding {
    public static void main(String[] args) {

        Triangle k = new Triangle();
        k.Calculate();

    }

}

class Ractangle {

    Scanner scanner = new Scanner(System.in);
    double lenght;
    double width;

    public void Calculate() {

        System.out.print("Enter any lenght = ");
        lenght = scanner.nextDouble();
        System.out.print("Enter any width = ");
        width = scanner.nextDouble();

        System.out.println("enter ant Area of Ractangle = " + (lenght * width));
        System.out.println();

    }

}

class Triangle extends Ractangle {

    double base;
    double hight;

    public void Calculate() {
        super.Calculate();

        System.out.print("Enter any base = ");
        base = scanner.nextDouble();
        System.out.print("Enter any hight  = ");
        hight = scanner.nextDouble();

        System.out.println("enter any traingale number = " + (base * hight / 2));
    }

}
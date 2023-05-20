package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("introduceti a= ");
        int a= input.nextInt();
        System.out.println("introduceti b= ");
        int b= input.nextInt();
        System.out.println("introduceti c= ");
        int c= input.nextInt();
        double delta;
        double x1=0,x2=0;
        delta=(Math.pow(b,2))-(4*a*c);
        if (delta>0){
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.print("x1= ");
            System.out.println(x1);
            System.out.print("x2= ");
            System.out.println(x2);
        }
        else System.out.println("Delta negative");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}

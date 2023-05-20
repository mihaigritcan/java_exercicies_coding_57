package Task4;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("introduceti numar intreg i= ");
        int i=input.nextInt();
        String a[]=new String[i];
        for(int j=1;j<i;j++){
            if ((j%3==0)&&(j%7==0)) {
                a[j]="FizzBuzz";
            } else if (j%3==0){
                a[j]="Fizz";
            } else if (j%7==0) {
                a[j]="Buzz";
            }
            else a[j]= Integer.toString(j);
        }
        for(int j=1;j<i;j++){
            System.out.println(a[j]);
        }
    }
}

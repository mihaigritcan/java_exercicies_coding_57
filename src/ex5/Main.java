package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sa se calculeze suma, diferenta, produsul, impartirea a 2 numere introduse de la tatatura.
        //pentru fiecare operatie sa existe metode separate
        Scanner scaner=new Scanner(System.in);
        System.out.println("introduceti a: ");
                int a=scaner.nextInt();
        System.out.println("introduceti b: ");
                int b= scaner.nextInt();
        //System.out.println(a);
//        System.out.println("suma= "+sum(a,b));
//        System.out.println("diferenta= "+dif(a,b));
//        System.out.println("impartirea= "+impartire(a,b));
//        System.out.println("inmultirea= "+inmultire(a,b));
        //bucla infinita
        while(true){
            printMesage();
          int optiune=scaner.nextInt();
          if(optiune==0){
              System.out.println("multumim");
              break;
          }
          switch (optiune){
              case 1:
                  System.out.println(sum(a,b)); break;
              case 2:
                  System.out.println(dif(a,b));break;
              case 3:
                  System.out.println(impartire(a,b));break;
              case 4:
                  System.out.println(inmultire(a,b));   break;
              default:
                  System.out.println("optiune incorecta");
          }
        }
    }
    public static int sum(int x, int y){
        int s=x+y;
        return s;
    }

    public static int dif(int x, int y){
        int d=x-y;
        return d;
    }
    public static int impartire(int x, int y){
        int d=x/y;
        return d;
    }
    public static int inmultire(int x, int y){
        int d=x*y;
        return d;
    }
    public static void printMesage(){
        System.out.println("selectati o optiune de mai jos:");
        System.out.println("1.adunare");
        System.out.println("2.diferenta");
        System.out.println("3.impartirea");
        System.out.println("4.inmultirea");
    }
}


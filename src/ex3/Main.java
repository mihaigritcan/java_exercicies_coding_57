package ex3;

public class Main {
    //sa se gaseasca primele 15 numere divizibile cu 5;
    public static void main(String[] args) {
        int i = 1, c = 0;
        while (c <= 15) {
            if (i % 5 == 0) {
                System.out.println(i);
                c++;
            }
            i++;
        }

    }

}

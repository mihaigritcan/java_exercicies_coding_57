package ex4;

public class Main {
    public static void main(String[] args) {
        //sa se calculeze suma primelor 10 nr divizibile cu 5 si cu 2;
        int i = 1, c = 0, s = 0;
        while (c < 10) {
            if ((i % 5 == 0) && (i % 2 == 0)) {
                s = s + i;
                c++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Suma primelor numere divisibile cu 5 si 2 este S="+s);
    }
}

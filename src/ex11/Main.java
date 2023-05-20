package ex11;

import javax.swing.text.AttributeSet;

public class Main {
    public static void main(String[] args) {
        //sa se calculeze numarul de vocale din urmatorul text.
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        for(int j=0;j<text.length();j++) {
            char caracter = text.toLowerCase().charAt(j);
//        if(caracter=='a'|| caracter=='A'){
//            a++;
//        } else if (caracter=='e'|| caracter=='E') {
//            e++;
//        } else if (caracter=='i'|| caracter=='I') {
//            i++;
//        } else if (caracter=='o'|| caracter=='O') {
//            o++;
//        } else if (caracter=='u'|| caracter=='U') {
//            u++;
//        }

            switch (caracter) {
                case 'a':a++;
                break;
                case 'e':e++;break;
                case 'i':i++;break;
                case 'o':o++;break;
                case 'u':u++;break;

            }
        }
        int nrVocale=a+e+i+o+u;
        System.out.println("Numarul de total de vocale = "+nrVocale);
        System.out.println("a: "+a);
        System.out.println("e: "+e);
        System.out.println("i: "+i);
        System.out.println("o: "+o);
        System.out.println("u: "+u);
    }
}

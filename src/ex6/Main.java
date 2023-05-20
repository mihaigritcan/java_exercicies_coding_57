package ex6;

public class Main {
    public static void main(String[] args) {
        /*

         */
        Dog rex=new Dog("Rex",2);
        Dog bob=new Dog("bob",3);
        Dog puffy=new Dog("puffy",5);
       // System.out.println(rex.getName()+rex.getAge());
//        rex.setName("Bob");
//        rex.setAge(1);
//        System.out.println(rex.getName()+rex.getAge());
//        System.out.println(rex);
        Dog dogList[]=new Dog[3];
        dogList[0]=rex;
        dogList[1]=bob;
        dogList[2]=puffy;
//        for(int i=0;i<dogList.length;i++){
//            System.out.println(dogList[i].toString());
//        }
        for (Dog dog:dogList) {
            System.out.println(dog);
        }
    }
}

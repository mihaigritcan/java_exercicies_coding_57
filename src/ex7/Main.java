package ex7;

public class Main {
    public static void main(String[] args) {
        //sa se construiasca clasa cu numele Car cu proprietatile: brand, model, combustibil, cai putere
        //sa se introduca 3 obiecte de tipul Car, unul pe benzina si 2 pe motorina
        //sa se afiseze doar masinile pe benzina dupa parcurgerea unui for

        Car masina1=new Car("Opel","Astra","disel",140);
        Car masina2=new Car("BMW","X5","disel",270);
        Car masina3=new Car("BMW","M5","Benzina",600);
        Car carList[]=new Car[3];
        carList[0]=masina1;
        carList[1]=masina2;
        carList[2]=masina3;
        for(int i=0;i< carList.length;i++){
            if(carList[i].getTipCombustibil().equals("Benzina")){
                System.out.println(carList[i].toString());
            }
        }
    }
}

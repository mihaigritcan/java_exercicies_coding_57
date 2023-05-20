package ex6;

public class Dog {
    private String name;
    private int age;

    //constructorul are acelasi nume ca si clasa
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return "Nume:"+this.name+", varsta: "+this.age;
    }
}

package ex7;

public class Car {
    //brand, model, combustibil, cai putere
    private String brand;
    private String model;
    private String tipCombustibil;
    private int caiPutere;
    public Car(String brand,String model,String tipCombustibil,int caiPutere){
        this.brand=brand;
        this.model=model;
        this.tipCombustibil=tipCombustibil;
        this.caiPutere=caiPutere;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipCombustibil() {
        return tipCombustibil;
    }

    public void setTipCombustibil(String tipCombustibil) {
        this.tipCombustibil = tipCombustibil;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", tipCombustibil='" + tipCombustibil + '\'' +
                ", caiPutere=" + caiPutere +
                '}';
    }
}

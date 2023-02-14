package Подкатегория.Telefon;

import Подкатегория.Подкатегория;

public class Telefon extends Подкатегория {
    private int price;
    private String brand;

    public Telefon(String name, int price, String yearsOldMade, int price1, String brand) {
        super(name, price, yearsOldMade);
        this.price = price1;
        this.brand = brand;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public static String on(){
        return "Zaryad tolot";
    }
    public static String off(){
        return "Zaryad ochot";
    }

    @Override
    public String toString() {
        return "Telefon {"+"Brendi: " +getBrand()+" Aty: "+getName()+" Jasalgan jyly: "+getYearsOldMade()+
                " Tusu: " + price +
                ", brendi: " + brand + '\'' + on()+ ". "+off()+'}';
    }
}

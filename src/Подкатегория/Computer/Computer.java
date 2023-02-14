package Подкатегория.Computer;

import Подкатегория.Подкатегория;

public class Computer extends Подкатегория {
    private int price1;
    private  String kolomu;

    public Computer(String name, int price, String yearsOldMade, int price1, String kolomu) {
        super(name, price, yearsOldMade);
        this.price1 = price1;
        this.kolomu = kolomu;
    }


    @Override
    public int getPrice() {
        return price1;
    }

    @Override
    public void setPrice(int price) {
        this.price1 = price;
    }

    public String getKolomu() {
        return kolomu;
    }

    public void setKolomu(String kolomu) {
        this.kolomu = kolomu;
    }
    public static String cod(){
        return "Cod jazat";
    }
    public static String conNo(){
        return "Cod jazbayt";
    }

    @Override
    public String toString() {
        return "Computer {"+"Aty: "+getName()+" Baasy: "+getPrice()+" Jasalgan jyly: "+getYearsOldMade()+
                " Baasy " + price1 +
                ", kolomu: " + kolomu + '\'' + cod()+". "+conNo()+'}';
    }
}

package Подкатегория.SmartChasy;

import Подкатегория.Подкатегория;

public class SmartChasy extends Подкатегория {
    private String baasy;
    private String color;

    public SmartChasy(String name, int price, String yearsOldMade, String baasy, String color) {
        super(name, price, yearsOldMade);
        this.baasy = baasy;
        this.color = color;
    }

    public String getBaasy() {
        return baasy;
    }

    public void setBaasy(String baasy) {
        this.baasy = baasy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static String ayt(){
        return "Saatty aytat";
    }
    public static String aytpayt(){
        return "Saatty aytpayt";
    }

    @Override
    public String toString() {
        return "SmartChasy {"+"Aty: " + getName()+" Baasy: "+getPrice()+" Jasalgan jyly: " +getYearsOldMade()+
                " baasy: " + baasy + '\'' +
                ", Tusu " + color + '\'' + ayt()+"."+
                aytpayt()+'}';
    }
}

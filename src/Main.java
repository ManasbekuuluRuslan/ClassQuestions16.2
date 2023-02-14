import Подкатегория.Computer.Computer;
import Подкатегория.Computer.Lenovo;
import Подкатегория.Computer.MAC;
import Подкатегория.SmartChasy.AppleWatch;
import Подкатегория.SmartChasy.Miband;
import Подкатегория.SmartChasy.SmartChasy;
import Подкатегория.Telefon.Iphone;
import Подкатегория.Telefon.Samsung;
import Подкатегория.Telefon.Telefon;
import Подкатегория.Подкатегория;

public class Main {
    public static void main(String[] args) {
        Computer lenovo = new Lenovo("Asus", 20000, "10.04.2015.", 20000, "24 mw");
        Computer mac = new MAC("MacBookPro",120000,"10.01.2017",120000,"24/12");
        SmartChasy appleWatch = new AppleWatch("IphonePro", 3000,"2019year","3000","Black");
        SmartChasy miband = new Miband("MiBand",7000,"12.11.2018","7000","White");
        Telefon samsung = new Samsung("Samsung A22",25000,"15.06.2021",25000,"Samsung");
        Telefon iphone = new Iphone("Iphone13ProMax",99000,"10.10.2022",99000,"IPhone");

        Подкатегория [] a = {lenovo, mac, appleWatch, miband, samsung,iphone};
        for(Подкатегория pod: a) {
            System.out.println(pod.toString());
        }
    }

}
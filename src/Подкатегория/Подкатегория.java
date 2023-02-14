package Подкатегория;

public class Подкатегория {
    private  String name;
    private  int price;
    private  String yearsOldMade;

    public Подкатегория(String name, int price, String yearsOldMade) {
        this.name = name;
        this.price = price;
        this.yearsOldMade = yearsOldMade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int  price) {
        this.price = price;
    }

    public String getYearsOldMade() {
        return yearsOldMade;
    }

    public void setYearsOldMade(String yearsOldMade) {
        this.yearsOldMade = yearsOldMade;
    }


    @Override
    public String toString() {
        return "Подкатегория{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", yearsOldMade='" + yearsOldMade + '\'' +
                '}';
    }
}


package opgave02;

public class Softdrink {
    String name;
    int energi;
    int portionSize;

    public Softdrink(String name, int energi, int portionSize) {
        this.name = name;
        this.energi = energi;
        this.portionSize = portionSize;
    }

    public static void main(String[] args) {
        Softdrink[] drinks = {
                new Softdrink("Kildevæld", 0, 500),
                new Softdrink("Faxe Kondi Booster",204, 500),
                new Softdrink("Faxe Kondi Free",0,330),
        };
    }

    public static void print(Softdrink[] drinks) {
       int sum = 0;
       for (Softdrink d : drinks) {
           System.out.println(d.name + d.portionSize + d.energi);
       }
    }




}

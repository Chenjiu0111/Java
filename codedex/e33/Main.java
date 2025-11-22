package e33;
class Neopet {
    String name;
    String species;
    String color;
    char gender;
    boolean hasScarf;
}
public class Main {
    public static void main(String[] args) {
       Neopet neopet = new Neopet();
       neopet.name ="Gravatia";
       neopet.species="Eyrie";
       neopet.color="Blue";
       neopet.gender='F';
       neopet.hasScarf=false;
        System.out.println(neopet.name
        +" "+neopet.species
        +" "+neopet.color
        +" "+neopet.gender
        +" "+neopet.hasScarf);

    }
}


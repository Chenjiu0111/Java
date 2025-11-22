package e34;

class Neopet {
    String name;
    String species;
    String color;
    char gender;
    boolean hasScarf;
    double strength;
    double defense;
    double movement;
    Neopet() {
        strength = 0.0;
        defense = 0.0;
        movement = 0.0;
    }
}
class Computer {
    String model;
    String brand;
    int serialNumber;
    double version;

    // Constructor
    Computer() {
        version = 0.0;
    }
}
public class Main {
    public static void main(String[] args) {
        Neopet neopet = new Neopet();
        neopet.name ="Gravatia";
        neopet.species="Eyrie";
        neopet.color="Blue";
        neopet.gender='F';
        neopet.hasScarf=false;
        neopet.strength=6.2;
        neopet.defense=2.5;
        neopet.movement=5.5;
        System.out.println(neopet.name
                +" "+neopet.species
                +" "+neopet.color
                +" "+neopet.gender
                +" "+neopet.hasScarf);
        System.out.println("S: " + neopet.strength);
        System.out.println("D: " + neopet.defense);
        System.out.println("M: " + neopet.movement);

    }
}


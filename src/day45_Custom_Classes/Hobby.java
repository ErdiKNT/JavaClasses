package day45_Custom_Classes;

public class Hobby {
    /*
    - data:

            name, annual cost, is outdoors (boolean), requires others (boolean)
     */
    String name;
    double annualCost;
    boolean isOutDoor;
    boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutDoor, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutDoor = isOutDoor;
        this.requiresOthers = requiresOthers;
    }


    public void Doing(){
        System.out.println("Doing " + name + " isOutdoor: " + isOutDoor);
    }

    @Override
    public String toString() {
        return "\n ~ Hobby name: " + name + "\n annualCost is: $" + annualCost + "\n isOutdoor: " + isOutDoor + "\n requiresOthers: " + requiresOthers;
    }
}

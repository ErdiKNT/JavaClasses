package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        String houseType = "Penthouse";
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 4;
        int numberOfKitchens = 1;
        boolean hasBasement = true;
        boolean hasPool = true;
        boolean isOnSale = false;
        double costOfHouse = 1_000_000.99;
        String address = "53 Barb Street, NY/StatenIsland";
        int zipCode = 10305;
        boolean hasPark = true;
        String houseInfo = "The " + houseType +" on " + address + ", " + zipCode + " costs " + costOfHouse + "$ "
                + "\nThe " + houseType + " has " + numberOfBathrooms +" bathrooms, " + numberOfBedrooms + " bedrooms, " +
                numberOfKitchens + " kitchen\nIt also includes a basement: " +hasBasement + " has a pool: " + hasPool
                + " has park: " + hasPark + " is on sale: " + isOnSale;

        System.out.println(houseInfo);

    }
}

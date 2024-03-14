import java.util.ArrayList;

public class House extends Building {
    private ArrayList<String> residents;
    private boolean hasDiningRoom;

  /**
   * Constructs a House object with attributes
  **/
    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.residents = new ArrayList<>();
        this.hasDiningRoom = hasDiningRoom;
        System.out.println("You have built a house: 🏠");
    }

    /**
     * Checks if the house has a dining room.
    **/
    public boolean hasDiningRoom() {
        return hasDiningRoom;
    }
    /**
     * Gets the number or residents.
    **/
    public int nResidents() {
        return residents.size();
    }
    /**
     * Adds a resident to the house.
    **/
    public void moveIn(String name) {
        residents.add(name);
    }
    /**
     * Removes a resident from the house.
    **/
    public String moveOut(String name) {
        residents.remove(name);
        return name;
    }
    /**
     * Checks if the resident lives in the house.
    **/
    public boolean isResident(String person) {
        return residents.contains(person);
    }
}

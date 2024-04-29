import java.util.ArrayList;

/**
 * Represents a residential building.
 */
public class House extends Building {
    private ArrayList<String> residents;
    private boolean hasDiningRoom;

    /**
     * Constructs a House object with attributes.
     */
    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
        super(name, address, nFloors);
        residents = new ArrayList<>();
        this.hasDiningRoom = hasDiningRoom;
        System.out.println("You have built a house: 🏠");
    }

    /**
     * Checks if the house has a dining room.
     */
    public boolean hasDiningRoom() {
        return hasDiningRoom;
    }

    /**
     * Gets the number of residents.
     */
    public int nResidents() {
        return residents.size();
    }

    /**
     * Adds a resident to the house.
     */
    public void moveIn(String name) {
        residents.add(name);
    }

    /**
     * Removes a resident from the house.
     */
    public String moveOut(String name) {
        boolean removed = residents.remove(name);
        return removed ? name : null; // Resident not found
    }

    /**
     * Checks if the resident lives in the house.
     */
    public boolean isResident(String person) {
        return residents.contains(person);
    }
}
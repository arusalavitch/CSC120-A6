import java.util.Hashtable;

/**
 * Represents a library building.
 */
public class Library extends Building {
    private Hashtable<String, Boolean> bookAvailability;

    /**
     * Constructs a Library object.
     */
    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        bookAvailability = new Hashtable<>();
        System.out.println("You have built a library: 📖");
    }

    /**
     * Adds a book to the library.
     */
    public void addTitle(String title) {
        bookAvailability.put(title, true); // Set the book as available
    }

    /**
     * Removes a book from the library.
     */
    public String removeTitle(String title) {
        return bookAvailability.remove(title) != null ? title : null; // Title not found
    }

    /**
     * Checks out a book from the library.
     */
    public void checkOut(String title) {
        bookAvailability.put(title, false); // Set book as unavailable
    }

    /**
     * Returns a book to the library.
    */
    public void returnBook(String title) {
        bookAvailability.put(title, true); // Set book as available
    }

    /**
     * Checks if the library contains a specific title.
    */
    public boolean containsTitle(String title) {
        return bookAvailability.containsKey(title);
    }

    /**
     * Checks if a book is available in the library.
     */
    public boolean isAvailable(String title) {
        Boolean availability = bookAvailability.get(title);
        return availability != null ? availability : false; // Title not found
    }

    /**
     * Prints out the entire collection in an easy-to-read way (including checkout status).
     */
    public void printCollection() {
        System.out.println("Library Collection:");
        for (String title : bookAvailability.keySet()) {
            System.out.println(title + " - Available: " + bookAvailability.get(title));
        }
    }
}
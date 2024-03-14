import java.util.ArrayList;

public class Library extends Building {
    private ArrayList<String> bookTitles;
    private ArrayList<Boolean> bookAvailabile;

    /**
     * Constructs a Library object.
     */
    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.bookTitles = new ArrayList<>();
        this.bookAvailabile = new ArrayList<>();
        System.out.println("You have built a library: 📖");
    }

    /**
     * Adds a book to the library.
     */
    public void addTitle(String title) {
        bookTitles.add(title);
        bookAvailabile.add(true); // Set the book as available
    }

    /**
     * Removes a book from the library.
     */
    public String removeTitle(String title) {
        int index = bookTitles.indexOf(title);
        if (index != -1) {
            bookAvailabile.remove(index);
            return bookTitles.remove(index);
        } else {
            return null; // Title not found
        }
    }

    /**
     * Checks out a book from the library.
     */
    public void checkOut(String title) {
        int index = bookTitles.indexOf(title);
        if (index != -1) {
            bookAvailabile.set(index, false); // Set book as unavailable
        } else {
            System.out.println("Title not found in the collection.");
        }
    }

    /**
     * Returns a book to the library.
    */
    public void returnBook(String title) {
        int index = bookTitles.indexOf(title);
        if (index != -1) {
            bookAvailabile.set(index, true); // Set book as available
        } else {
            System.out.println("Title not found in the collection.");
        }
    }

    /**
     * Checks if the library contains a specific title.
    */
    public boolean containsTitle(String title) {
        return bookTitles.contains(title);
    }

    /**
     * Checks if a book is available in the library.
     */
    public boolean isAvailable(String title) {
        int index = bookTitles.indexOf(title);
        if (index != -1) {
            return bookAvailabile.get(index);
        } else {
            return false; // Title not found
        }
    }

    /**
     * Prints out the entire collection in an easy-to-read way (including checkout status).
     */
    public void printCollection() {
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println(bookTitles.get(i) + " - Available: " + bookAvailabile.get(i));
        }
    }
}

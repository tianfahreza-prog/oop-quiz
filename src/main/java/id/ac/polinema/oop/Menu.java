package id.ac.polinema.oop;

/**
 * The cafe menu: holds up to 10 {@link MenuItem} objects.
 *
 * This is an AGGREGATION: the MenuItem objects are created outside
 * and passed in — they can exist without the Menu.
 *
 * Complete every method body below (replace the
 * {@code throw new UnsupportedOperationException(...)} lines).
 * Use a plain array, NOT List/ArrayList.
 *
 * Declare the fields yourself: see the class diagram in the README
 * (all fields must be private).
 */
public class Menu {

    /**
     * Creates an empty menu: initialize the array with capacity 10
     * and the counter with 0.
     */

    private String[] Menu = new String[10];
    private int count;

    public Menu(String[] Menu, int capacity, int count) {
        this.Menu = Menu;
        capacity = 10;
        count = 0;
    }

    /**
     * Adds an item at index {@code itemCount}, then increments the counter.
     * When the menu is full (10 items), do nothing.
     *
     * @param item the menu item to add
     */
    public void addMenuItem(MenuItem item, int count, String Tambah) {
        if (count < 10) {
            Menu[count] = Tambah;
            count++;
        }
    }

    /**
     * Searches the stored items by exact name.
     *
     * @param name item name to look for
     * @return the matching MenuItem, or {@code null} when not found
     */
    public MenuItem findItem(MenuItem name, String[] Menu) {
        for (int i = 0; i < Menu.length; i++) {
            if (Menu[i].equals(name)) {
                return name;
            }
        }
        return null;
    }

    public int getItemCount() {
        return count;
    }
}

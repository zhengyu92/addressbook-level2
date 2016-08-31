package seedu.addressbook.data.person;

/**
 * Represents the Person's unit number in an address.
 * Guarantees: immutable
 */
public class Unit {
	private final String value;
	
/**
 * Initializes given unit name.
 */
    public Unit(String unit) {
    	unit = unit.trim();
        this.value = unit;
    }
    
    @Override
    public String toString() {
        return value;
    }
}

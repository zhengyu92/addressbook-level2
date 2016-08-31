package seedu.addressbook.data.person;

/**
 * Represents the Person's Postal Code in an address.
 * Guarantees: immutable
 */
public class PostalCode {
	private final String value;
	
/**
 * Initializes given unit name.
 */
    public PostalCode(String postalCode) {
    	postalCode = postalCode.trim();
        this.value = postalCode;
    }
    
    @Override
    public String toString() {
        return value;
    }
}

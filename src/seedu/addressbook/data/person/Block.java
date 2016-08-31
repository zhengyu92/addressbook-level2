package seedu.addressbook.data.person;

/**
 * Represents a Person's block number in the address book.
 * Guarantees: immutable
 */
public class Block {
	private final String value;
	
/**
 * Initialize block number
 */	
	public Block(String block){
		block = block.trim();
		this.value = block;
	}
	
	@Override
	public String toString(){
		return value;
	}
}

package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.*; 

/**
 * Represents tagging in the address book.
 * Guarantees: immutable
 */
public class Tagging {
	
	private char _addOrRemoveSign;
	private final Person _person;
	private final Tag _tag;
	
	public Tagging(char addOrRemoveSign, Person person, Tag tag) {
		_addOrRemoveSign = addOrRemoveSign;
		_person = person;
		_tag = tag;
	}
	
	public String toString() {
		return _addOrRemoveSign + " " + _person.getName() + " " + _tag;
	}
}

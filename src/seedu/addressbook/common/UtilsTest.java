package seedu.addressbook.common;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import seedu.addressbook.data.person.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UtilsTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void isAnyNull_returnsBoolean()
	{
		assertTrue(Utils.isAnyNull(Name.EXAMPLE,Phone.EXAMPLE,Email.EXAMPLE,Address.EXAMPLE,null));
		assertTrue(Utils.isAnyNull(null,Phone.EXAMPLE,Email.EXAMPLE,Address.EXAMPLE,null));
		assertTrue(Utils.isAnyNull((Object)null));
		assertTrue(Utils.isAnyNull(new Object[] {null,null}));

		assertFalse(Utils.isAnyNull(Name.EXAMPLE,Phone.EXAMPLE,Email.EXAMPLE,Address.EXAMPLE));
		assertFalse(Utils.isAnyNull());
		assertFalse(Utils.isAnyNull(new Object[] {Name.EXAMPLE,Phone.EXAMPLE}));
		assertFalse(Utils.isAnyNull(new String()));
	}

	@Test
	public void elementsAreUnique_returnsBoolean()
	{
		assertTrue(Utils.elementsAreUnique(generateUniqueTestCollection()));

		assertFalse(Utils.elementsAreUnique(generateRepeatTestCollection()));

		thrown.expect(NullPointerException.class);
		Utils.elementsAreUnique(null);
	}

	public Collection<?> generateUniqueTestCollection()
	{
		final List<String> collection = Arrays.asList("key1", "key2", "key3");

		return collection;
	}
	public Collection<?> generateRepeatTestCollection()
	{
		final List<String> collection = Arrays.asList("key1", "key1", "key3");

		return collection;
	}	
}

package org.pure4j.checker.collections;

import java.util.Enumeration;
import java.util.Vector;

import org.junit.Test;
import org.pure4j.annotations.pure.Pure;
import org.pure4j.checker.AbstractChecker;
import org.pure4j.collections.EnumerationSeq;
import org.pure4j.collections.ISeq;

public class EnumerationSeqExample extends AbstractChecker {

	@Pure
	public <K> void checkSeq(ISeq<K> in, int expectedLength, K expectedFirst) {
		
		assertEquals(expectedLength, in.count());
		assertEquals(expectedFirst, in.first());
	}
	
	
	@Test
	public void sanityTest() {
		Vector<String> items = new Vector<String>();
		items.add("first");
		items.add("second");
		items.add("third");
		
		Enumeration<String> elements = items.elements();
		ISeq<String> seq = new EnumerationSeq<String>(elements);
		checkSeq(seq, 3, "first");
		checkSeq(seq, 3, "first");
		checkSeq(seq.next(), 2, "second");
		checkSeq(seq, 3, "first");
		checkSeq(seq.next().next(), 1, "third");
		
		log("seq: "+seq);		
	}
}

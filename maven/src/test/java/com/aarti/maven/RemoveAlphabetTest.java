package com.aarti.maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAlphabetTest {
	
	RemoveAlphabet removealphabet;
	
	@BeforeEach
	void setUp() {
		removealphabet = new RemoveAlphabet();
	}

	@Test
	void testRemove4() {
		assertEquals("BCD",removealphabet.remove("ABCD"));
	}
	
	@Test
	void testRemove1() {
		assertEquals("CD",removealphabet.remove("AACD"));
	}
	
	@Test
	void testRemove2() {
		assertEquals("BCD",removealphabet.remove("BACD"));
	}
	
	@Test
	void testRemove3() {
		assertEquals("",removealphabet.remove(""));
	}
	
	@Test
	void testRemove5() {
		assertEquals("",removealphabet.remove("A"));
	}
	
	@Test
	void testRemove6() {
		assertEquals("B",removealphabet.remove("B"));
	}
	
	@Test
	void testRemove7() {
		assertEquals("",removealphabet.remove("AA"));
	}
	
	@Test
	void testRemove8() {
		assertEquals("B",removealphabet.remove("BA"));
	}
	
	@Test
	void testRemove9() {
		assertEquals("B",removealphabet.remove("AB"));
	}
	
	@Test
	void testRemove10() {
		assertEquals("BC",removealphabet.remove("BC"));
	}
	
	@Test
	void testRemove11() {
		assertEquals("BAA",removealphabet.remove("AABAA"));
	}
	
	@Test
	void testRemove12() {
		assertEquals("BBAA",removealphabet.remove("BBAA"));
	}
	

}

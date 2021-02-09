/**
 * 
 */
package com.syedbaqirali.materialfirst.utils;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * @author rever
 *
 */
public class Utility {
	private final String myObj = "Hello";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		List<String> lines = multilineString.lines().filter(line -> !line.isBlank()).map(String::strip)
				.collect(Collectors.toList());
//		assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");
	}

	@Test
	void addition() {
		assertEquals("Hello", myObj);
		System.out.println("Testing");
	}

}

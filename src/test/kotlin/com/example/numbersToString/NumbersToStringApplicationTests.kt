package com.example.numbersToString

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class NumbersToStringApplicationTests {

	val trans = numberToString()
	@Test
	fun contextLoads() {
	}

	@Test
	fun `one to nineteen`() {
		assertEquals("one", trans.oneTonineteen(1))
		assertEquals("two", trans.oneTonineteen(2))
		assertEquals("three", trans.oneTonineteen(3))
		assertEquals("four", trans.oneTonineteen(4))
		assertEquals("five", trans.oneTonineteen(5))
		assertEquals("six", trans.oneTonineteen(6))
		assertEquals("seven", trans.oneTonineteen(7))
		assertEquals("eight", trans.oneTonineteen(8))
		assertEquals("nine", trans.oneTonineteen(9))
		assertEquals("ten", trans.oneTonineteen(10))
		assertEquals("eleven", trans.oneTonineteen(11))
		assertEquals("twelve", trans.oneTonineteen(12))
		assertEquals("thirteen", trans.oneTonineteen(13))
		assertEquals("fourteen", trans.oneTonineteen(14))
		assertEquals("fifteen", trans.oneTonineteen(15))
		assertEquals("sixteen", trans.oneTonineteen(16))
		assertEquals("seventeen", trans.oneTonineteen(17))
		assertEquals("eighteen", trans.oneTonineteen(18))
		assertEquals("nineteen", trans.oneTonineteen(19))
		assertEquals("twenty", trans.oneTonineteen(20))
		assertEquals("twenty six", trans.oneTonineteen(26))
		assertEquals("thirty five", trans.oneTonineteen(35))
		assertEquals("ninety seven", trans.oneTonineteen(97))
		assertEquals("one hundred seventy four", trans.oneTonineteen(174))
		assertEquals("seven hundred", trans.oneTonineteen(700))
		assertEquals("nine hundred ninety two", trans.oneTonineteen(992))
		assertEquals("three thousand seven hundred", trans.oneTonineteen(3700))
		assertEquals("sixty thousand three hundred twenty one", trans.oneTonineteen(60321))
		assertEquals("five hundred fifty three thousand two hundred ninety one", trans.oneTonineteen(553291))
		assertEquals("one million", trans.oneTonineteen(1000000))
	}
}

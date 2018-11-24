package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Sound;

class DistanceTest {
	Sound sound = new Sound();

	@Test
	void test1() {
		assertEquals(sound.calculate(7.2), 7920.0, "");
	}

	@Test
	void test2() {
		assertEquals(sound.calculate(11), 12100.0, "");
	}

	@Test
	void test3() {
		assertEquals(sound.calculate(10), 11000.0, "");
	}
}
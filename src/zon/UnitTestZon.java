package zon;

import static org.junit.Assert.*;

import org.junit.Test;

import zon.ZonnepaneelImpl;

public class UnitTestZon {

	@Test
	public void testGetkWh() {
		ZonnepaneelImpl zonnepaneel = new ZonnepaneelImpl();
		double testkWh = zonnepaneel.getkWh(8, 8);
		assertEquals(64, testkWh, 0);
	}

	@Test
	public void testGetZonkracht() {
		ZonnepaneelImpl zonnepaneel = new ZonnepaneelImpl();
		double testZonkracht = zonnepaneel.getZonkracht(8, 4);
		assertEquals(2, testZonkracht, 0);
	}

	@Test
	public void testGetZonhoek() {
		ZonnepaneelImpl zonnepaneel = new ZonnepaneelImpl();
		double testZonhoek = zonnepaneel.getZonhoek(8, 4);
		assertEquals(2, testZonhoek, 0);
	}
}

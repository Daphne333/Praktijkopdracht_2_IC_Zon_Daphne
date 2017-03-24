package zon;

public class ZonnepaneelImpl {
	public double getkWh(double zonkracht, double zonhoek) {
		double kWh = zonhoek * zonkracht;
		return kWh;
	}

	public double getZonkracht(double kWh, double zonhoek) {
		double zonkracht = kWh / zonhoek;
		return zonkracht;
	}

	public double getZonhoek(double kWh, double zonkracht) {
		double zonhoek = kWh / zonkracht;
		return zonhoek;
	}

}

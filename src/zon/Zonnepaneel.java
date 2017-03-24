package zon;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Zonnepaneel {
	double zonkracht;
	double zonhoek;
	double kWh;

	public Zonnepaneel(double zonkracht, double zonhoek, double kWh) {
		super();
		this.zonkracht = zonkracht;
		this.zonhoek = zonhoek;
		this.kWh = kWh;
	}

	public double getZonkracht() {
		return zonkracht;
	}

	@XmlAttribute
	public void setZonkracht(double zonkracht) {
		this.zonkracht = zonkracht;
	}

	public double getZonhoek() {
		return zonhoek;
	}

	@XmlAttribute
	public void setZonhoek(double zonhoek) {
		this.zonhoek = zonhoek;
	}

	public double getkWh() {
		return kWh;
	}

	@XmlAttribute
	public void setkWh(double kWh) {
		this.kWh = kWh;
	}

	@Override
	public String toString() {
		return "Zonnepaneel [zonkracht=" + zonkracht + ", zonhoek=" + zonhoek + ", kWh=" + kWh + "]";
	}

}

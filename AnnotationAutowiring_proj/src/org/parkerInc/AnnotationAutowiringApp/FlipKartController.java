package org.parkerInc.AnnotationAutowiringApp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class FlipKartController {
	@Autowired
	private Electronics ec;
	@Autowired
	private Furniture fr;
	@Autowired
	private Cosmetics cs;
	public Electronics getEc() {
		return ec;
	}
	public void setEc(Electronics ec) {
		this.ec = ec;
	}
	public Furniture getFr() {
		return fr;
	}
	public void setFr(Furniture fr) {
		this.fr = fr;
	}
	public Cosmetics getCs() {
		return cs;
	}
	public void setCs(Cosmetics cs) {
		this.cs = cs;
	}
	public void purchase() {
		ec.mobile();
		fr.sofa();
		cs.lipStick();
		System.out.println("purchase done on "+new Date());
	}
}

package org.parkerInc.autowiringApp;

public class FlipkartController {
	private Electronics ec;
	private Furniture fr;
	private Cosmetics cs;
	
public FlipkartController(Electronics ec, Furniture fr, Cosmetics cs) {
		this.ec = ec;
		this.fr = fr;
		this.cs = cs;
	}

//	public Electronics getEc() {
//		return ec;
//	}
//	public void setEc(Electronics ec) {
//		this.ec = ec;
//	}
//	public Furniture getFr() {
//		return fr;
//	}
//	public void setFr(Furniture fr) {
//		this.fr = fr;
//	}
//	public Cosmetics getCs() {
//		return cs;
//	}
//	public void setCs(Cosmetics cs) {
//		this.cs = cs;
//	}
	public void purchase() {
		ec.mobile();
		fr.table();
		cs.talc();
		System.out.println("purchased succesfully");
	}
}

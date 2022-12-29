package org.parkerInc.stereotypeconfApp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FlipKartController {
	@Autowired
private Electronics ec;
	@Autowired
private Furniture fr;
	@Autowired
private Clothes cl;
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
public Clothes getCl() {
	return cl;
}
public void setCl(Clothes cl) {
	this.cl = cl;
}
public void purchase() {
	ec.mobile();
	fr.table();
	cl.tShirt();
	System.out.println("purchased in FlipKart Online on "+new Date());
}
}

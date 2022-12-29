package org.parkerInc.Constructor_InjectionApp;
import java.util.List;
public class WiproImpl implements IOrganization {
	private int company_id;
	private double company_market_shareValue;
	private Employee employee_details;
	private List<String> teams;
	public WiproImpl(int company_id, double company_shareValue, Employee employee_details, List<String> teams) {
		this.company_id = company_id;
		this.company_market_shareValue = company_shareValue;
		this.employee_details = employee_details;
		this.teams = teams;
		System.out.println("Wipro Object created!!!");
	}
	@Override
	public void work() {
		StringBuffer s=new StringBuffer();
		s.append("\nWipro Details:\nCompany ID: "+company_id+"\nCompanyMarketShareValue: "+company_market_shareValue+"\n"
				+ "Employee Details: "+employee_details+"\nTeams: "+teams+"\n");
		System.out.println(s);
	}


}

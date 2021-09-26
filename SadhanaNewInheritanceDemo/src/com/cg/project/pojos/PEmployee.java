package com.cg.project.pojos;

public class PEmployee extends Employee {
	private int hra,ta,da;
	//public int getLastName;
	
	public PEmployee() {} // de
		public PEmployee(int hra, int ta, int da, int getLastName) {
		super();
		this.hra = hra;
		this.ta = ta;
		this.da = da;
		//this.getLastName = getLastName;
	}
		
		//public PEmployee(int i, String string, String string2,           int j, int k) {
		//}
		public PEmployee(int i, int j, int k) {
		}
		public PEmployee(int i, String string, String string2, String string3, int j) {
		}
		public int getHra() {
			return hra;
		}
		public void setHra(int hra) {
			this.hra = hra;
		}
		public int getTa() {
			return ta;
		}
		public void setTa(int ta) {
			this.ta = ta;
		}
		public int getDa() {
			return da;
		}
		public void setDa(int da) {
			this.da = da;
		}
		public String getTotalSalary() {
			return TotalSalary;
		}
		public int getBasicSalary() {
			return BasicSalary;
//		}
//		public String getFirstName() {
//			return null;
//		}
//		public void calculateSalary1() {
//			
//		}
//		public String getLastName() {
//			return null;
//		}
		public void calculateSalary() {
			hra =(getBasicSalary()*30)/100;
			ta=(getBasicSalary()*30)/100;
			da=(getBasicSalary()*30)/100;
			this.SetTotalSalary(hra+ta+da+getBasicSalary());
		}
		private void SetTotalSalary(int i) {
		
			
		}
		
	}
	
	


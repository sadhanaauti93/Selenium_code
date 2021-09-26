package com.cg.project.pojos.main;

import com.cg.project.pojos.ContractEmployee;

public class MainCalculate {

	public static void main(String[] args) {
			ContractEmployee Ce = new ContractEmployee();

			ContractEmployee Ce2 = new ContractEmployee(3000,120);
			System.out.println(Ce2.CalculateSalary());    //360000
			
	}
}

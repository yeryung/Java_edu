package com.kr;

import kt.ep.PartTime;
import kt.ep.Permanent;
import kt.ep.Sales;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company();
		Permanent emp1 = new Permanent(101,"홍길동",100000);
		Sales emp2 = new Sales(102,"김길동",80000,50000);
		PartTime emp3 = new PartTime(103, "고길동",1000,160);
		com.regEmployee(emp1);
		com.regEmployee(emp2);
		com.regEmployee(emp3);
		
		com.reBusinessTrip(emp2, 2);
		com.reBusinessTrip(emp3, 1);
		com.printAllEmployee();
		System.out.println("총 급여 : "+ com.getTotalPay());
		

	}

}

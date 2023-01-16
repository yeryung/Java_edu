package com.kr;

import java.util.HashMap;

import kt.ep.Employee;
import kt.ep.IBusinessTrip;

public class Company {
	HashMap<Integer,Employee> emps = new HashMap<>();
	
	//Employee[] emps = new Employee[10];
	int count;
	
	void regEmployee(Employee emp) {
		emps.put(count++, emp);
		//emps[count++] = emp;
	}
	void printAllEmployee() {
		for(Integer i : emps.keySet()){ //저장된 key값 확인
		    System.out.println(emps.get(i));
		}
//		for(int i=0; i<count; i++) {
//			System.out.println(emps[i]);
//		}
	}
	int getTotalPay() {
		int total=0;
		for(Integer i: emps.keySet()) {
			total += emps.get(i).getPay();
		}
//		for(int i=0; i<count; i++) {
//			total += emps[i].getPay();
//		}
		return total;
	}
	
	public void reBusinessTrip(IBusinessTrip emp,int day) {
		emp.goBusinessTrip(day);
	}
}
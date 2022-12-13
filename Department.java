package org.Department;

import org.system.College;

public class Department extends College{
	private static Department obj;

	public void deptName() {
		System.out.println("EEE");
		}

	public static void main(String[] args) {
		Department.obj=new Department();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();

	}

}

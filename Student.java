package org.student;

import org.Department.Department;

public class Student extends Department {

		private static final String ECE = null;
		private static Student obj;
		public void studentName() {
			System.out.println("vichithra");
			}
		public void studentDept() {
			System.out.println("ECE");
			}
		public void studentId() {
			System.out.println("4211");
			}
		public static void main(String[] args) {
			Student.obj=new Student();
			obj.studentName();
			obj.studentDept();
			obj.studentId();
			obj.deptName();
			obj.collegeName();
			obj.collegeCode();
			obj.collegeRank();

	}

}

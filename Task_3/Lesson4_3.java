package by.epam.lesson4.task;

import java.util.Scanner;

public class Lesson4_3 {

	/*
	 * Оценки, полученные студентами в сессию, являются атрибутами класса
	 * Student. 
	 * Определить: 
	 * а) средний балл учебной группы (использовать класс Group); 
	 * б) средний балл каждого студента; 
	 * в) число отличников; 
	 * г)количество студентов, имеющих "2".
	 */

	public static void main(String[] args) {

		int tempid;
		String tempName;
		int tempmark1;
		int tempmark2;
		int tempmark3;

		StudentUniver student1 = new StudentUniver(100, "Mark", 10, 8, 8);
		UniversityHelper.showStudent(student1);
		System.out.println();

		UniversityHelper.calculateAverageGrade(student1);
	
		double averageGrade;
		averageGrade = UniversityHelper.calculateAverageGrade(student1); // средний балл студента;
		System.out.printf("Average Grade is: %.2f\n", averageGrade);

		System.out.println("New Group Creation!");
		System.out.println();
		Group group1 = new Group(3); // There are 3 students in the group

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < group1.getStudentArray().length; i++) {

			System.out.println("Student[" + i + "]=>");
			System.out.println("Could you please input Student ID?");

			if (sc.hasNextInt()) {
				tempid = sc.nextInt();
			} else {
				sc.next();
				System.out.println("Error!!!");
				return;
			}

			System.out.println("Could you please input Student Name?");
			if (sc.hasNextLine()) {
				tempName = sc.next();
			} else {
				sc.next();
				System.out.println("ERROR!!!");
				return;
			}

			System.out.println("Could you please input the mark1?");

			if (sc.hasNextInt()) {
				tempmark1 = sc.nextInt();
			} else {
				sc.next();
				System.out.println("ERROR!!!");
				return;
			}

			System.out.println("Could you please input the mark2?");
			
			if (sc.hasNextInt()) {
				tempmark2 = sc.nextInt();
			} else {
				sc.next();
				System.out.println("ERROR!!!");
				return;
			}

			System.out.println("Could you please input the mark3?");
			
			if (sc.hasNextInt()) {
				tempmark3 = sc.nextInt();
			} else {
				sc.next();
				System.out.println("ERROR!!!");
				return;
			}

			StudentUniver tempStudent = new StudentUniver(tempid, tempName, tempmark1, tempmark2, tempmark3);
			group1.setStudentArray(i, tempStudent);
		}

		UniversityHelper.showGroup(group1);

		 averageGrade = UniversityHelper.calculateAverageGrade(group1);
		 System.out.printf("Average Group Grade is: %.2f", averageGrade);
		 System.out.println();
		 
		 System.out.println("The count of Overachievers: " + UniversityHelper.calculateOverachiever(group1));
		 System.out.println("The count of Unlucky Student: " + UniversityHelper.calculateUnluckyStudent(group1));

	};

}

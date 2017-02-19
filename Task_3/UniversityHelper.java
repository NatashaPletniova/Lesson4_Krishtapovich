package by.epam.lesson4.task;

public class UniversityHelper {
	private UniversityHelper (){
		
	}
	
	public static void showStudent(StudentUniver student) {

		System.out.println("Identifier: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Mark 1: " + student.getMark1());
		System.out.println("Mark 2: " + student.getMark2());
		System.out.println("Mark 3: " + student.getMark3());

	}

	public static double calculateAverageGrade(StudentUniver student) {

		return (double) (student.getMark1() + student.getMark2() + student.getMark3()) / 3;

	}

	public static void showGroup(Group group) {

		for (int i = 0; i < group.getStudentArray().length; i++) {
			System.out.println();
			System.out.println("***Student " + i + "***");
			showStudent(group.getStudentArray()[i]);

		}
	}

	
	public static double calculateAverageGrade(Group group) {

		double groupAverageGrade = 0;
		double tempAverageGrade = 0;
		
		for (int i = 0; i < group.getStudentArray().length; i++) {
			tempAverageGrade = calculateAverageGrade(group.getStudentArray()[i]);
			System.out.printf("Average Grade For Student " + i + " is: %.2f\n", tempAverageGrade);
			groupAverageGrade = groupAverageGrade + tempAverageGrade;
		}
		return groupAverageGrade / group.getStudentArray().length;
	}
	
	public static int calculateOverachiever(Group group){
		int count = 0;
		for (int i = 0; i < group.getStudentArray().length; i++ ){
			if((group.getStudentArray()[i].getMark1() == 9||group.getStudentArray()[i].getMark1() == 10) 
					&& (group.getStudentArray()[i].getMark2() == 9||group.getStudentArray()[i].getMark2() == 10)
					&& (group.getStudentArray()[i].getMark3() == 9||group.getStudentArray()[i].getMark3() == 10)){
				
				count++;
			}
			
		}
		
		
		return count;
		
		
	}
	
	
	public static int calculateUnluckyStudent(Group group){
		
		int count = 0;
		for (int i = 0; i < group.getStudentArray().length; i++ ){
			if(group.getStudentArray()[i].getMark1() == 2 || group.getStudentArray()[i].getMark2() == 2 || group.getStudentArray()[i].getMark3() == 10)
			{
				count++;
			}
			
		}
		return count;
		
	}
}

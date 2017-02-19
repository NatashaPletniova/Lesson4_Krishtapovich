package by.epam.lesson4.task;

public class SelectionCommittee {
	private SelectionCommittee() {
	}

	public static void showApplicant(Applicant applicant) {

		System.out.println();

		System.out.println("Identifier: " + applicant.getID());
		System.out.println("Name: " + applicant.getName());

		for (int i = 0; i < applicant.getMarkList().size(); i++) {

			System.out.println("The Mark " + (i + 1) + ": " + applicant.getMarkList().get(i));
		}
		System.out.printf("Average Grade : %.2f\n", applicant.getAverageGrade());

	}

	public static void calculateAverageGrade(Applicant applicant, int examCount) {

		Double averageGrade = 0.0;

		for (int i = 0; i < applicant.getMarkList().size(); i++) {

			averageGrade = averageGrade + applicant.getMarkList().get(i);
		}

		applicant.setAverageGrade(averageGrade / examCount);

	}

}

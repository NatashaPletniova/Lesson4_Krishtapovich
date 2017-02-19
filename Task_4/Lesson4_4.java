package by.epam.lesson4.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lesson4_4 {
	/*
	 * Имеется список абитуриентов (класс Abiturient) и список оценок,
	 * полученных ими на вступительных экзаменах. Напечатать список поступивших,
	 * если число мест меньше числа абитуриентов.
	 */


	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource") 
		Scanner sc = new Scanner(System.in);

		int examCount = 3; // количество сдаваемых предметов
		int vacancyCount = 3; // число мест
		char inChar;
		int j = 1;

		int tempid = 0;
		String tempName;
		int tempmark;

		Double tempAverageGrade = 0.0;

		List<Integer> tempMarkList = null;

		List<Applicant> applicantList = new ArrayList<>();

		try {
			do {
				System.out.println("Student[" + j + "]=>");
				System.out.println("Could you please input Student ID?");
				tempMarkList = new ArrayList<>();

				if (sc.hasNextInt()) {
					tempid = sc.nextInt();
				} else {
					throw new IOException();
				}
				System.out.println("Could you please input Student Name?");

				if (sc.hasNextLine()) {
					tempName = sc.next();
				} else {
					throw new IOException();
				}

				for (int i = 1; i <= examCount; i++) {

					System.out.println("Could you please input the mark " + i + "?");

					if (sc.hasNextInt()) {
						tempmark = sc.nextInt();
					} else {
						throw new IOException();
					}
					tempMarkList.add(tempmark);
				}

				Applicant tempApplicant = new Applicant(tempid, tempName, tempMarkList, tempAverageGrade);

				applicantList.add(tempApplicant);

				System.out.println("Input any symbol to proceed and 'N' to stop!!!");

				inChar = (char) System.in.read();
				j++;
			} while (inChar != 'N');

		} catch (IOException e) {
			System.out.println("Input ERROR");
			return;
		}

		for (int i = 0; i < applicantList.size(); i++) {
			SelectionCommittee.calculateAverageGrade(applicantList.get(i), examCount);

		}

		Collections.sort(applicantList, new Comparator<Applicant>() {
			public int compare(Applicant applicantOne, Applicant applicantTwo) {
				return ((Applicant) applicantTwo).getAverageGrade()
						.compareTo(((Applicant) applicantOne).getAverageGrade());
			}
		});

		Iterator<Applicant> iterator = applicantList.iterator();

		int i = 1;

		System.out.println("The following applicants were accepted:");

		while (iterator.hasNext() && (i <= vacancyCount)) {
			SelectionCommittee.showApplicant(iterator.next());
			i++;

		}

	}

}

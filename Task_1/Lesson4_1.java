package by.epam.lesson4.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Создать  описанные  ниже  классы.  Определить  конструктор  и  методы  set(),  get(), show().  
Определить  дополнительно  какой  –  либо   метод  для  каждого  класса. 
Реализовать  класс  в  консольном  приложении.  
Задать  критерий  выбора  данных  и вывести эти данные на консоль.
Student  :  id,  Фамилия,  Имя,  Отчество,  Дата  рождения,  Адрес,  Телефон,  Факультет, Курс.
Customer:  id,  Фамилия,  Имя,  Отчество,  Адрес,  Номер  кредитной  карточки,  Номер банковского счета.
*/

public class Lesson4_1 {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

		Calendar calendar1 = new GregorianCalendar(1996, 0, 28);

		// System.out.println("Date : " + sdf.format(calendar.getTime()));
		Student student1 = new Student(8, "Иван", "Иванов", "Иванович", "Минск ул. Урученская 8", "+375296543453",
				"Прикладная математика", 1, calendar1);
		System.out.println("***Student 1***");
		student1.showStudent();

		System.out.println();
		System.out.println("***Student 1 is shown via GET***");

		System.out.println("Get ID: " + student1.getId());
		System.out.println("Get The First Name: " + student1.getFirstName());
		System.out.println("Get The Last Name: " + student1.getlastName());
		System.out.println("Get The Date Birth: " + sdf.format(student1.getDateBirth().getTime()));
		System.out.println("Get The Middle Name: " + student1.getMiddleName());
		System.out.println("Get Address: " + student1.getAddress());
		System.out.println("Get Phone: " + student1.getPhone());
		System.out.println("Get Derpartment: " + student1.getDepartment());
		System.out.println("Get Course: " + student1.getCourse());
		System.out.println();

		// Дополнительный метод для класса Student
		System.out.println("This student's age is: " + student1.calculateAge());
		System.out.println();

		// Изменяем значения полей студента student1
		System.out.println("***New values for Student1:***");
		System.out.println();
		calendar1.set(1994, 1, 13, 0, 0, 0);

		student1.setId(1000);
		student1.setFirstName("Nick");
		student1.setLastName("Cao");
		student1.setDateBirth(calendar1);
		student1.setAddress("Minsk Gamarnika st. 20 122");
		student1.setPhone("+3752965555555");
		student1.setDepartment("Math");
		student1.setCourse(3);

		student1.showStudent();
		System.out.println();
		System.out.println("This student's age is: " + student1.calculateAge());
		System.out.println();

		// Student2

		Calendar calendar2 = new GregorianCalendar(1997, 3, 28);
		Student student2 = new Student(101, "Bob", "Smith", "Bobovich", "Eldorado Street 1", "+37529567765",
				"Thinkdesign", 2, calendar2);
		System.out.println("***Student 2***");
		student2.showStudent();
		System.out.println("This student's age is: " + student2.calculateAge());
		System.out.println();

		/// Изменяем значения полей студента student2
		System.out.println("***New values for Student2***:");
		calendar2.set(1995, 1, 13, 0, 0, 0);
		student2.setStudent(12, "Nick", "Trump", "Uladimirovich", "Eldorado Street 2", "+37529533333",
				"Woldthinkdesign", 4, calendar2);
		student2.showStudent();
		System.out.println();
		System.out.println("This student's age is: " + student1.calculateAge());
		System.out.println();

		// Student3
		Calendar calendar3 = new GregorianCalendar(1998, 5, 28);
		Student student3 = new Student(101, "Bob1", "Smith1", "Bobovich1", "Eldorado Street 2", "+37529567765",
				"Thinkdesign2", 4, calendar3);
		System.out.println("***Student 3***");
		student3.showStudent();
		System.out.println();
		System.out.println("This student's age is: " + student3.calculateAge());
		System.out.println();

		System.out.println("");

		System.out.println("***Client 1***");
		Client client1 = new Client(8, "Иван", "Иванов", "Иванович", "Минск ул. Урученская 8", "123 456 678 8907",
				"NMV56789");

		System.out.println("Get ID: " + client1.getId());
		System.out.println("Get The First Name: " + client1.getFirstName());
		System.out.println("Get The Last Name: " + client1.getLastName());
		System.out.println("Get The Middle Name: " + client1.getMiddleName());
		System.out.println("Get Address: " + client1.getAddress());
		System.out.println("Get Credit Card: " + client1.getCreditCard());
		System.out.println("Get Account: " + client1.getAccount());
		System.out.println();

		client1.setId(1000);
		client1.setFirstName("Nick");
		client1.setLastName("Cao");
		client1.setMiddleName("Bobovich");
		client1.setAddress("Minsk Gamarnika st. 20 122");
		client1.setCreditCard("123 456 789 789");
		client1.setAccount("UYH786987");
		System.out.println("***New values for Client 1:***");
		client1.showClient();
		System.out.println();

		// Дополнительный метод для класса Client
		System.out.println("The full name is: " + client1.getFullName());
		System.out.println();

		// Задать критерий выбора данных и вывести эти данные на консоль.
		// Осуществляю вывод студентов последних курсов >=4.

		List<Student> arrayStudent = new ArrayList<Student>();
		List<Student> arrayLastCourseStudent = new ArrayList<Student>();
		arrayStudent.add(student1);
		arrayStudent.add(student2);
		arrayStudent.add(student3);

		int c = 0;
		for (Student s : arrayStudent) {
			c = s.getCourse();
			if (c >= 4) {
				arrayLastCourseStudent.add(s);
			}
		}

		ListIterator<Student> listIterator = arrayLastCourseStudent.listIterator();

		System.out.println("The last year students:");
		System.out.println();

		while (listIterator.hasNext()) {
			listIterator.next().showStudent();
		}

	}

}

package by.epam.lesson4.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
		Создать  описанные  ниже  классы.  Определить  конструктор  и  методы  set(),  get(), 
		show().  Определить  дополнительно  какой  –  либо   метод  для  каждого  класса. 
		Реализовать  класс  в  консольном  приложении. 
		Задать  критерий  выбора  данных  и вывести эти данные на консоль.
		Student  :  id,  Фамилия,  Имя,  Отчество,  Дата  рождения,  Адрес,  Телефон,  Факультет, 
		Курс.
		Customer:  id,  Фамилия,  Имя,  Отчество,  Адрес,  Номер  кредитной  карточки,  Номер 
		банковского счета.
 */

public class Student {

	private int id;
	private String firstName; // Имя
	private String lastName; // Фамилия
	private String middleName;// Отчество
	private String address; // Адрес
	private String phone; // Телефон
	private String department; // Факультет
	private int course;
	private Calendar dateBirth;

	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

	public Student(int _id, String _firstName, String _lastName, String _middleName, String _address, String _phone,
			String _department, int _course, Calendar _dateBirth) {
		id = _id;
		firstName = _firstName;
		lastName = _lastName;
		middleName = _middleName;
		dateBirth = _dateBirth;
		address = _address;
		phone = _phone;
		department = _department;
		course = _course;
	}

	public void showStudent() {

		System.out.println("Identifier: " + id);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);
		System.out.println("Department: " + department);
		System.out.println("Course: " + course);
		System.out.println("Date of Birth : " + sdf.format(dateBirth.getTime()));
		System.out.println();

	}

	public String getlastName() {
		return lastName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Calendar getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Calendar dateBirth) {
		this.dateBirth = dateBirth;
	}

	public void setStudent(int _id, String _firstName, String _lastName, String _middleName, String _address,
			String _phone, String _department, int _course, Calendar _dateBirth) {
		id = _id;
		firstName = _firstName;
		lastName = _lastName;
		middleName = _middleName;
		dateBirth = _dateBirth;
		address = _address;
		phone = _phone;
		department = _department;
		course = _course;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", address=" + address + ", phone=" + phone + ", department=" + department + ", course="
				+ course + ", dateBirth=" + dateBirth.getTime() + "]";
	}

	// Дополнительный метод для класса Student
	public int calculateAge() {

		int currentyear;
		int age;

		Calendar calendar = GregorianCalendar.getInstance();
		currentyear = calendar.get(Calendar.YEAR);
		age = currentyear - this.dateBirth.get(Calendar.YEAR);

		return age;
	}

}

package by.epam.lesson4.task;

public class Client {
	/*
	 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
	 * Номер банковского счета.
	 */

	private int id;
	private String firstName; // Имя
	private String lastName; // Фамилия
	private String middleName;// Отчество
	private String address; // Адрес
	private String creditCard; // Номер кредитной карточки
	private String account; // Номер банковского счета

	public Client(int _id, String _firstName, String _lastName, String _middleName, String _address, String _creditCard,
			String _account) {
		id = _id;
		firstName = _firstName;
		lastName = _lastName;
		middleName = _middleName;
		address = _address;
		creditCard = _creditCard;
		account = _account;
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

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void showClient() {
		System.out.println("Identifier: " + id);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Address: " + address);
		System.out.println("Credit Card: " + creditCard);
		System.out.println("Account: " + account);

	}

	// Дополнительный метод для класса Client
	public String getFullName() {
		String fullName = this.firstName + " " + this.middleName + " " + this.lastName;
		return fullName;

	}

}

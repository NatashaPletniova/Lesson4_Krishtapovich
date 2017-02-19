package by.epam.lesson4.task;

public class StudentUniver {
	private int id;
	private String Name;
	private int mark1;
	private int mark2;
	private int mark3;

	public StudentUniver(int id, String Name, int mark1, int mark2, int mark3) {
		this.id = id;
		this.Name = Name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

}

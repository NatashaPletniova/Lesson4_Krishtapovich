package by.epam.lesson4.task;

public class Group {

	private StudentUniver[] studentArray;

	public Group(int studcount) {

		studentArray = new StudentUniver[studcount];
	}

	public StudentUniver[] getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(StudentUniver[] studentArray) {
		this.studentArray = studentArray;
	}

	public void setStudentArray(int i, StudentUniver student) {
		this.studentArray[i] = student;
	}

}

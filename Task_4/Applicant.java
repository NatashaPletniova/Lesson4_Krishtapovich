package by.epam.lesson4.task;

import java.util.ArrayList;
import java.util.List;

public class Applicant {

	private int ID;
	private String name;
	private List<Integer> markList = new ArrayList<>();
	private Double averageGrade = 0.0;
	       

	public Applicant(int ID, String name, List<Integer> markList, Double averageGrade ) {
		
		this.ID = ID;
		this.name = name;
		this.markList = markList;
		this.averageGrade  = averageGrade;
		
	}
	
	
	public Double getAverageGrade() {
		return averageGrade;
	}


	public void setAverageGrade(Double averageGrade) {
		this.averageGrade = averageGrade;
	}


	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Integer> getMarkList() {
		return markList;
	}
	
	public void setMarkList(List<Integer> markList) {
		this.markList = markList;
	}
	

}

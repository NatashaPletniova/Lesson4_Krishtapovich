package by.epam.lesson4.task;

public class Fraction {
	private int m;
	private int n;

	public Fraction(int m, int n) {
		System.out.println("Fraction(int m, int n) is working.");
		if (n == 0) {
			n = 1;
		}
		this.m = m;
		this.n = n;

	}

	public Fraction() {
		System.out.println("Fraction() is working.");
		this.m = this.n = 1;

	}

	public void showFraction() {
		System.out.println(m + "/" + n);

	}

	public void setFraction(int m, int n) {
		if (n == 0) {
			n = 1;
		}
		this.m = m;
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		if (n == 0) {
			n = 1;

		}
		this.n = n;
	}

}

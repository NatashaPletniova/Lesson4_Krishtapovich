package by.epam.lesson4.task;

import java.util.Scanner;

/*
 	Определить  класс  «Дробь»  в  виде  пары  m/n.  Объявить  массив  из  k  дробей, ввести/вывести значения для массива дробей.
 */

public class Lesson4_2 {
	public static void main(String[] args) {

		int k = 3;
		int m, n;
		Fraction[] fractions = new Fraction[5];

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < k; i++) {
			System.out.print("Введите числитель дроби " + i + ":");
			if (sc.hasNextInt()) {
				m = sc.nextInt();
			} else {
				sc.next();
				System.out.println("Вы ввели не целое число! В демонстрации отказано!!!");
				break;
			}
			System.out.print("Введите знаменатель дроби " + i + ":");
			if (sc.hasNextInt()) {
				n = sc.nextInt();
			} else {
				sc.next();
				System.out.println("Вы ввели не целое число! В демонстрации отказано!!!");
				break;
			}

			fractions[i] = new Fraction(m, n);

		}

		for (int i = 0; i < k; i++) {
			fractions[i].showFraction();
		}

	}

}

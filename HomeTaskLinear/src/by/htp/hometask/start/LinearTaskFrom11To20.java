package by.htp.hometask.start;

public class LinearTaskFrom11To20 {
	
public static void main(String[] args) {
		
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		
	}
	
	public static void task11() {
		
		// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов
		
		double a;
		double b;
		
		a = 10;
		b = 5;
		
		double per; // периметр
		double s; // площадь
		
		per = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		s = (a * b) / 2;
		
		System.out.println("Периметр треугольника в задаче 11 равен " + per);
		System.out.println("Площадь треугольника в задаче 11 равна " + s); 
	}
	
	public static void task12() {
		
		// Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)
		
		int x1;
		int y1;
		int x2;
		int y2;
		int a;
		int b;
		double c; // расстояние между точками
		
		x1 = 5;
		x2 = 7;
		y1 = 12;
		y2 = -19;
		
		a = Math.abs(x2 - x1);
		b = Math.abs(y2 - y1);
				
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		System.out.println("Расстояние между точками в задаче 12 равно " + c); 
	}
	
	public static void task13() {
		
		// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
		
		int x1 = -10;
		int y1 = -7;
		int x2 = 5;
		int y2 = 9;
		int x3 = 11;
		int y3 = 14;
		double a;
		int a1;
		int a2;
		double b;
		int b1;
		int b2;
		double c;
		int c1;
		int c2;
		double p;
		double s;
		double p2;
		
		a1 = Math.abs(x3 - x2);
		a2 = Math.abs(y3 - y2);
		b1 = Math.abs(x2 - x1);
		b2 = Math.abs(y2 - y1);
		c1 = Math.abs(x3 - x1);
		c2 = Math.abs(y3 - y1);
		
		a = Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2));
		b = Math.sqrt(Math.pow(b1, 2) + Math.pow(b2, 2));
		c = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		
		p = (a + b + c);
		p2 = p/2; // полупериметр
		s = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p - c));
		
		
		System.out.println("Периметр треугольника в задаче 13 равен " + p);
		System.out.println("Площадь треугольника в задаче 13 равна " + s);
	}
	
	public static void task14() {
		
		// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
		
		int r;
		double c;
		double a;
		
		r = 8;
		
		c = 2 * Math.PI * r;
		a = Math.PI * Math.pow(r, 2);
				
		System.out.println("Длина окружности в задаче 14 равна " + c);
		System.out.println("Площадь круга в задаче 14 равна " + a);
	}
	
	public static void task15() {
		
		// Написать программу, которая выводит на экран первые четыре степени числа π.
		
		int i;
		double a;
		
		for (i = 1; i <= 4; i++) {
			
			a = Math.pow(Math.PI, i);
			System.out.println("Число PI в степени " + i + " в задаче 15 равно " + a);
			
		}		
	}	
	
	public static void task16() {
		
		// Найти произведение цифр заданного четырехзначного числа.
		
		int chis;
		int a;
		int b;
		int c;
		int d;
		int proiz;
		
		chis = 4698;
		
		a = chis / 1000;
		b = chis / 100;
		b = b % 10;
		c = chis / 10;
		c = c % 10;
		d = chis % 10;
		proiz = a * b * c * d;
		
		System.out.println("Произведение цифр четырехзначного числа в задаче 16 равно " + proiz);
					
	}	
	
	public static void task18() {
		
		// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
		
		int l = 5;
		int sp;
		int spp;
		int v;
		
		sp = (int) Math.pow(l, 2);
		spp = sp * 6;
		v = (int) Math.pow(l, 3);
		
		System.out.println("Площадь грани куба в задаче 18 равна " + sp);
		System.out.println("Площадь полной поверхности куба в задаче 18 равна " + spp);
		System.out.println("Объем куба в задаче 18 равен " + v);
	}
	
	public static void task17() {
		
		// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
		
		int a = 372;
		int b = 21;
		double arif;
		double geometr;
		
		arif = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		geometr = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое в задаче 17 равно " + arif);
		System.out.println("Среднее геометрическое в задаче 17 равно " + geometr);
	}
	
	public static void task19() {
		
		/* Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной
		и описанной окружностей. */
		
		int a = 8;
		double h;
		double s;
		double r;
		double r1;
		
		h = (a * Math.sqrt(3)) / 2;
		s = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		r = (a * Math.sqrt(3)) / 6; // вписанная окружность
		r1 = (a * Math.sqrt(3)) / 3; // описанная
		
		System.out.println("Высота треугольника в задаче 19 равна " + h);
		System.out.println("Площадь треугольника в задаче 19 равна " + s);
		System.out.println("Радиус вписанной окружности в задаче 19 равен " + r);
		System.out.println("Радиус описанной окружности в задаче 19 равен " + r1);
	}
	
	public static void task20() {
		
		/* Известна длина окружности. Найти площадь круга, ограниченного этой окружностью. */
		
		int с = 20;
		double r;
		double a;
		
		r = с / (2 * Math.PI); // вычислим радиус
		a = Math.PI * Math.pow(r, 2);
		
		System.out.println("Площадь круга в задаче 20 равна " + a);
	}
}

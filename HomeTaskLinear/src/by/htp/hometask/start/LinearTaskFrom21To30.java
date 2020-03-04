package by.htp.hometask.start;

public class LinearTaskFrom21To30 {

	public static void main(String[] args) {
		
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		
	}
	
	public static void task21() {
		
		/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа. */
		
		double r = 894.214;
		double a = (int) r;
		double b;
		double d;
		
		b = r - a;
		b = b * 1000;
		a = a / 1000;
		d = a + b;
		
		System.out.println("Перевернутое число в задаче 21 = " + d);
	}
	
	public static void task22() {
		
		/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc. */
		
		int t;
		double b;
		double c;
		double v;
		
		t = 10000;
		
		b = t % 3600;
		c = t - b;
		b = c / 3600;
		int h = (int) b;
		
		v = t - c;
		c = v % 60;
		c = v - c;
		c = c / 60;
		int m = (int) c;
		
		v = t - h * 3600 - m * 60;
		int s = (int) v;
		
		System.out.println(h + "ч " + m + "мин " + s + "с.");
	}
	
	public static void task23() {
		
		// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)
		
		int r;
		int r1;
		double s;
		
		r = 7;
		r1 = 9;
		s = Math.PI * (Math.sqrt(r1) - Math.sqrt(r));
		
		System.out.println("Площадь кольца равна " + s);
	}
	
	public static void task24() {
		
		// Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а
		
		int a;
		int b;
		int alpha;
		int beta;
		double d;
		double c;
		double s;
		double bRad;
		double chast1;
		double drob2;
		double chast2;
		
		a = 16;
		b = 11;
		alpha = 30;
		
		d = (double) (a - b) / 2;
		beta = 180 - 90 - alpha;
		bRad = (beta * Math.PI) / 180;
		c = d / Math.sin(bRad);
		chast1 = (double) (a + b) / 2;
		drob2 = Math.pow(a - b, 2) / 4;
		chast2 = Math.sqrt(Math.pow(c, 2) - drob2);
		s = chast1 * chast2;
		System.out.println("Площадь трапеции равна " + s);
	}
	
	public static void task25() {
		
		/* Вычислить корни квадратного уравнения ах 2 + bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
		что а≠0 и что дискриминант уравнения неотрицателен). */
		
		double x1;
		double x2;
		double a;
		int b;
		int c;
		double d;
		
		a = 6;
		b = 10;
		c = 3;
		
		d = (double) Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		x1 = (-b + d) / (2 * a);
		x2 = (-b - d) / (2 * a);
		
		System.out.println("Корни квадратного уравнения: x1 = " + x1 + " и x2 = " + x2);
	}
	
	public static void task26() {
		
		/* Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у */
		
		double a;
		int b;
		int alpha;
		double aRad;
		double s;
		
		a = 13;
		b = 18;
		alpha = 60;
		
		aRad = (alpha * Math.PI) / 180;
		s = (a * b * Math.sin(aRad)) / 2;
		
		System.out.println("Площадь треугольника равна " + s);
	}
	
	public static void task27() {
		
		/* Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а 8 за
три операции и а 10 за четыре операции. */
		
		int a;
		int d;
		int c;
		
		a = 3;
		
		a = a * a;
		d = (int) a;
		a = a * a;
		c = a * a;
		a = c * d;
		
		System.out.println("a в степени 8 равно " + c + "; a в степени 10 равно " + a);
	}
	
	public static void task28() {
		
		/* Составить программу перевода радианной меры угла в градусы, минуты и секунды. */
		
		int aRad;
		double alpha;
		double alMin;
		double alSec;
		
		aRad = 6;
		
		alpha = (180 * aRad) / Math.PI;
		alMin = alpha * 60;
		alSec = alpha * 3600;
		
		System.out.println(aRad + " радиан соответствует " + alpha + " градусам, либо " + alMin + " минутам, либо " + alSec + " секундам");
	}
	
	public static void task29() {
		
		/* Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с. */
		
		int a;
		int b;
		int c;
		double aRad;
		double bRad;
		double cRad;
		double agrad;
		double bgrad;
		double cgrad;
		
		a = 6;
		b = 8;
		c = 11;
		
		aRad = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		bRad = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
		cRad = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		agrad = (aRad * 180) / Math.PI;
		bgrad = (bRad * 180) / Math.PI;
		cgrad = (cRad * 180) / Math.PI;
		
		System.out.println("Угол 1 в градсуах равен " + agrad + ", а в радианах равен " + aRad);
		System.out.println("Угол 2 в градсуах равен " + bgrad + ", а в радианах равен " + bRad);
		System.out.println("Угол 3 в градсуах равен " + cgrad + ", а в радианах равен " + cRad);
	}
	
	public static void task30() {
		
		/* Три сопротивления R 1 R 2 , и R 3 соединены параллельно. Найдите сопротивление соединения. */
		
		double r;
		int r1;
		int r2;
		int r3;
		
		r1 = 6;
		r2 = 8;
		r3 = 4;
		
		r = 1.0 / ((1.0 / r1) + (1.0 / r2) + (1.0 / r3));
		
		System.out.println("Сопротивление соединения равно " + r);
	}
}

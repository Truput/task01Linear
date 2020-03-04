package by.htp.hometask.start;

public class Task2 {
	
	public static void main(String[] args) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		
	}
	
	public static void task01() {
		
		// Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное
		
		int x;
		int y;
		
		x = 10;
		y = 5;
		
		int sum;
		int raz;
		int proiz;
		int del;
		
		sum = x + y;
		raz = x - y;
		proiz = x * y;
		del = x / y;
		
		System.out.println("sum = " + sum + "\n" + "raz = " + raz + "\n" + "proiz = " + proiz + "\n" + "del = " + del); 

	}

	public static void task02() {
		
		// Найдите значение функции: с = 3 + а
		
		int a;
		int c;
		
		a = 8;
		c = 3 + a;
		
		System.out.println("Значение функции задачи 2 = " + c);
		
	}
	
	public static void task03() {
		
		// Найдите значение функции: z = 2 * x + ( y – 2 ) * 5
		
		int x;
		int y;
		int z;
		
		x = 13;
		y = 6;
		z = 2 * x + (y - 2) * 5;
		
		System.out.println("Значение функции задачи 3 = " + z);
		
	}
	
	public static void task04() {
		
		// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
		
		int a;
		int b;
		int c;
		int z;
		
		a = 4;
		b = 17;
		c = 2;
		z = ((a - 3) * (b / 2)) + c;
		
		System.out.println("Значение функции задачи 4 = " + z);
		
	}
	
	public static void task05() {
	// Составить алгоритм нахождения среднего арифметического двух чисел
		
		double a;
		int b;
		double c;
		
		a = 8;
		b = 7;
		
		c = (a + b) / 2;
		
		System.out.println("Среднее арифметическое двух чисел задачи 5 = " + c);
		
	}
	
	public static void task06() {
		/* Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах,
		если в каждом большом бидоне на 12 л. больше, чем в малом?*/
			
			double n;
			double v; // количество литров
			int m;
			
			n = 10;
			m = 8;
			
			v = 80 / n; // сколько литров в одном малом бидоне
			v = (v + 12) * m; // количество литров в m бидонах
			
			System.out.println("Количество литров в задаче 6 = " + v);
			
	}
	
	public static void task07() {
		
		// Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
		
		int a;
		int b;
		int s;
		
		a = 20;
		b = a / 2;
		s = a * b;
		
		System.out.println("Площадь прямоугольника равна " + s);		
		
		
	}
	
	public static void task08() {
		
		/*
		 Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		 */
		
		int a;
		int b;
		int c;
		
		double chis; // числитель дроби
		double proiz; // произведение
		double rez; // результат
		
		a = 10;
		b = 15;
		c = 7;
		
		chis = b + Math.sqrt(Math.pow(b, 2) + (4 * a * c));
		proiz = Math.pow(a, 3) * c;
		rez = (chis / (2 * a)) - proiz - Math.pow (b, -2);
		System.out.println("Результат вычисления 8 задачи равен " + rez);
	}
	
	public static void task09() {
		
		/*
		 Вычислить значение выражения по формуле (все переменные принимают действительные значения)
		 */
		
		double a;
		double b;
		int c;
		int d;
		
		double drob; // результат 3 дроби
		double proiz; // произведение
		double rez; // результат
		
		a = 10;
		b = 15;
		c = 7;
		d = 26;
		
		drob = (a * b - c) / (c * d);
		proiz = (a * c) * (b / d);
		rez = proiz - drob;
		System.out.println("Результат вычисления 9 задачи равен " + rez);
	}

	public static void task10() {
		
		/*
		 Вычислить значение выражения по формуле (все переменные принимают действительные значения)
		 */
		
		double x;
		double y;
		double z; // произведение x, y
		
		x = 45.0;
		y = 60.0;
		z = x * y;
		
		double xRad = (x * Math.PI) / 180; // далее переводим градусы в радианы
		double yRad = (y * Math.PI) / 180;
		double zRad = (z * Math.PI) / 180;
		
		double drob; // результат дроби
		double rez; // результат
				
		drob = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad));
		rez = drob * Math.tan(zRad);
		System.out.println("Результат вычисления 10 задачи равен " + rez);
	}

}

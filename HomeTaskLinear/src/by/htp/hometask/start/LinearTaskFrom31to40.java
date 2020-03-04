package by.htp.hometask.start;

public class LinearTaskFrom31to40 {

	public static void main(String[] args) {
		
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37a();
		task37b();
		task37c();
		task37d();
		task37e();
		task37f();
		task37g();
		task37h();
		task37i();
		task38b();

	}
	
	public static void task31() {
		
		/*  Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость
течения реки v 1 км/ч, время движения по озеру t 1 ч, а против течения реки — t 2 ч. */
		
		int v;
		int v1;
		int t1;
		int t2;
		int s;
		int s1;
		
		v = 10;
		v1 = 3;
		t1 = 2;
		t2 = 3;
		
		s = v * t1;
		s1 = (v - v1) * t2;
				
		System.out.println("Путь, пройденный лодкой по озеру, составит " + s);
		System.out.println("Путь, пройденный лодкой против течения реки, составит " + s1);
	}
	
	public static void task32() {
		
		/*  Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать
часы через р ч q мин r с? */
		
		int m;
		int n;
		int k;
		int a;
		int p;
		int q;
		int r;
		int b;
		int rez;
		
		m = 4;
		n = 45;
		k = 30;
		p = 7;
		q = 30;
		r = 22;
		
		a = m * 3600 + n * 60 + k;
		b = p * 3600 + q * 60 + r;
		rez = a + b; // общее число секунд
		a = rez % 3600; // остаток секунд
		k = rez - a; // секунды, которые пойдут в часы
		m = k / 3600;
		n = a % 60; // остаток секунд
		r = a - n; // секунды, которые пойдут в минуты
		r = r / 60;
		
		System.out.println("Итоговое время будет " + m + "ч " + r + "мин " + n + "с");	
	}
	
	public static void task33() {
		
		/* Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. */
		
		char ch = 't';
		int code;
		code = ch;
		
		System.out.println(code);
		System.out.println((char)(code - 1));
		System.out.println((char)(code + 1));
	}
	
	public static void task34() {
		
		/* Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения
информации */
		
		float n;
		float k;
		float q;
		float p;
		float u = 996578497;
		 
		n = u / 1024;
		k = n / 1024;
		p = k / 1024;
		q = p / 1024;
		
		System.out.println(u + " b равно " + n + " kb, в то же время равно " + k + " mb, " + p + " gb, " + q + " tb");	
	}
	
	public static void task35() {
		
		/* Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N. */
		
		int m;
		int n;
		double drob;
		double drob1;
		double drob2;
		
		m = 11825;
		n = 33;
		
		drob = (double) m / n;
		drob1 = (int) drob;
		drob1 = (double) drob - drob1;
		drob1 = drob1 * 10;
		drob1 = (int) drob1;
		
		drob2 = (int) drob;
		drob2 = drob2 % 10;
		
		System.out.println("Старшая цифра дробной части равна " + drob1 + ", а младшая цифра целой части равна " + drob2);				
	}
	
	public static void task36() {
		
		/* Найти частное произведений четных и нечетных цифр четырехзначного числа.*/
		
		int chis;
		double a;
		double b;
		double c;
		double d;
		double proiz1;
		double proiz2;
		double chastn;
		
		
		chis = 8921;
		proiz1 = 1;
		proiz2 = 1;
		
		a = (double) chis / 1000;
		a = (int) a;
		b = (double) chis / 100;
		b = (int) b;
		b = b % 10;
		c = (double) chis / 10;
		c = (int) c;
		c = c % 10;
		d = chis % 10;
		
		if (a % 2 == 0)
			proiz1 *= a;
		else proiz2 *= a;
		
		if (b % 2 == 0)
			proiz1 *= b;
		else proiz2 *= b;
		
		if (c % 2 == 0)
			proiz1 *= c;
		else proiz2 *= c;
		
		if (d % 2 == 0)
			proiz1 *= d;
		else proiz2 *= d;
		
		chastn = proiz1 / proiz2;
		
		System.out.println("Частное произведений четных и нечетных цифр четырехзначного числа " + chis + " равно " + chastn);				
	}
	
	public static void task37a() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
• Целое число N является четным двузначным числом.*/
		
		double n = 68;
		double a = n / 100;
		
		if ( a >= 0.1 && a < 1 ) {
			if (n % 2 == 0 )
				System.out.println("true");
			
			else System.out.println("false");
		}
		else System.out.println("false");
	}
	
	public static void task37b() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.*/
		
		int chis;
		double a;
		double b;
		double c;
		double d;
		
		chis = 3544;
		
		a = (double) chis / 1000;
		a = (int) a;
		b = (double) chis / 100;
		b = (int) b;
		b = b % 10;
		c = (double) chis / 10;
		c = (int) c;
		c = c % 10;
		d = chis % 10;
		
		if (a + b == c + d)
			System.out.println("true");
		else System.out.println("false");
	}
	
	public static void task37c() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
Сумма цифр данного трехзначного числа N является четным числом.*/
		
		int chis;
		double a;
		double b;
		double c;
		
		chis = 382;
		
		a = (double) chis / 100;
		a = (int) a;
		b = (double) chis / 10;
		b = (int) b;
		b = b % 10;
		c = (double) chis % 10;
		
		if ((a + b + c) % 2 == 0)
			System.out.println("true");
		
		else System.out.println("false");
	}
	
	public static void task37d() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).*/
		
		int m;
		int n;
		int x;
		
		m = 15;
		n = 25;
		x = 18;
		
		if (x >= m && x <= n)
			System.out.println("true");
		
		else System.out.println("false");
	}
	
	public static void task37e() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.*/
		
		int chis;
		double a;
		double b;
		double c;
		double sum;
		
		chis = 143;
		
		a = (double) chis / 100;
		a = (int) a;
		b = (double) chis / 10;
		b = (int) b;
		b = b % 10;
		c = (double) chis % 10;
		sum = a + b + c;
		
		if (Math.pow(chis, 2) == Math.pow(sum, 3))
			System.out.println("true");
		
		else System.out.println("false");
	}
	
	public static void task37f() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
Треугольник со сторонами а,b,с является равнобедренным.*/
		
		int a;
		int b;
		int c;
		
		a = 10;
		b = 6;
		c = 10;
		
		if (a == b || b ==c || a == c)
			System.out.println("true");
		
		else System.out.println("false");
	}
	
	public static void task37g() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.*/
		
		int n;
		double a;
		double b;
		double c;
		
		n = 523;
		
		a = (double) n / 100;
		a = (int) a;
		b = (double) n / 10;
		b = (int) b;
		b = b % 10;
		c = (double) n % 10;
		
		if (a + b == c || b + c == a || a + c == b)
			System.out.println("true");
		
		else System.out.println("false");
	}
	
	public static void task37h() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).*/
		
		double n;
		int a;
		double t = 1;
		
		n = 27;
		a = 3;
		
		for (int i = 0; i <= 4; i++) {
			t = Math.pow(a, i);
			if (n == t) {
				System.out.println("задача 37h true");
				break;
			}
		}
		if (n != t)
		System.out.println("задача 37h false");
	}
	
	public static void task37i() {
		
		/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:
График функции у = ах 2 + bх+ с проходит через заданную точку с координатами (m, п)*/
		
		double n;
		double m;
		int a;
		int b;
		int c;
		double funk;
		
		m = 2;
		n = 11;
		a = 1;
		b = 2;
		c = 3;
		
		funk = a * Math.pow(m, 2) + b * m + c;

		if (n == funk)
		System.out.println("задача 37i true");
		else System.out.println("задача 37i false");
	}
	
	public static void task38b() {
		
		/* Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/
		
		int x;
		int y;
		int x1;
		int x2;
		int x3;
		int x4;
		int y1;
		int y2 = 0;
		int y3;
		
		x1 = -5;
		x2 = -3;
		x3 = 4;
		x4 = 9;
		x = -4;
		y1 = -10;
		y3 = 13;
		y = -5;
		
		if (x >= x1 && x <= x4 && y >= y1 && y < y2 | x >= x2 && x <= x3 && y >= y2 && y <= y3)
			System.out.println("задача 38b true");
		else System.out.println("задача 38b false");
	}
}

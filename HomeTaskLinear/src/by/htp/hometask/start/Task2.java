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
		
		// ���� ��� �������������� ����� � � �. ��������� �� �����, ��������, ������������ � �������
		
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
		
		// ������� �������� �������: � = 3 + �
		
		int a;
		int c;
		
		a = 8;
		c = 3 + a;
		
		System.out.println("�������� ������� ������ 2 = " + c);
		
	}
	
	public static void task03() {
		
		// ������� �������� �������: z = 2 * x + ( y � 2 ) * 5
		
		int x;
		int y;
		int z;
		
		x = 13;
		y = 6;
		z = 2 * x + (y - 2) * 5;
		
		System.out.println("�������� ������� ������ 3 = " + z);
		
	}
	
	public static void task04() {
		
		// ������� �������� �������: z = ( (a � 3 ) * b / 2) + c
		
		int a;
		int b;
		int c;
		int z;
		
		a = 4;
		b = 17;
		c = 2;
		z = ((a - 3) * (b / 2)) + c;
		
		System.out.println("�������� ������� ������ 4 = " + z);
		
	}
	
	public static void task05() {
	// ��������� �������� ���������� �������� ��������������� ���� �����
		
		double a;
		int b;
		double c;
		
		a = 8;
		b = 7;
		
		c = (a + b) / 2;
		
		System.out.println("������� �������������� ���� ����� ������ 5 = " + c);
		
	}
	
	public static void task06() {
		/* �������� ��� ��� ������� ������. � n ����� ������� 80 � ������. ������� ������ ������ � m ������� �������,
		���� � ������ ������� ������ �� 12 �. ������, ��� � �����?*/
			
			double n;
			double v; // ���������� ������
			int m;
			
			n = 10;
			m = 8;
			
			v = 80 / n; // ������� ������ � ����� ����� ������
			v = (v + 12) * m; // ���������� ������ � m �������
			
			System.out.println("���������� ������ � ������ 6 = " + v);
			
	}
	
	public static void task07() {
		
		// ��� �������������, ������ �������� � ��� ���� ������ �����. ����� ������� ��������������
		
		int a;
		int b;
		int s;
		
		a = 20;
		b = a / 2;
		s = a * b;
		
		System.out.println("������� �������������� ����� " + s);		
		
		
	}
	
	public static void task08() {
		
		/*
		 ��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������):
		 */
		
		int a;
		int b;
		int c;
		
		double chis; // ��������� �����
		double proiz; // ������������
		double rez; // ���������
		
		a = 10;
		b = 15;
		c = 7;
		
		chis = b + Math.sqrt(Math.pow(b, 2) + (4 * a * c));
		proiz = Math.pow(a, 3) * c;
		rez = (chis / (2 * a)) - proiz - Math.pow (b, -2);
		System.out.println("��������� ���������� 8 ������ ����� " + rez);
	}
	
	public static void task09() {
		
		/*
		 ��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������)
		 */
		
		double a;
		double b;
		int c;
		int d;
		
		double drob; // ��������� 3 �����
		double proiz; // ������������
		double rez; // ���������
		
		a = 10;
		b = 15;
		c = 7;
		d = 26;
		
		drob = (a * b - c) / (c * d);
		proiz = (a * c) * (b / d);
		rez = proiz - drob;
		System.out.println("��������� ���������� 9 ������ ����� " + rez);
	}

	public static void task10() {
		
		/*
		 ��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������)
		 */
		
		double x;
		double y;
		double z; // ������������ x, y
		
		x = 45.0;
		y = 60.0;
		z = x * y;
		
		double xRad = (x * Math.PI) / 180; // ����� ��������� ������� � �������
		double yRad = (y * Math.PI) / 180;
		double zRad = (z * Math.PI) / 180;
		
		double drob; // ��������� �����
		double rez; // ���������
				
		drob = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad));
		rez = drob * Math.tan(zRad);
		System.out.println("��������� ���������� 10 ������ ����� " + rez);
	}

}

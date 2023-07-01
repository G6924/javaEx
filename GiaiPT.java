import java.util.Scanner;
class GiaiPT{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nNhap so a : ");
		int a = input.nextInt();

		System.out.print("\nNhap so b : ");
		int b = input.nextInt();

		System.out.print("\nNhap so c : ");
		int c = input.nextInt();

		double delTa = (b*b) - (4*a*c);
		// Hien phuong trinh bac 2
		
		System.out.println("\n----------------");
		String strings = String.format("PT : (%sx^2) + (%sx) + (%s) = 0 \n**\nDelta = %s", a, b, c,delTa);
		System.out.println(strings);
		System.out.println("----------------\n");

		if (delTa < 0) {
			System.out.println("Phuong trinh tren ' Vo Nghiem '");
		}
		else if (delTa > 0) {
			double nghiem1 = ((-b) + Math.sqrt(delTa))/(2*a); 
			double nghiem2 = ((-b) - Math.sqrt(delTa))/(2*a); 
			String string1 = String.format("Phuong trinh co 2 nghiem la : \n 	x1 = %s ,\n 	x2 = %s",nghiem1, nghiem2);
			System.out.println(string1);
		}
		else if (delTa == 0) {
			double nghiem = -(b/(2*a));
			String string2 = String.format("Phuong trinh co 2 nghiem la : \n 	x1 = x2 = %s",nghiem);
			System.out.println(string2);
		}
	}
}
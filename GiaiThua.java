import java.util.Scanner;
class GiaiThua {
	public static int giaithua(int n){
		if (n <= 1) {
			return 1;
		}
		else {
			return n * giaithua(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap n : ");
		int n = input.nextInt();

		//Su dung ham de quy !

		String dequy = String.format("\nGiai thua cua %s = %s (su dung ham De Quy) !",n,giaithua(n));
		System.out.println(dequy);

		// Su dung vong lap for !
		
		int gt = 1;
		for (int i = 1;i<= n ; i++) {
			gt *= i;
		}
		String lapfor = String.format("\nGiai thua cua %s = %s (su dung vong lap for !)",n,gt);
		System.out.println(lapfor);
	}

}
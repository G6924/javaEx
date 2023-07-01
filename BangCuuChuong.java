class BangCuuChuong{
	public static void main(String[] args) {
		for (int i = 2 ; i<= 9 ; i++) {
			System.out.println("\n-----------------");
			System.out.println("Bang Cuu Chuong "+i);
			System.out.println("-----------------\n");
			for (int j = 1 ; j <= 9 ; j++) {
				String show = String.format("%s * %s = %s",i,j,i*j);
				System.out.println(show);
			}
			System.out.println("\n");
		}
	}
} 
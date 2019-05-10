import java.util.Scanner;
public class wars2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("INPUT");
		System.out.println("PANJANG");
		double p = input.nextDouble();
		System.out.println("LEBAR : ");
		double l = input.nextDouble();
		
		int luas = (int)p * (int)l;
		int keliling = (int) (p + l);
		
		System.out.println("OUTPUT");
		System.out.println("LUAS : " + luas);
		System.out.println("KELILING : " + keliling);
	}

}

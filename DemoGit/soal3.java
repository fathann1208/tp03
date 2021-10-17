import java.util.Scanner;
public class soal3{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Dira Mempunyai permen sejumlah" );
			int jmlhpermen = input.nextInt();

				System.out.println("Dira membagi ke temanya sejumlah" );
			int diraDantmndira = input.nextInt();


		/*System.out.println("Dira mempunyai permen 20" );
		int jmlhpermen = 20;
		System.out.println("Dira membagi ke teman 3" );
		int diraDantmndira = 3;*/

	
		System.out.println("Hasil dari pembagian : "+(jmlhpermen/diraDantmndira));

		System.out.println("Hasil dari sisa bagi : "+(jmlhpermen%diraDantmndira));
	}
}
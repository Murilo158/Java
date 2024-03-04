import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("infome o valor de n1");
		n1 = sc.nextFloat();
		
		System.out.println("infome o valor de n2");
		n2 = sc.nextFloat();
		
		System.out.println("infome o valor de n3");
		n3 = sc.nextFloat();
		
		System.out.println("infome o valor de n4");
		n4 = sc.nextFloat();
		
		float media = (n1 *2+n2 *2+n3 *3+n4 *3)/10;
		
		System.out.printf("A media de %f, %f e %f é %.2f", n1, n2, n3, n4, media);
		
		float desconto = media * 0.11f; 
		float mediaComDesconto = media - desconto;
		
		System.out.printf("A media de %.2f, %.2f, %.2f e  %.2f é %.2f\n", n1, n2, n3, n4, media);
		System.out.printf("Com desconto de 11%, a media final é: %.2f\n", mediaComDesconto);
		
		sc.close();


	}

}

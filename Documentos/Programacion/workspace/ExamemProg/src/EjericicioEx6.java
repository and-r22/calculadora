import java.util.Scanner;

public class EjericicioEx6 {

	public static void main(String[] args) {

		int suma3 = 0, suma5 = 0, num = 0, cont = 0;
		
		Scanner sc = new Scanner (System.in);
		
		do
		{
			System.out.println("Introduce un número (Salir = negativo)");
			num = sc.nextInt();
			if (num < 0)
			{
				break;
			}
			else
			{
				cont++;
				if (num % 2 == 0 & num % 5 == 0)
				{
					suma5 += num;
				}
				else 
				{
					if (num % 2 != 0 & num % 3 == 0)
					{
						suma3 += num;
					}
				}
			}
		}
		while (num >= 0);
		
		System.out.println("Has introducido " + cont + " números");
		System.out.println("La suma de los pares multiplos de 5 es " + suma5);
		System.out.println("La suma de los impares multiplos de 3 es " + suma3);
	}

}

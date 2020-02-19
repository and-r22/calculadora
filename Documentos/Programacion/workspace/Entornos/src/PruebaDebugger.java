import java.util.Scanner;

public class PruebaDebugger {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int dimension;
		int[][] matriz;
		System.out.println("Introduce la dimensión de la matriz:");
		dimension = sc.nextInt();
		sc.close();
		matriz = new int[dimension][dimension];
		
		for (int i = 0; i < matriz.length; i++) 
		{
			for (int j = 0; j < matriz[i].length; j++) 
			{
				matriz[i][j] = (int) (Math.random() * 101);
			}
		}
		int elmasgrande = elMayor(matriz);
		System.out.println("El valor mas grande generado es: " + elmasgrande);
	}
	
	public static int elMayor (int[][] matriz)
	{
		int mayor = 0;
		for (int i = 0; i < matriz.length; i++) 
		{
			for (int j = 0; j < matriz[i].length; j++) 
			{
				if (matriz[i][j] > mayor)
				{
					mayor = matriz [i][j];
				}
			}
		}
		return mayor;
	}

}

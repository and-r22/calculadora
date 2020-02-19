
public class EjercicioEx7 {

	public static void main(String[] args) {

		int max = 0, min = 135, puntuacion, frecuenciamax;
		double media = 0;
		
		int frecuencia[] = new int [136];
		
		for (int i = 0; i < 1000; i++) 
		{
			puntuacion = (int) (Math.random() * 136);
			if (puntuacion > max)
			{
				max = puntuacion;
			}
			else
			{
				if (puntuacion < min)
				{
					min = puntuacion;
				}
			}
			media += puntuacion;
			frecuencia [puntuacion]++;
		}
		
		System.out.println("La nota maxima es " + max);
		System.out.println("La nota minima es " + min);
		System.out.println("La nota media es " + (media/1000));
		
		int postmayor = 0, mayor = frecuencia[postmayor];
		
		for (int i = 0; i < frecuencia.length; i++) 
		{
			System.out.println(i + " se repite " + frecuencia[i] + " veces");
			if (frecuencia [i] > mayor)
			{
				mayor = frecuencia [i];
			}
			postmayor = i;
		}
		
		System.out.println(mayor + " " + postmayor );
		
	}

}

package JUnit;

public class ContarLetras {
	
	public int contar_letras (String cadena, char letra)
	{
		int contador = 0, n = 0, lon;
		lon = cadena.length();
		if (lon > 0)
		{
			do
			{
				if (cadena.charAt(contador) == letra) n++;
				contador++;
				lon--;
			}
			while (lon > 0);
		}
		return n;
	}
	
}

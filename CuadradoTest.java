package www.unlam.edu.ar;


import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest
{

	@Test
	public void testAreaDelTriangulo()
	{
		Cuadrado miAreaCuadrado = new Cuadrado();
		Double areaCuadradoEsperado = 4830.25;
		
		Double areaCuadradoObtenido = miAreaCuadrado.areaCuadrado(69.5,69.5);
		
		Assert.assertEquals(areaCuadradoObtenido,areaCuadradoEsperado);
		
		miAreaCuadrado=null;
	}
}

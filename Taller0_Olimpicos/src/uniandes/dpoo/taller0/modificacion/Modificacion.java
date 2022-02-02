package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	


public static void main(String[] args) throws FileNotFoundException, IOException
{	
	System.out.println("Hola, mundo!");
	CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
	Map<String, Integer> paises = calc.paisConMasMedallistas();
	if (paises.size() > 1)
	{
		System.out.println("Hay " + paises.size() + " países empatados en el primer lugar.");
	}
	for (String nombre : paises.keySet())
	{
		System.out.println(nombre + " ha tenido " + paises.get(nombre) + " medallistas");
	}
}

}
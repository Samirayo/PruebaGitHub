
import java.util.Scanner;

public class Areas 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la base del triangulo: ");
		double base = entrada.nextDouble();
		System.out.println("Introduce la altura del triangulo: ");
		double altura = entrada.nextDouble();
		
		double resultado = calcularAreaTriangulo(base, altura);
		System.out.println("El area del triangulo es: " + resultado);
	}
	
	public static double calcularAreaTriangulo(double base, double altura) 
	{
		return (base*altura)/2;
	}
	
	public static double clcularAreaCircunferencia(double radio)
	{
		return 3.1415 * radio * radio;
		
	}
	
	public static double calcularPerimetroCircunferencia (double radio)
	{
		return 2 * 3.1415 * radio;
	}
	
	
}

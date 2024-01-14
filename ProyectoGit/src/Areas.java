
import java.util.Scanner;

public class Areas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce la base del triangulo: ");
		double base = entrada.nextDouble();
		System.out.println("Introduce la altura del triangulo: ");
		double altura = entrada.nextDouble();
		System.out.println("Ingrese el radio de la circunferencia y el cilindro: ");
		int radio = entrada.nextInt();
		
		

		double resultado = calcularAreaTriangulo(base, altura);
		double areaCircunferencia = calcularAreaCircunferencia(radio);
		double perimetroCircunferencia = calcularAreaCircunferencia(radio);
		System.out.println("El area del triangulo es: " + resultado);
		System.out.println("El area de la circunferencia es: " + areaCircunferencia);
		System.out.println("El perimetro de la circunferencia es: " + perimetroCircunferencia);
	}

	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}

	public static double calcularAreaCircunferencia(int radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	public static double calcularPerimetroCircunferencia(int radio) {
		return 2 * Math.PI * radio;
	}
}

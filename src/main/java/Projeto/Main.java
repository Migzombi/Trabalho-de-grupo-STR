<<<<<<< HEAD
package Projeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EscolherConvertor conv = new EscolherConvertor();
		Scanner s = new Scanner(System.in);
		conv.setConvertor(new ConverterCelsiusAFahrenheit());
		System.out.println("Qual conversão deseja fazer?");
		System.out.println("1-Celsius para Fahrenheit");
		System.out.println("2-Farenheit para Celsius");
		System.out.println("3-Kelvin para Celsius");
		System.out.println("4-Celsius para Kelvin");
		System.out.println("5-Kelvin para Fahrenheit");
		System.out.println("6-Fahrenheit para Kelvin");
		int op = s.nextInt();
		if(op>=1 && op<=6) {
			System.out.println("Quantos graus são?");
			double temp= s.nextDouble();
			switch(op){
				case 1:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resCF = conv.realizarCalculo(temp);
					System.out.println(temp+" Celsius = "+resCF+" Fahrenheit.");
					break;
				case 2:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resFC = conv.realizarCalculo(temp);
					System.out.println(temp+" Fahrenheit = "+resFC+" Celsius.");
					break;
				case 3:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resKC = conv.realizarCalculo(temp);
					System.out.println(temp+" Kelvin = "+resKC+" Celsius.");
					break;
				case 4:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resCK = conv.realizarCalculo(temp);
					System.out.println(temp+" Celsius = "+resCK+" Kelvin.");
					break;
				case 5:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resKF = conv.realizarCalculo(temp);
					System.out.println(temp+" Kelvin = "+resKF+" Fahrenheit.");
					break;
				case 6:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resFK = conv.realizarCalculo(temp);
					System.out.println(temp+" Fahrenheit = "+resFK+" Kelvin.");
					break;
				default:
					System.out.println("Erro! Opção invalida.");
					break;
				}
		}else {
			System.out.println("Erro! Opção invalida.");
		}
		
	}
}
=======
package Projeto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		EscolherConvertor conv = new EscolherConvertor();
		Scanner s = new Scanner(System.in);
		conv.setConvertor(new ConverterCelsiusAFahrenheit());
		System.out.println("Qual conversão deseja fazer?");
		System.out.println("1-Celsius para Fahrenheit");
		System.out.println("2-Farenheit para Celsius");
		System.out.println("3-Kelvin para Celsius");
		System.out.println("4-Celsius para Kelvin");
		System.out.println("5-Kelvin para Fahrenheit");
		System.out.println("6-Fahrenheit para Kelvin");
		int op = s.nextInt();
		if(op>=1 && op<=6) {
			System.out.println("Quantos graus são?");
			double temp= s.nextDouble();
			switch(op){
				case 1:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resCF = conv.realizarCalculo(temp);
					System.out.println(temp+" Celsius = "+resCF+" Fahrenheit.");
					break;
				case 2:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resFC = conv.realizarCalculo(temp);
					System.out.println(temp+" Fahrenheit = "+resFC+" Celsius.");
					break;
				case 3:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resKC = conv.realizarCalculo(temp);
					System.out.println(temp+" Kelvin = "+resKC+" Celsius.");
					break;
				case 4:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resCK = conv.realizarCalculo(temp);
					System.out.println(temp+" Celsius = "+resCK+" Kelvin.");
					break;
				case 5:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resKF = conv.realizarCalculo(temp);
					System.out.println(temp+" Kelvin = "+resKF+" Fahrenheit.");
					break;
				case 6:
					conv.setConvertor(new ConverterCelsiusAFahrenheit());
					double resFK = conv.realizarCalculo(temp);
					System.out.println(temp+" Fahrenheit = "+resFK+" Kelvin.");
					break;
				default:
					System.out.println("Erro! Opção invalida.");
					break;
				}
		}else {
			System.out.println("Erro! Opção invalida.");
		}
		
	}
}
>>>>>>> 4e40235 (Codigo atualizado)

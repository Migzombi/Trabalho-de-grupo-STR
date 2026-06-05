package Projeto;

public class ConverterKelvinAFahrenheit implements ConvertorUnidades{

	@Override
	public double converter(double unid) {
		return (unid * 1.8)-459.67;
	}

}


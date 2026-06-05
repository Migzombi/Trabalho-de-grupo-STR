package Projeto;

public class ConverterFahrenheitAKelvin implements ConvertorUnidades{

	@Override
	public double converter(double unid) {
		return ((unid-32)/1.8)+273.15;
	}

}


package Projeto;

public class ConverterKelvinAFahrenheit implements ConvertorUnidades{

	@Override
	public double converter(double unid) {
		return ((unid - 273.15)*1.8)+32;
	}

}


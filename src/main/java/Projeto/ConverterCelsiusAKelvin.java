package Projeto;

public class ConverterCelsiusAKelvin implements ConvertorUnidades{

	@Override
	public double converter(double unid) {
		return unid + 273.15;
	}

}

package Projeto;

public class ConverterKelvinACelsius implements ConvertorUnidades{

	@Override
	public double converter(double unid) {
		return unid - 273.15;
	}

}


package Projeto;

public class ConverterFahrenheitACelsius implements ConvertorUnidades {

	@Override
	public double converter(double unid) {
		return (unid-32)/1.8;
	}

}

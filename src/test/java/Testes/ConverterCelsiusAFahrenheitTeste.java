package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Projeto.ConverterCelsiusAFahrenheit;



public class ConverterCelsiusAFahrenheitTeste {
	@Test
	void CAFTeste() {
	    double unid = 20.5;
	    ConverterCelsiusAFahrenheit convertor = new ConverterCelsiusAFahrenheit();
	    double x = convertor.converter(unid);
	    assertEquals(68.9, x);   
	}
}

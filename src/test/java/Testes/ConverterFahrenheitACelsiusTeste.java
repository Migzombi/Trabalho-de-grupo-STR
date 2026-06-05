package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Projeto.ConverterFahrenheitACelsius;



public class ConverterFahrenheitACelsiusTeste {
	@Test
	void CAFTeste() {
	    double unid = 122;
	    ConverterFahrenheitACelsius convertor = new ConverterFahrenheitACelsius();
	    double x = convertor.converter(unid);
	    assertEquals(50, x);   
	}
}


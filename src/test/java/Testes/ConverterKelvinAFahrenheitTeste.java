package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Projeto.ConverterKelvinAFahrenheit;



public class ConverterKelvinAFahrenheitTeste {
	@Test
	void CAFTeste() {
	    double unid = 277.59;
	    ConverterKelvinAFahrenheit convertor = new ConverterKelvinAFahrenheit();
	    double x = convertor.converter(unid);
	    assertEquals(40, x, 0.1);   
	}
}
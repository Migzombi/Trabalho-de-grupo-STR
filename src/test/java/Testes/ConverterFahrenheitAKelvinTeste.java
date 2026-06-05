package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Projeto.ConverterFahrenheitAKelvin;



public class ConverterFahrenheitAKelvinTeste {
	@Test
	void CAFTeste() {
	    double unid = -351.67;
	    ConverterFahrenheitAKelvin convertor = new ConverterFahrenheitAKelvin();
	    double x = convertor.converter(unid);
	    assertEquals(60, x, 0.1);   
	}
}

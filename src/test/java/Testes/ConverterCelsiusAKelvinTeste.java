package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Projeto.ConverterCelsiusAKelvin;



public class ConverterCelsiusAKelvinTeste {
	@Test
	void CAFTeste() {
	    double unid = -173.15;
	    ConverterCelsiusAKelvin convertor = new ConverterCelsiusAKelvin();
	    double x = convertor.converter(unid);
	    assertEquals(100, x, 0.1);   
	}
}
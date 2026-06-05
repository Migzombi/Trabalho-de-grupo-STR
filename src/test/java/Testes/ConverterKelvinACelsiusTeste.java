package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Projeto.ConverterKelvinACelsius;



public class ConverterKelvinACelsiusTeste {
	@Test
	void CAFTeste() {
	    double unid = 303.15;
	    ConverterKelvinACelsius convertor = new ConverterKelvinACelsius();
	    double x = convertor.converter(unid);
	    assertEquals(30, x, 0.1);   
	}
}
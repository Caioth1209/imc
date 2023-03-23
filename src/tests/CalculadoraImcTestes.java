package tests;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import control.CalculadoraImc;

public class CalculadoraImcTestes {
	
	CalculadoraImc calc;
	
	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}
	
//	--------  Adulto  -------------------
	@Test
	public void testeAdultoBaixoPesoMuitoGrave() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.733, 48, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveLimiteInferior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.732, 48, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoGraveLimiteSuperior() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.7493, 52, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoLimiteInferior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.7487, 52, 20, "masculino"));
	}
	
	@Test
	public void testeAdultoBaixoPesoLimiteSuperior() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.709, 54, 20, "masculino"));
	}
	@Test
	public void testeAdultoPesoNormalLimiteInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.7083, 54, 20, "masculino"));
	}
	@Test
	public void testeAdultoPesoNormalLimiteSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.709, 73, 20, "masculino"));
	}
	@Test
	public void testeAdultoSobrepesoLimiteInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.697, 72, 20, "masculino"));
	}
	@Test
	public void testeAdultoSobrepesoLimiteSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.5497, 72, 20, "feminino"));
	}
	@Test
	public void testeAdultoObesidadeGrau1LimiteInferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.663, 83, 20, "feminino"));
	}
	@Test
	public void testeAdultoObesidadeGrau1LimiteSuperior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.7074, 102, 20, "feminino"));
	}
	@Test
	public void testeAdultoObesidadeGrau2LimiteInferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.7071, 102, 20, "feminino"));
	}
	
	@Test
	public void testeAdultoObesidadeGrau2LimiteSuperior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.7032, 116, 20, "feminino"));
	}
	
	@Test
	public void testeAdultoObesidadeGrau3() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.702, 116, 20, "feminino"));
	}

	
	//	--------  Idoso Feminino -------------------
	@Test
	public void testeIdosoFemininoBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.679, 62, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoPesoNormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6783, 62, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoPesoNormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.7106, 79, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.707, 79, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.714, 94, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrau1Inferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.711, 94, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrau1Superior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.7163, 109, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrau2Inferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.714, 109, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrau2Superior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.6975, 121, 66, "feminino"));
	}
	
	@Test
	public void testeIdosoFemininoObesidadeGrau3Superior() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.70, 122, 66, "feminino"));
	}

//	--------  Idoso Masculino -------------------
	@Test
	public void testeIdosoMasculinoBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.679, 62, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoPesoNormalInferior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6785, 62, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoPesoNormalSuperior() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.7106, 79, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoSobrepesoInferior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.7073, 79, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoSobrepesoSuperior() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.7028, 87, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrau1Inferior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.7, 87, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrau1Superior() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.7154, 103, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrau2Inferior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.713, 103, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrau2Superior() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.7177, 118, 66, "masculino"));
	}
	
	@Test
	public void testeIdosoMasculinoObesidadeGrau3Superior() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.71, 118, 66, "masculino"));
	}
	

}

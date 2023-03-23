package control;

public class CalculadoraImc {
	
	public String calcularImcIdoso(double imc, String sexo) {
		
		switch (sexo) {
			case "masculino": {
				
				if(imc >= 40.0) {
					return "Obesidade grau III";
					
				} else if (imc >= 35.1) {
					return "Obesidade grau II";
					
				} else if (imc >= 30.1) {
					return "Obesidade grau I";
					
				} else if(imc >= 27.1) {
					return "Sobrepeso";
					
				} else if (imc >= 22.0) {
					return "Peso normal";
					
				} else {
					return "Baixo peso";
					
				}
				
			}
			
			case "feminino": {
				
				if(imc >= 42.0) {
					return "Obesidade grau III";
					
				} else if (imc >= 37.1) {
					return "Obesidade grau II";
					
				} else if (imc >= 32.1) {
					return "Obesidade grau I";
					
				} else if(imc >= 27.1) {
					return "Sobrepeso";
					
				} else if (imc >= 22.0) {
					return "Peso normal";
					
				} else {
					return "Baixo peso";
				}
			}
			
		}
		
		return "erro";
	}
	
	public String calcularImcAdulto(double imc) {
		
		if(imc >= 40.0) {
			return "Obesidade grau III";
			
		} else if (imc >= 35.0) {
			return "Obesidade grau II";
			
		} else if (imc >= 30.0) {
			return "Obesidade grau I";
			
		} else if(imc >= 25.0) {
			return "Sobrepeso";
			
		} else if (imc >= 18.5) {
			return "Peso normal";
			
		} else if (imc >= 17.0) {

			return "Baixo peso";
			
		} else if (imc >= 16.0) {
			return "Baixo peso grave";
			
		} else {
			return "Baixo peso muito grave";
		}
	}
	

	public String calcularImc(double altura, double peso, int idade, String sexo) {
		double imc = peso/(altura*altura);
		
		if(idade > 65) {
			return calcularImcIdoso(imc, sexo);
		} else if (idade >= 20) {
			return calcularImcAdulto(imc);
		} else {
			return "Não foi possível calcular";
		}
	}
}

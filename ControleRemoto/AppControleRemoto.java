package Aldo;

public class AppControleRemoto {

	public static void main(String[] args) {
		
		ControleRemoto cadastrar = new ControleRemoto(18, "Samsung", 13, 40);
		
		System.out.println("ID do controle: " + cadastrar.getIdControle());
		System.out.println("Modelo: " + cadastrar.getModelo());
		System.out.println("Temperatura Mínima: " + cadastrar.getTemperaturaMinima());
		System.out.println("Temperatura Máxima: " + cadastrar.getTemperaturaMaxima());
		System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual());
		
		
		cadastrar.ligarDesligar();
		System.out.println("\nEquipamento ligado!");
			
		System.out.println("\n-------------- Aumento da Temperatura ---------------\n");
		System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual()); // Mostrar a média da temperatura
		
		for(int i= 0; cadastrar.getTemperaturaAtual() < cadastrar.getTemperaturaMaxima(); i++){
			cadastrar.aumentarTemperatura();
			System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual());
			
			
			if(cadastrar.getTemperaturaAtual() == cadastrar.getTemperaturaMaxima()) {
				System.out.println("Condicionador de ar já está na temperatura Máxima!");
			}
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("\n-------------- Ajuste da Velocidade -----------------------\n");
		System.out.println("Velocidade: " + cadastrar.getVelocidade()); // Mostrar que a velocidade está no 1
		
		for(int i = 0; i < 5; i++) {
			cadastrar.ajustarVelocidade();
			System.out.println("Velocidade: " + cadastrar.getVelocidade());
		}
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("\n-------------- Diminuição da Temperatura --------------------\n");
		System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual()); // Mostrar a temperatura máxima
		for(int i = 0; cadastrar.getTemperaturaAtual() > cadastrar.getTemperaturaMinima(); i++) {
			cadastrar.diminuirTemperatura();
			System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual());
		}
		System.out.println("------------------------------------------------------------");
		
		
		cadastrar.ligarDesligar();
		cadastrar.getTemperaturaAtual();
		if(cadastrar.getLigado() == false ) {
			System.out.println("\nEquipamento desligado!");
		}
		
			
		

		
		
		
	}

}

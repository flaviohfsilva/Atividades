package Aldo;

public class AppControleRemoto {

	public static void main(String[] args) {
		
		ControleRemoto cadastrar = new ControleRemoto(18, "Samsung", 13, 40);
		
		System.out.println("ID do controle: " + cadastrar.getIdControle());
		System.out.println("Modelo: " + cadastrar.getModelo());
		System.out.println("Temperatura M�nima: " + cadastrar.getTemperaturaMinima());
		System.out.println("Temperatura M�xima: " + cadastrar.getTemperaturaMaxima());
		System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual());
		
		
		cadastrar.ligarDesligar();
		System.out.println("\nEquipamento ligado!");
			
		System.out.println("\n-------------- Aumento da Temperatura ---------------\n");
		System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual()); // Mostrar a m�dia da temperatura
		
		for(int i= 0; cadastrar.getTemperaturaAtual() < cadastrar.getTemperaturaMaxima(); i++){
			cadastrar.aumentarTemperatura();
			System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual());
			
			
			if(cadastrar.getTemperaturaAtual() == cadastrar.getTemperaturaMaxima()) {
				System.out.println("Condicionador de ar j� est� na temperatura M�xima!");
			}
		}
		System.out.println("------------------------------------------------------------");
		
		System.out.println("\n-------------- Ajuste da Velocidade -----------------------\n");
		System.out.println("Velocidade: " + cadastrar.getVelocidade()); // Mostrar que a velocidade est� no 1
		
		for(int i = 0; i < 5; i++) {
			cadastrar.ajustarVelocidade();
			System.out.println("Velocidade: " + cadastrar.getVelocidade());
		}
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("\n-------------- Diminui��o da Temperatura --------------------\n");
		System.out.println("Temperatura Atual: " + cadastrar.getTemperaturaAtual()); // Mostrar a temperatura m�xima
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

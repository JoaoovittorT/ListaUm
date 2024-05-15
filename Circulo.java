public class Circulo {

	private double raio;

	public Circulo (double novoRaio) {
		this.raio = novoRaio;
	}

	
		//get
		public double getRaio(){
			return raio;
		}
		
		//set

		public void setRaio(double novoRaio) {
			this.raio = novoRaio;
		}
		
		
		
		// Metodo - area circulo (A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²).)
		
		public double mutiplicar (double raio) {
			return raio * raio;
		}
		
		
		// P= 2 * π * r
		
		public double mutiplicar1 (double raio) {
			return  3.14 * raio * raio;
			
		}
			
		
}

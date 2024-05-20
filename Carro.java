public class Carro {

	String modelo;
	String marca;
	int    ano;
	String placa;

	//construtor
	

	public Carro (String novoModelo, String novaMarca,int novoAno, String novaPlaca) {
		this.modelo = novoModelo;
		this.marca = novaMarca;
		this.ano   = novoAno;
		this.placa = novaPlaca;
	}
		
		
	//GET
		

		public String getModelo(){
			return modelo;
		}
		
		public String getMarca() { 
			return marca;
		}
		
		public int getAno() {
			return ano;
		}
		
		public String getPlaca() {
			return placa;
		}
		
		// SET();

		
		public void setModelo (String novoModelo) {
			this.modelo = novoModelo;
		}
			
		public void setMarca (String novaMarca) {
			this.marca = novaMarca;
		}
		
		public void setAno (int novoAno) {
			this.ano = novoAno;
		}
		
		public void setPlaca (String novaPlaca) {
			this.placa = novaPlaca;
		}
}

public class Cachorro {
	
	String nome;
	String raca;
	int	   idade;
	
	
	
	//CONSTRUTOR
	public Cachorro (String novoNome, String novaRaca, int novaIdade ) {
		this.nome = novoNome;
		this.idade = novaIdade;
		this.raca = novaRaca;
	}
	
	//METODO GET();
	
	public String getNome(){
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	
	public int getIdade(){
		return idade;
	}
	
	// SET();
	

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setRaca(String novaRaca) {
		this.raca = novaRaca;
	}
	

	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	//METODO "LATIR"
	

	public String latir() {
	return "auaua";
	}
	
	

	
}

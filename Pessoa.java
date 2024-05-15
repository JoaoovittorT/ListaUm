public class Pessoa {

	private String nome;
	private int idade;
	private	double altura;
		
	
	// Construtor 
	
	public Pessoa (String novoNome, int novaIdade, double novaAltura ) {
		this.nome = novoNome;
		this.idade = novaIdade;
		this.altura = novaAltura;
	}
	
	// GET
	
	
	public String getNome(){
		return nome;
	}
		
	public int getIdade(){
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
		
	
	
	//SET
	
	
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
		
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	

	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	
	// ToString
	

	public String toString() {
	return "O seu nome é " + this.nome +  "\ne a idade dele é  " + this.idade + "\n e sua altura é: " + this.altura + " cm.";
	}
	
	
}

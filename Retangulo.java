	public class Retangulo {

	private double base;
	private double altura;
	
	
	public Retangulo (double novaBase, double novaAltura ) {
		this.base = novaBase;
		this.altura = novaAltura;
	}
	
	//GET
	public double getBase(){
		return base;
	}
	
	public double getAltura(){
		return altura;
	}
	
	
	//set

	public void setBase(double novaBase) {
		this.base = novaBase;
	}
	

	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
		
	
	// A = 3,14 /*/ Raio ao quadrado  -  area
	
	public double mutiplicar (double base, double altura) {
		return base * altura;
	}
	
	
	
	//perimetro
	public double somar (double base, double altura) {
		return (base + base) + (altura + altura);
	}

		

public class Data {

		private int dia;
		private int mes;
		private int ano;
		
		//CONSTRUTOR
		public Data(int novoDia, int novoMes, int novoAno) {
			this.ano = novoAno;
			this.dia = novoDia;
			this.mes = novoMes;
		}
		
		
		
		//GET()
		public int getDia(){
			return dia;
		}
		public int getMes(){
			return mes;
		}
		public int getAno(){
			return ano;
		}
		
		
		//SET();
		public void setDia(int novoDia) {
			this.dia = novoDia;
		}
		public void setMes(int novoMes) {
			this.mes = novoMes;
		}
		public void setAno(int novoAno) {
			this.ano= novoAno;
		}
		
		
		// TTO STRING
		

		public String datamostrar() {
		return "Dia: " + this.dia + "\nMês: " + this.mes + "\nAno: " + this.ano;
		}
		
		
		
		
		
		
}

public class Livro {

		String titulo;
		String autor;	
		String editora;
		int anoPublicacao;
		
		public Livro (String novoTitulo, String novoAutor,String novaEditora, int novoAnoPublicacao) {
			this.titulo = novoTitulo;
			this.autor = novoAutor;
			this.editora = novaEditora;
			this.anoPublicacao = novoAnoPublicacao;
		}

		//Get()
		public String getTitulo() {
			return titulo;
		}
		public String getAutor() {
			return autor;
		}
		public String getEditota() {
			return editora;
		}
		public int getAnoPublicacao() {
			return anoPublicacao;
		}

	//Set();
		
		public void setTitulo(String novoTitulo) {
			this.titulo = novoTitulo;
		}
		public void setAutor(String novoAutor) {
			this.autor = novoAutor;
		}
		public void setEditora(String novaEditora) {
			this.editora = novaEditora;
		}
		public void setAnoPublicacao(int novoAnoPublicacao) {
			this.anoPublicacao = novoAnoPublicacao;
		}
		
	}


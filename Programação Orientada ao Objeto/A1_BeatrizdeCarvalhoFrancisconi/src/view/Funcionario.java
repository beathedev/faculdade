package view;


public class Funcionario {
	public String nome;
	public int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getFuncionario(){
		return 
		"\nNome: "+this.nome+
		"\nIdade: "+this.idade;
	}

}

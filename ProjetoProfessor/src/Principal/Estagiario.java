package Principal;

import java.io.*;

public class Estagiario extends Pessoa {
	private int matricula;
	private String curso;

	public Estagiario(String nome, String sobrenome, int idade, float salario, int matricula, String curso) {
		super(nome, sobrenome, idade, salario);
		this.matricula = matricula;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "\n-------------- DADOS DE ESTAGIARIOS------------"+
				"\n Nome: " + getNome() +
				"\n Sobrenome: " + getSobrenome() +
				"\n Idade: " + getIdade() +
				"\n matricula: " + getMatricula() +
				"\n Curso: " + getCurso() +
				"\n Salario: R$" +  getSalario()+
		        "\n" + 
				"\n----------------------------------------------";
	}


	public void GerarArquivoEstagiario() throws IOException {
		FileWriter arq = new FileWriter("C:\\Users\\20172in032\\Documents\\Arquivo\\Arquivo Estagiario.doc",true);
		PrintWriter imprimearq = new PrintWriter(arq);
		imprimearq.print(toString());
		arq.close();

	}
}

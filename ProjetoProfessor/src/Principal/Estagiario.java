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
		return "Estagiario [matricula=" + matricula + ", curso=" + curso + ", getNome()=" + getNome()
				+ ", getSobrenome()=" + getSobrenome() + ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario()
				+ "]";
	}

	public void GerarArquivoEstagiario() throws IOException {
		FileWriter arq = new FileWriter("C:\\Users\\priscila\\Documents\\ArquivoEstagiario.doc");
		PrintWriter imprimearq = new PrintWriter(arq);
		imprimearq.print(toString());
		arq.close();

	}
}

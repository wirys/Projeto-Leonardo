package Principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Funcionario extends Pessoa {
	public Funcionario(String nome, String sobrenome, int idade, float salario, int siap , String coordenadoria) {
		super(nome, sobrenome, idade, salario);
		this.siap=siap;
		this.coordenadoria=coordenadoria;
	}
	private int siap;
	private String coordenadoria;
	public int getSiap() {
		return siap;
	}
	public void setSiap(int siap) {
		this.siap = siap;
	}
	public String getCoordenadoria() {
		return coordenadoria;
	}
	public void setCoordenadoria(String coordenadoria) {
		this.coordenadoria = coordenadoria;
	}
	@Override
	public String toString() {
		return "Funcionario [siap=" + siap + ", coordenadoria=" + coordenadoria + ", getNome()=" + getNome()
				+ ", getSobrenome()=" + getSobrenome() + ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario()
				+ "]";
	}
	
	public void GerarArquivoFuncionario() throws IOException {
		FileWriter arq =  new FileWriter("",true);
		PrintWriter impressaoarq = new PrintWriter(arq);
		impressaoarq.printf(toString());
		arq.close();
	}
	

}

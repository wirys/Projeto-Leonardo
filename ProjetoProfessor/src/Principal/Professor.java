package Principal;

import java.util.ArrayList;

public class Professor extends Funcionario {
	public Professor(String nome, String sobrenome, int idade, float salario, int siap, String coordenadoria, String pit) {
		super(nome, sobrenome, idade, salario, siap, coordenadoria);
	this.pit= pit;
	this.turmas = new ArrayList();
	}
	private String pit;
	ArrayList <Turma> turmas = new ArrayList();
	
	public String getPit() {
		return pit;
	}
	public void setPit(String pit) {
		this.pit = pit;
	}
	public String getTurma() {
		String retornoTurma = "";
		for(int i = 0; i < this.turmas.size();i++){
			retornoTurma += this.turmas.get(i);
		}
		return retornoTurma;
	}
	public void addTurma(Turma turmas) {
		this.turmas.add(turmas);
	}
	@Override
	public String toString() {
		return "Professor [pit=" + pit + ", turmas=" + turmas + ", getSiap()=" + getSiap() + ", getCoordenadoria()="
				+ getCoordenadoria() + ", getNome()=" + getNome() + ", getSobrenome()=" + getSobrenome()
				+ ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario() + "]";
	}
	
	
	

}

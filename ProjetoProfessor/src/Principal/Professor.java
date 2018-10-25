package Principal;

public class Professor extends Funcionario {
	public Professor(String nome, String sobrenome, int idade, float salario,
			int siap, String coordenadoria, String pit, Turma turma) {
		super(nome, sobrenome, idade, salario, siap, coordenadoria);
		this.pit = pit;
		this.turma = turma;
	}

	private String pit;
	private Turma turma;

	public String getPit() {
		return pit;
	}

	public void setPit(String pit) {
		this.pit = pit;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "\n-------------- DADOS DO PROFESSOR------------"+
				"\n Pit:" + getPit() +
				"\n Nome: " + getNome() +
				"\n Sobrenome: " + getSobrenome() +
				"\n Idade: " + getIdade() +
				"\n Siap: " + getSiap() +
				"\n Turma: [ \n" +
				this.turma.toString() + 
				"\n]" +
				"\n Coordenadoria: " + getCoordenadoria() +
				"\n Salario: R$" +  getSalario()+
		        "\n"
		        + "\n----------------------------------------------";

}
}

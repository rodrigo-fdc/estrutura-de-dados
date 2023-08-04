package entities;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalAlunos = 0;

	private void garantaEspaco() {
		if (this.totalAlunos == this.alunos.length) {
			Aluno[] novaArray = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				novaArray[i] = this.alunos[i];
			}
			this.alunos = novaArray;
		}
	}

	public void adiciona(Aluno aluno) {
		this.garantaEspaco();
		this.alunos[this.totalAlunos] = aluno;
		this.totalAlunos++;
		/*
		 * for (int i = 0; i < alunos.length; i++) { if (alunos[i] == null) {
		 * this.alunos[i] = aluno; break; } }
		 */
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalAlunos;
	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = this.totalAlunos - 1; i >= posicao; i--) {
			this.alunos[i + 1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalAlunos++;
	}

	public Aluno pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.alunos[posicao];
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalAlunos;
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalAlunos--;

	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
				return true;
			}
		}

		return false;
	}

	public int tamanho() {
		return this.totalAlunos;
	}

	@Override
	public String toString() {
		if (this.totalAlunos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();

		builder.append("[");
		for (int i = 0; i < this.totalAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		builder.append(this.alunos[this.totalAlunos - 1]);
		builder.append("]");

		return builder.toString();

	}

}

package entities;

public class Vetor {

	private Object[] objetos = new Object[100];
	private int totalObjetos = 0;

	private void garantaEspaco() {
		if (this.totalObjetos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novaArray[i] = this.objetos[i];
			}
			this.objetos = novaArray;
		}
	}

	public void adiciona(Object objeto) {
		this.garantaEspaco();
		this.objetos[this.totalObjetos] = objeto;
		this.totalObjetos++;
		/*
		 * for (int i = 0; i < alunos.length; i++) { if (alunos[i] == null) {
		 * this.alunos[i] = aluno; break; } }
		 */
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalObjetos;
	}

	public void adiciona(int posicao, Object objeto) {
		this.garantaEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = this.totalObjetos - 1; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}
		this.objetos[posicao] = objeto;
		this.totalObjetos++;
	}

	public Object pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.objetos[posicao];
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalObjetos;
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalObjetos--;

	}

	public boolean contem(Object objeto) {
		for (int i = 0; i < this.totalObjetos; i++) {
			if (objeto.equals(this.objetos[i])) {
				return true;
			}
		}

		return false;
	}

	public int tamanho() {
		return this.totalObjetos;
	}

	@Override
	public String toString() {
		if (this.totalObjetos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();

		builder.append("[");
		for (int i = 0; i < this.totalObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		builder.append(this.objetos[this.totalObjetos - 1]);
		builder.append("]");

		return builder.toString();

	}

}

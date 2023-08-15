package application;

public class GameEntry {
	protected String name; //Nome da pessoa que obteve o score
	protected int score; // valor do score
	
	/**
	 * Construtor que cria um registro do jogo
	 * */
	
	public GameEntry(String name, int score) {
		this.name = name;
		this.score = score;
	}
	/**
	 * Recupera o campo name
	 * */
	public String getName () {
		return name;
	}
	/**
	 * Recupera o campo score
	 * */
	public int getScore() {
		return score;
	}
	/**
	 * Retorna uma string com a representação deste registro
	 * */
	public String toString() {
		return "("
				+ name
				+ ", "
				+ score
				+ ")";
	}
}

package application;

public class Scores {

	public static final int maxEntries = 10; //Quantidade de scores que serão armazenados
	protected int numEntries; //numero real de registros
	protected GameEntry[] entries; // Arranjo de registros (nomes e scores)
	
	/**
	 * Construtor default
	 * */
	
	public Scores() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}
	/**
	 * Retorna uma representação string da lista de scores
	 * */
	
	public String toString() {
		String s = "[";
		for (int i = 0; i < numEntries; i++) {
			if (i>0) s += ", "; // Separa os registros por vírgula
			s += entries[i];
		}
		return s + "]";
	}
	
	// ... os métodos para atualizar o conjunto de scores vão aqui...
	
	/**
	 * Tenta inserir um novo score na coleção (se ele for grande o suficiente)
	 * */
	public void add(GameEntry e) {
		int newScore = e.getScore();
		//o novo registro "e" corresponde mesmo a um dos maiores scores?
		if (numEntries == maxEntries) { // o arranjo está cheio
			if (newScore <= entries[numEntries -1].getScore()) {
				return;
			} else { // o arranjo não está cheio
				numEntries++;
				// localiza o lugar onde o novo registro "e" (com score grande) deve ficar
				
				for  (int i = numEntries - 1; (i >= 1) && (newScore > entries[i-1].getScore()); i-- ) {
					entries[i] = entries[i-1]; // move a entrada "i" uma posição para a direita
					entries[i] = e; // acrescenta o novo score as entradas
				}
			}
		}
	}
	
	public void remove (int i) throws IndexOutOfBoundsException {
		
		if ((i < 0) || (i >= numEntries)) {
			throw new IndexOutOfBoundsException("Invalid index: " + i);
		}		
		for (int j = 1; j < numEntries - 1 ; j++) {
			entries[j] = entries[j+1];
			entries[numEntries -1] = null;
		}
		numEntries--;
	}
	
}

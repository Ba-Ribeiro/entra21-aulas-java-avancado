package br.com.entra21.java.avancada.Aula07;

	public class DataFuturaException extends Exception {

		public DataFuturaException() {
			super("N�o � permitido informar uma data futura");
		}

		public DataFuturaException(String mensagem) {
			super(mensagem);
		}
	}



public abstract class Relatorio {

	public void montaRelatorio() {
		montaCabecalho();
		montaCorpo();
		montaRodape();
	}

	public abstract void montaCabecalho();

	public abstract void montaCorpo();

	public abstract void montaRodape();
}
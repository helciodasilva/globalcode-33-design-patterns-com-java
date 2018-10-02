public class Aplicativo {

	private EnviarPorEmail comandoEnviar;
	private ExcluirPedido comandoExcluir;
	private GerarPDF comandoGerarPDF;
	private NovoPedido comandoNovo;

	public void buttonEnviar_clicked() {
		comandoEnviar.executar();
	}

	public void buttonGerarPDF_clicked() {
		comandoGerarPDF.executar();
	}

}
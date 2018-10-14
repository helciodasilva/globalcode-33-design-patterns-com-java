
public class DespachantePedido {
	public void despachar(Pedido pedido) {
		if (pedido instanceof PedidoSimplesRemessa) {
			pedido.setRemessa(new RemessaTransportadora());
		} else if (pedido instanceof PedidoPF) {
			pedido.setRemessa(new RemessaSedex());
		} else if (pedido instanceof PedidoExport) {
			pedido.setRemessa(new RemessaFedex());
		}
	}
}

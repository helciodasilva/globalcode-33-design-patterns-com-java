
public class PedidoExport extends Pedido {

	public void accept(PedidoVisitor visitor) {
		visitor.visit(this);
	}

}
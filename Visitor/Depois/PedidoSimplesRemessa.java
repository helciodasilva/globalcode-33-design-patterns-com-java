
public class PedidoSimplesRemessa extends Pedido {
	
	public void accept(PedidoVisitor visitor) {
		visitor.visit(this);
	}
	
}

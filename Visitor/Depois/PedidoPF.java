
public class PedidoPF extends Pedido {
	
	public void accept(PedidoVisitor visitor) {
		visitor.visit(this);
	}
	
}
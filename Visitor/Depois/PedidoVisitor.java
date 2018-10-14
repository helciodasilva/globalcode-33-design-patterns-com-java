
public interface PedidoVisitor {

	public void visit(PedidoPF pedido);

	public void visit(PedidoExport pedido);

	public void visit(PedidoSimplesRemessa pedido);

}
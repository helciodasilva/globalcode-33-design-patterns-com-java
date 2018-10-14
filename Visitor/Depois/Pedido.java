
public abstract class Pedido {

	private Remessa remessa;

	public Remessa getRemessa() {
		return remessa;
	}

	public void setRemessa(Remessa remessa) {
		this.remessa = remessa;
	}

	public abstract void accept(PedidoVisitor visitor);
	
}
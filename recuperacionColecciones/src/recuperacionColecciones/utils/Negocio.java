package recuperacionColecciones.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Negocio {
	
	//negocio lleva 3 colecciones que son catalogo, cliente, pedido
	
	private List<Catalogo> listaCatalogo= new ArrayList<Catalogo>();
	
	private List<Pedido> listaPedido= new ArrayList<Pedido>();
	
	private Set<Cliente> listaClientes= new HashSet<Cliente>();
	
	
	public Negocio() {
		super();
	}
	
	public boolean addCliente(Cliente nuevoCliente) {
		listaClientes.add(nuevoCliente);
		return false;
		
	}
	
	public boolean eliminarCliente(Cliente antiguoCliente) {
		listaClientes.remove(antiguoCliente);
		return false;
		
	}
	
	public String listarClientePorImporteVenta() {
		listaPedido.sort(new Comparator<Pedido>() {

			@Override
			public int compare(Pedido o1, Pedido o2) {
				// TODO Auto-generated method stub
				return o1.getCostePedido().compareTo(o2.getCostePedido());
			}
		});
		StringBuilder sb=new StringBuilder();
		for (Pedido i: listaPedido) {
			sb.append(i.getCostePedido());
			sb.append(i.getCliente());
		}
		
		return sb.toString();
		
	}
	
	public String listarClientePorEdad() {
		return null;
		
	}
	
	public String mostrarProductosPorClientes() {
		return null;
		
	}
	
	public String mostrarPedidosYLineasPorId() {
		return null;
		
	}
	
	public String mostrarPedidosYLineasPorPrecio() {
		return null;
		
	}
	
	

}

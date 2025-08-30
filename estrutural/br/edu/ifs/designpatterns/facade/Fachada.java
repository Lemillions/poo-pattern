package br.edu.ifs.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.facade.impl.Cliente;
import br.edu.ifs.designpatterns.facade.impl.GeradorID;
import br.edu.ifs.designpatterns.facade.impl.Pedido;
import br.edu.ifs.designpatterns.facade.impl.Produto;
import br.edu.ifs.designpatterns.facade.impl.Repositorio;

public class Fachada {
	
	private Repositorio<Cliente> repositorioClientes;
	private Repositorio<Produto> repositorioProdutos;
	private Repositorio<Pedido> repositorioPedidos;
	private List<PedidoCliente> pedidosClientes;
	
	public Fachada() {
		this.repositorioClientes = new Repositorio<>();
		this.repositorioProdutos = new Repositorio<>();
		this.repositorioPedidos = new Repositorio<>();
		this.pedidosClientes = new ArrayList<>();
	}
	
	public List<String> listarClientes() {
		return repositorioClientes.recuperar().stream()
				.map(Cliente::toString)
				.toList();
	}
	
	public List<String> listarProdutos() {
		return repositorioProdutos.recuperar().stream()
				.map(Produto::toString)
				.toList();
	}
	
	public List<String> listarPedidos(String idCliente) {
		List<String> pedidosDoCliente = new ArrayList<>();
		
		for (PedidoCliente pc : pedidosClientes) {
			if (pc.idCliente.equals(idCliente)) {
				Pedido pedido = repositorioPedidos.recuperar(pc.idPedido);
				if (pedido != null) {
					pedidosDoCliente.add(pc.idPedido + ": " + pedido.toString());
				}
			}
		}
		
		return pedidosDoCliente;
	}
	
	public String registrarCliente(String nome) {
		String id = "Cli" + GeradorID.gerarClienteID();
		Cliente cliente = new Cliente(id, nome);
		repositorioClientes.criar(id, cliente);
		return id;
	}
	
	public String registrarProduto(String nome, double preco) {
		String id = "Pro" + GeradorID.gerarProdutoID();
		Produto produto = new Produto(id, nome, preco);
		repositorioProdutos.criar(id, produto);
		return id;
	}
	
	public void escolherProduto(String idCliente, String idProduto) {
		Cliente cliente = repositorioClientes.recuperar(idCliente);
		Produto produto = repositorioProdutos.recuperar(idProduto);
		
		if (cliente != null && produto != null) {
			cliente.getPedido().adicionar(produto);
		}
	}
	
	public double obterTotal(String idCliente) {
		Cliente cliente = repositorioClientes.recuperar(idCliente);
		if (cliente != null) {
			return cliente.getPedido().valorTotal();
		}
		return 0.0;
	}
	
	public String fecharCompra(String idCliente) {
		Cliente cliente = repositorioClientes.recuperar(idCliente);
		if (cliente != null) {
			String idPedido = "Ped" + GeradorID.gerarPedidoID();
			Pedido pedido = cliente.getPedido();
			pedido.setId(idPedido);
			
			repositorioPedidos.criar(idPedido, pedido);
			
			pedidosClientes.add(new PedidoCliente(idCliente, idPedido));
			
			cliente.setPedido(new Pedido());
			
			return idPedido;
		}
		return null;
	}
	
	private static class PedidoCliente {
		String idCliente;
		String idPedido;
		
		PedidoCliente(String idCliente, String idPedido) {
			this.idCliente = idCliente;
			this.idPedido = idPedido;
		}
	}
}
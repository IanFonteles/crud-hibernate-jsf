/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.bean;

import br.com.empresa.dao.ClienteDAO;
import br.com.empresa.entidade.Cliente;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ian_l
 */
@ManagedBean(name = "clienteBean")
@ViewScoped
public class ClienteMB {

	private Cliente cliente;
	private List<Cliente> lista;
	private ClienteDAO dao;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getLista() {
		return lista;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}

	@PostConstruct
	public void inicializarTela() {
		dao = new ClienteDAO();

		lista = dao.listar();

		limpar();

	}

	public void limpar(){
        cliente = new Cliente();
        
    }

	public void salvar() {
		dao = new ClienteDAO();
		dao.salvar(cliente);
                
                if(cliente.getIdClient()==null){
                    dao.salvar(cliente);
                }else{
                    dao.alterar(cliente);
                }

		inicializarTela();

	}
        
        public void deletar(Cliente item){
            dao.deletar(item.getIdClient());
            
            inicializarTela();
        }
        
        public void carregarCliente(Cliente item){
            cliente=item;
        }

}

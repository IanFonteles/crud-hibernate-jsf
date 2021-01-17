/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.bean;

import br.com.empresa.dao.ClienteDAO;
import br.com.empresa.entidade.TbCliente;
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

	private TbCliente cliente;
	private List<TbCliente> lista;
	private ClienteDAO dao;

	public TbCliente getCliente() {
		return cliente;
	}

	public void setCliente(TbCliente cliente) {
		this.cliente = cliente;
	}

	public List<TbCliente> getLista() {
		return lista;
	}

	public void setLista(List<TbCliente> lista) {
		this.lista = lista;
	}

	@PostConstruct
	public void inicializarTela() {
		dao = new ClienteDAO();

		lista = dao.listar();

		limpar();

	}

	public void limpar(){
        cliente = new TbCliente();
        
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
        
        public void deletar(TbCliente item){
            dao.deletar(item.getIdClient());
            
            inicializarTela();
        }
        
        public void carregarCliente(TbCliente item){
            cliente=item;
        }

}

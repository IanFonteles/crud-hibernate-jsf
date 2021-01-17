/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.dao;

import br.com.empresa.entidade.Cliente;
import br.com.empresa.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ian_l
 */
public class ClienteDAO {

	public void salvar(Cliente cliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.persist(cliente);
		sessao.getTransaction().commit();
		sessao.close();

	}

	public List<Cliente> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<Cliente> lista = sessao.getNamedQuery("TbCliente.findAll").list();
		sessao.close();

		return lista;
	}

	public void alterar(Cliente cliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();

		sessao.merge(cliente);

		sessao.getTransaction().commit();
		sessao.close();

	}

	public void deletar(Integer id) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();

		sessao.delete(sessao.get(Cliente.class,id));

		sessao.getTransaction().commit();
		sessao.close();

	}
	
	public Cliente pesquisarPorId(Long id) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		Cliente cliente = (Cliente) sessao.merge(sessao.get(Cliente.class,id));
		sessao.getTransaction().commit();
		sessao.close();

		return cliente;
	}

}

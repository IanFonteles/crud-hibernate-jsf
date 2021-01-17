/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.dao;

import br.com.empresa.entidade.TbCliente;
import br.com.empresa.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ian_l
 */
public class ClienteDAO {

	public void salvar(TbCliente cliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		sessao.persist(cliente);
		sessao.getTransaction().commit();
		sessao.close();

	}

	public List<TbCliente> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		List<TbCliente> lista = sessao.getNamedQuery("tb_cliente.findAll").list();
		sessao.close();

		return lista;
	}

	public void alterar(TbCliente cliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();

		sessao.merge(cliente);

		sessao.getTransaction().commit();
		sessao.close();

	}

	public void deletar(Integer id) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();

		sessao.delete(sessao.get(TbCliente.class,id));

		sessao.getTransaction().commit();
		sessao.close();

	}
	
	public TbCliente pesquisarPorId(Long id) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		
		TbCliente cliente = (TbCliente) sessao.merge(sessao.get(TbCliente.class,id));
		sessao.getTransaction().commit();
		sessao.close();

		return cliente;
	}

}

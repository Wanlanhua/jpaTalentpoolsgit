package com.talentpool.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.talentpool.po.Logininfo;

@Repository
public class loginDao {
	@PersistenceContext
	private EntityManager em;
	
	public List<Logininfo> findByUsernameAndpassword(String username,String password)
	{
		String sql="from Logininfo l where l.username=? and l.password=?";
		Query query=em.createQuery(sql).setParameter(1, username).setParameter(2, password);
		List<Logininfo> l= (List<Logininfo>) query.getResultList();
		System.out.println(l);
		return l;
	}
	
	
	public List<Logininfo> findByUsername(String username)
	{
		String sql="from Logininfo l where l.username=?";
		Query query=em.createQuery(sql).setParameter(1, username);
		List<Logininfo> l= (List<Logininfo>)  query.getResultList();
		return l;
	}
}

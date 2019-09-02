package com.talentpool.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class userinfoDao {
	@PersistenceContext
	private EntityManager em;
}

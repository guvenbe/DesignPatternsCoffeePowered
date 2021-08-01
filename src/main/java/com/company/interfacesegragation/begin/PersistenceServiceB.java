package com.company.interfacesegragation.begin;

import java.util.List;


//common interface to be implemented by all persistence services.
public interface PersistenceServiceB<T extends EntityB> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	public List<T> findByName(String name);
}

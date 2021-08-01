package com.company.interfacesegragation.end;

//common interface to be implemented by all persistence services.
public interface PersistenceServiceE<T extends EntityE> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

}

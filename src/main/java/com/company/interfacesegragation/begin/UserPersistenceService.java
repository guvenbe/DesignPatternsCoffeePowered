package com.company.interfacesegragation.begin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//Stores User entities
public class UserPersistenceService implements PersistenceServiceB<UserB> {
	
	private static final Map<Long, UserB> USERS = new HashMap<>();
	
	@Override
	public void save(UserB entity) {
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(UserB entity) {
		synchronized (USERS) {
			USERS.remove(entity.getId());
		}
	}

	@Override
	public UserB findById(Long id) {
		synchronized (USERS) {
			return USERS.get(id);
		}
	}
	
	@Override
	public List<UserB> findByName(String name) {
		synchronized (USERS) {
			return USERS.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		}
	}

}

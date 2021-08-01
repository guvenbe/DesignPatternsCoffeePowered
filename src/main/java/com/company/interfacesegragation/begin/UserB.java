package com.company.interfacesegragation.begin;

import java.time.LocalDateTime;

public class UserB extends EntityB {
	
	private String name;
	
	private LocalDateTime lastLogin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	
}

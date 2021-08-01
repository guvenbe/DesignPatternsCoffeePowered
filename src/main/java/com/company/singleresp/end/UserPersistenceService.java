package com.company.singleresp.end;

public class UserPersistenceService {
    private Store store = new Store();

    public void saveUser(UserE user) {
        store.store(user);
    }
}

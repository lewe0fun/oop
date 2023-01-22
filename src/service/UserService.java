package service;

import data.User;

public interface UserService<U extends User> {

    public U save(U entity);

    public U findByLastName(String LastName);

    public U findById(int id);

    public void remove(U entity);
}

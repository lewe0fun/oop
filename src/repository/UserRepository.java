package repository;

import data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByLastName(String lastName);
    void deleteUserByName(String firstName);
    void createUserByName(String firstName);
    void deleteUserByYearAndGroupNumber(int yearOfBirth,int groupNumber);
}

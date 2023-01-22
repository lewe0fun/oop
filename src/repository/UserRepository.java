package repository;

import data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByLastName(String lastName);
    E deleteUserByName(String firstName);
    E createUserByName(String firstName);
    void deleteUserByYearAndGroupNumber(int yearOfBirth,int groupNumber);
}

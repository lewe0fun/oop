package repository;

public interface Repository<E, I> {
    E save(E entity);

    void delete(E entity);

    E findById(I id);
}

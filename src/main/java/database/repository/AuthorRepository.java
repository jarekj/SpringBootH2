package database.repository;

import database.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AuthorRepository extends CrudRepository<Author, Long > {

    Set<Author> findAllBy();

    void deleteById(Author author);


}

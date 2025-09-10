package ru.redtoss.library.LibrarySpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.redtoss.library.LibrarySpringBoot.models.Book;
import ru.redtoss.library.LibrarySpringBoot.models.Person;


import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {

    @Query("SELECT b.owner FROM Book b WHERE b.book_id = :bookId")
    Optional<Person> findOwnerById(@Param("bookId") int bookId);

}

package ua.pp.darknsoft.jdbc;

import ua.pp.darknsoft.entity.Author;

import java.util.List;

public interface SelectAuthors {

  Author getAuthorById(int authorId);

  List<Author> getAuthorsByFirstName(String firstName);

  List<Author> getAuthorByLastName(String lastName);

}

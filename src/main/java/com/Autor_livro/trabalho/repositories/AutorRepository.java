package com.Autor_livro.trabalho.repositories;

import org.springframework.stereotype.Repository;

import com.Autor_livro.trabalho.entities.Autor;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

}

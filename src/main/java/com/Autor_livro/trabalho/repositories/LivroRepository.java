package com.Autor_livro.trabalho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Autor_livro.trabalho.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}

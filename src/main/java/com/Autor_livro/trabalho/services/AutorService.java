package com.Autor_livro.trabalho.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Autor_livro.trabalho.entities.Autor;
import com.Autor_livro.trabalho.repositories.AutorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	
	public List<Autor> getAll(){
		return autorRepository.findAll();
	}
	
	public void saveAutor (Autor autor) {
		autorRepository.save(autor);
	}
	

}

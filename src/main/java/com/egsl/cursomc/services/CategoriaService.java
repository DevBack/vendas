/**
 * 
 */
package com.egsl.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egsl.cursomc.domain.Categoria;
import com.egsl.cursomc.repositories.CategoriaRepository;

/**
 * @author egslima
 *
 */

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) {
		
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.orElse(null);
	}
	
}

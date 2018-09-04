/**
 * 
 */
package com.egsl.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egsl.cursomc.domain.Categoria;

/**
 * @author egslima
 *
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}

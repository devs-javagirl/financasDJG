package com.djg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djg.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

}

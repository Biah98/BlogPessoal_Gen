package org.com.generation.BlogPessoal.BlogPessoal.Repository;

import java.util.Optional;

import org.com.generation.BlogPessoal.BlogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
	

}

package org.com.generation.BlogPessoal.BlogPessoal.Repository;

import java.util.List;

import org.com.generation.BlogPessoal.BlogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}


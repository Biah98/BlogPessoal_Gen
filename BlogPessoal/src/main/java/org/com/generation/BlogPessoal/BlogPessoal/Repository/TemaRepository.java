package org.com.generation.BlogPessoal.BlogPessoal.Repository;

import java.util.List;

import org.com.generation.BlogPessoal.BlogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository  extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}

package com.projeto.integrado.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
	List<Projeto> findByProjetoDescricaoContaining(String projetoDescricao);
}
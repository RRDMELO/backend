package com.projeto.integrado.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.StatusTarefa;
import com.projeto.integrado.entity.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
	List<Tarefa> findByStatusTarefa(StatusTarefa statusTarefa);
}
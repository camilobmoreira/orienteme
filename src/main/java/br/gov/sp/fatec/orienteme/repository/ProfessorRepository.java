package br.gov.sp.fatec.orienteme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.orienteme.model.Aluno;
import br.gov.sp.fatec.orienteme.model.Professor;

public interface ProfessorRepository extends PessoRepository<Professor> {
	
	List<Professor> findAll();
	
	List<Professor> findByName(String name);
	
	List<Aluno> findAlunosByEmail(String emailProfessor); 
	
	Optional<Professor> findByEmail(String email);
	
	Boolean existsByEmail(String email);
}


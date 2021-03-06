package br.gov.sp.fatec.orienteme.repository;

import br.gov.sp.fatec.orienteme.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findAll();
}

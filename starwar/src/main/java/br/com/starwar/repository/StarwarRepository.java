package br.com.starwar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.starwar.model.Planet;

@Repository
public interface StarwarRepository extends JpaRepository<Planet, Long>{
	
	List<Planet> findByNameIgnoreCaseContaining(String name);
}

package com.smarttoy.SmartToyWeb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {
	
}

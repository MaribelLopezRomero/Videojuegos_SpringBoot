
package com.app.videojuegos.repository;

import com.app.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
}

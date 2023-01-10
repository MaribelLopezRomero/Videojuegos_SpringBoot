
package com.app.videojuegos.repository;

import com.app.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
    //Creamos un metodo que se encarga de hacer la busqueda y devuelve una lista de nuestra consulta personalizada
    //Creamos la query para resolver ese metodo.
    
    @Query("select v from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
    
    
    //Metodo para filtrar los videojuegos por distribuidor
    
    @Query("select v from Videojuego v where v.distribuidor.id = ?1")
    List<Videojuego> buscarPorDistribuidor( int distribuidorId);
    
}

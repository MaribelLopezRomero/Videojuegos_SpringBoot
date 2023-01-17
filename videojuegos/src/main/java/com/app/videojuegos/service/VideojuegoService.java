package com.app.videojuegos.service;

import com.app.videojuegos.domain.Videojuego;
import com.app.videojuegos.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

//CLASE DE NEGOCIO
@Service
public class VideojuegoService {
    
    //inyeccion de dependecias de repository
    
    private final VideojuegoRepository videojuegorepository;

    public VideojuegoService(VideojuegoRepository videojuegorepository) {
        this.videojuegorepository = videojuegorepository;
    }
    
    //Ahora ya podemos usar los metodos de la interfaz de jparepository que conecta directamente con la bbdd
    public List<Videojuego> buscarDestacados() {

       // return videojuegorepository.findAll;
       return videojuegorepository.buscarTodos();
    }
    
    public List <Videojuego> buscarPorDistribuidor(int distribuidorId){
    
        return videojuegorepository.buscarPorDistribuidor(distribuidorId);
    
    }
    
    public List <Videojuego> buscar (String consulta){
        
        return videojuegorepository.findByNombreContaining(consulta);
    
    }
    
      public Videojuego guardar (Videojuego videojuego){
        
        return videojuegorepository.save(videojuego);
    
    }

}



package com.app.videojuegos.service;

import com.app.videojuegos.domain.Distribuidor;
import com.app.videojuegos.repository.DistribuidorRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DistribuidorService {
    
    //Inyeccion de dependencias
    
    private final DistribuidorRepository distribuidorRepository ;

    public DistribuidorService(DistribuidorRepository  distribuidorRepository ) {
        this.distribuidorRepository  = distribuidorRepository ;
    }
    
    //Usamos los metodos del repository de Distribuidor
    
    public List <Distribuidor> buscarTodos(){
        
        List distribuidores = distribuidorRepository.findAll();
        
        System.out.println(distribuidores);
        
        return distribuidores;

    }
    
    
    
}

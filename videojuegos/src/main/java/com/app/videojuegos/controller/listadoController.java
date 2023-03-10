package com.app.videojuegos.controller;

import com.app.videojuegos.domain.Videojuego;
import com.app.videojuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //atiende peticiones del navegador
public class listadoController {

    //Atributo final de tipo service
    private final VideojuegoService videojuegoService;

    //constroucto para el atributo final 
    public listadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    //Cada metodo con requestMapping atiene a una URL distinta. El metodo se ejecuta y luego retorna un string con el nombre del template que mostrara un HTML    
    @RequestMapping("/")
    public String listarVideojuegos(Model model) {
        
         //Busqueda de videojuegos, y luego los mandaremos al HTML de listado

        //creamos una lista de destacados, que hemos buscado con el service.
        List<Videojuego> destacados = videojuegoService.buscarDestacados();

        //Añadimos un atributo y el objeto al modelo
        model.addAttribute("videojuego", destacados);
        
       
        return "listado";
    }
    
    @RequestMapping("/VideojuegosPorDistribuidor")
    
    //pasamos por parametro, los parametros de la URL (se tiene que llamar igual)
    
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model){
        
        //creamos la lista de vj por distribuidor que hemos buscado con service
        List <Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId); //es el parametro de la url

        model.addAttribute("videojuego", juegos);
        
        return "listado";
                
               
      
    }
    
    @RequestMapping("/buscar")
    //podemos personalizar los parametros con @Requestparam
    
    public String buscar (@RequestParam("q") String Consulta, Model model){
        
        //creamos la lista de vj por busqueda que hemos filtrado con service
        List <Videojuego> busqueda = videojuegoService.buscar(Consulta); //valor del parametro de la URL
        
        model.addAttribute("videojuego", busqueda);
        
        return "listado";
    
    }

}

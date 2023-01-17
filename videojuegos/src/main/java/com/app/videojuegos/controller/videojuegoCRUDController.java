package com.app.videojuegos.controller;

import com.app.videojuegos.domain.Videojuego;
import com.app.videojuegos.service.DistribuidorService;
import com.app.videojuegos.service.VideojuegoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class videojuegoCRUDController {

    //Atributo final de tipo service
    private final DistribuidorService distribuidorService;

    public videojuegoCRUDController(DistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormulario(Model model) {

        //Pasar a tymeleaf la lista de distribuidores
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        
        //Pasar un objeto al modelo para que al hacer el submit se cargen los values del form en los atributos del objeto videojuego que le pasaremos.
        
        model.addAttribute("objetoVideojuego", new Videojuego()); //En este caso vacio

        return "crearVideojuego";
    }

    //Post para guardar un videojuego introducido en el formulario
    
    @PostMapping("/videojuegos/guardar")
    public String guardarVideojuego(Videojuego videojuego) {

        //Al hacer el submit el fomulario mandara un objeto de videojuego donde los valores de los atributos seran los introducidos en los input (value)
        System.out.println(videojuego);

        return "redirect:/"; //Nos redirige al hacer el submit a la url aqui indicada
    }

}

package com.app.videojuegos.service;

import com.app.videojuegos.domain.Videojuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

//CLASE DE NEGOCIO
@Service
public class VideojuegoService {

    //Simulamos que conectamos con la BBDD y nos devuelve una lista de videojuegos
    public List<Videojuego> buscarDestacados() {

        List<Videojuego> destacados = new ArrayList<>();

        //Creamos los objetos videojuegos y los añadimos a la lista
        Videojuego juego = new Videojuego();
        juego.setNombre("BorderLand3");
        juego.setImagenUrl("https://cdn.gbposters.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/f/p/fp4825-borderlands-3-cover.jpg");
        
        juego.setDescripcion("¡Vuelve el padre de los shooter-looter, con tropecientas mil armas y una aventura caótica!");

        destacados.add(juego);

        return destacados;
    }

}

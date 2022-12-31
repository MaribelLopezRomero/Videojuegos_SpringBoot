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
        

        juego = new Videojuego();

        juego.setNombre("Control");
        juego.setImagenUrl("https://media.playstation.com/is/image/SCEA/control-poster-01-ps4-us-11sep19?$native_nt$");
        juego.setDescripcion("Tras la invasión de una agencia secreta de Nueva York por parte de una amenaza de otro mundo, te conviertes en la nueva directora que deberá luchar para recuperar Control.");

        destacados.add(juego);

        juego = new Videojuego();

        juego.setNombre("Subnautica");
        juego.setImagenUrl("https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/999/EP5426-CUSA13893_00-2222444466669999/1568624921000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000");
        juego.setDescripcion("Un juego de aventuras submarinas ambientado en un mundo oceánico alienígena. ¡Te espera un mundo abierto enorme lleno de maravillas y peligros!");

        destacados.add(juego);

        juego = new Videojuego();

        juego.setNombre("Firewatch");
        juego.setImagenUrl("https://www.mobygames.com/images/covers/l/323028-firewatch-playstation-4-front-cover.jpg");
        juego.setDescripcion("Firewatch es un juego de misterio en primera persona para un jugador que se desarrolla en la selva de Wyoming");

        destacados.add(juego);

        return destacados;
    }

}

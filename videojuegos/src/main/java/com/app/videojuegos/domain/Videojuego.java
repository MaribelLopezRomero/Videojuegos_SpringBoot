
package com.app.videojuegos.domain;

/**
 *
 * @author maribel
 */

//Clase de DOMINIO
public class Videojuego {
    
    private String nombre;
    private String descripcion;
    private String imagenUrl;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
    
    
    
}

package com.tesji.proyectoapi.controller;

import com.tesji.proyectoapi.model.DatosBiblioApi;
import com.tesji.proyectoapi.service.BiblioApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

//esta clase controlador va a permitir gestionar
//las peticiones http (get, post, put, delete) y
//exponer o deployar la API
@RestController//Exponer la clase como una API REST
@RequestMapping("/biblioapi") //Define la URL de la API
public class ApiBiblioteca {
    //inyectar objeto de servicio para utilizar las operaciones CRUD
    @Autowired
    BiblioApiService biblioApiService;

    @GetMapping("/get-prueba") //Define el metodo como una peticion get y su acceso
    public String pruebaApi(){
        return "Funciona!! Hola mundo, mi primera API";
    }

    @GetMapping("/ver-todos-libros")
    public ArrayList<DatosBiblioApi>getVerTodosLibros(){
        return biblioApiService.mostrarTodosLibros();

    }

    @GetMapping("/ver-libro/{idLibro}")
    public Optional getVerLibro(@PathVariable("idLibro") Long id){
        return biblioApiService.mostrarLibroPorID(id);

    }
    @PostMapping("/guardar-libro")
    public DatosBiblioApi postGuardarLibro(@RequestBody DatosBiblioApi libro){
        return biblioApiService.registrarLibro(libro);
    }
    @DeleteMapping("/eliminar-libro/{idLibro}")
    public boolean deleteBorraLibro(@PathVariable("idLibro") long id) {
        return biblioApiService.eliminarLibro(id);
    }


}

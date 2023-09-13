package com.rhabad.ejemploAPI.controllers;

import com.rhabad.ejemploAPI.models.MisLenguajes;
import com.rhabad.ejemploAPI.services.MisLenguajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {


    private MisLenguajesService misLenguajesService;

    @Autowired
    public Controller(MisLenguajesService misLenguajesService){
        this.misLenguajesService = misLenguajesService;
    }


    @GetMapping("/hola")
    public String holaMund(){
        return "Hola mundo";
    }

    @GetMapping("/misLenguajes")
    public List<MisLenguajes> mostrarLenguajes(){
        return misLenguajesService.mostrarLenguajes();
    }


    @PostMapping("/misLenguajes")
    public void guardarLenguaje(@RequestBody MisLenguajes misLenguajes){
        misLenguajesService.guardarLenguajes(misLenguajes);
    }

    @DeleteMapping("misLenguajes/{id}")
    public void eliminarLenguaje(@PathVariable Long id){
        misLenguajesService.eliminarLenguaje(id);
    }

    @PutMapping("/actualizar/{id}")
    public MisLenguajes actualizarLenguaje(@RequestBody MisLenguajes misLenguajes, @PathVariable Long id){
        //adquirimos el registro por el id, luego lo guardamos
        MisLenguajes lenguActu = misLenguajesService.actualizarLenguaje(id);

        lenguActu.setNombre(misLenguajes.getNombre());
        lenguActu.setLanzamiento(misLenguajes.getLanzamiento());
        lenguActu.setTipado_fuerte(misLenguajes.isTipado_fuerte());
        return misLenguajesService.guardarLenguajes(lenguActu);

    }
}

package com.rhabad.ejemploAPI.services;

import com.rhabad.ejemploAPI.models.MisLenguajes;
import com.rhabad.ejemploAPI.repositories.MisLenguajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MisLenguajesService {


    private MisLenguajesRepository misLenguajesRepository;

    @Autowired
    public MisLenguajesService(MisLenguajesRepository misLenguajesRepository){
        this.misLenguajesRepository = misLenguajesRepository;
    }



    //mostramos los registros de la base de datos
    public List<MisLenguajes> mostrarLenguajes(){
        return (List<MisLenguajes>) misLenguajesRepository.findAll();
    }

    //agregamos un nuevo registro
    public MisLenguajes guardarLenguajes(MisLenguajes misLenguajes){
        misLenguajesRepository.save(misLenguajes);
        return misLenguajes;
    }

    //eliminar un registro
    public void eliminarLenguaje(Long id){
        misLenguajesRepository.deleteById(id);
    }


    //actualizar un registro, para ello obtener un registro por el id
    public MisLenguajes actualizarLenguaje(Long id){
        return misLenguajesRepository.findById(id).get();
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Educacion;
import com.myFirstApp.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Federico
 */
@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository repository;
    
    @Override
    public List<Educacion> obtenerEducacion() {
        return repository.findAll();
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        repository.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Educacion obtenerEducacion(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion educacion) {
        repository.save(educacion);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Educacion;
import java.util.List;

/**
 *
 * @author Federico
 */
public interface IEducacionService {
    public List<Educacion> obtenerEducacion();
    public void crearEducacion(Educacion educacion);
    public void borrarEducacion(Long id);
    public Educacion obtenerEducacion(Long id);
    public void modificarEducacion(Educacion educacion);
}

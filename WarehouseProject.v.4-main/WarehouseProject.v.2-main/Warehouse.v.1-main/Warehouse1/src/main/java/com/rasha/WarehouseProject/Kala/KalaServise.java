/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rasha.WarehouseProject.Kala;

import com.rasha.WarehouseProject.Kala.Kala;

import java.util.List;

/**
 *
 * @author RASHA
 */
public interface KalaServise {
    List<Kala>getAllKala();
    Kala saveKala(Kala kala);
    Kala getKalaById(Long id);
    Kala updateKala(Kala kala);
    void deleteKalaById(Long id);
}

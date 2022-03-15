/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasha.WarehouseProject.Kala;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author RASHA
 */
@Service
public class KalaServiceImpl implements KalaServise {
   
KalaRepository kalaRepository;

    public KalaServiceImpl(KalaRepository kalaRepository) {
        this.kalaRepository = kalaRepository;
    }

    @Override
    public List<Kala> getAllKala() {
       return kalaRepository.findAll();
    }

    @Override
    public Kala saveKala(Kala kala) {
       return kalaRepository.save(kala);
    }

    @Override
    public Kala getKalaById(Long id) {
       return kalaRepository.findById(id).get();
    }

    @Override
    public Kala updateKala(Kala kala) {
       return kalaRepository.save(kala);
    }

    @Override
    public void deleteKalaById(Long id) {
        kalaRepository.deleteById(id);
    }
    
    
    
}

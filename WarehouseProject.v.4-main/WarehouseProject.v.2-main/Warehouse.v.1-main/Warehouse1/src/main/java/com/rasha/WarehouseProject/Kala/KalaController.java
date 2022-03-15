/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasha.WarehouseProject.Kala;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author RASHA
 */
@Controller
public class KalaController {
  private final KalaServise kalaServise;

    public KalaController(KalaServise kalaServise) {
        this.kalaServise = kalaServise;
    }
  
  @GetMapping("/kala")
    public String listkala(Model model){
     model.addAttribute("kala",kalaServise.getAllKala());
     return "kala/kala";
    }
    @GetMapping("/kala/new")
    public String createKalaForm(Model model){
        Kala kala=new Kala();
    model.addAttribute("kala",kala);
    return "kala/Import_kala";
        
    }
    @PostMapping("/kala")
    public String saveStudent(@ModelAttribute ("kala") Kala kala){
        
  kalaServise.saveKala(kala);
        
      return "redirect:/kala/kala";
    }
    @GetMapping("/kala/edit/{id}")
    public String editKalaForm(@PathVariable Long id ,Model model){
       model.addAttribute("kala", kalaServise.getKalaById(id));
       return "kala/edite_kala";
    }
    @PostMapping("/kala/{id}")
    public String updatekala(@PathVariable Long id,@ModelAttribute("kala")Kala kala,Model model){
       Kala existingKala=kalaServise.getKalaById(id);
        existingKala.setId(id);
      existingKala.setNameKala(kala.getNameKala());
       existingKala.setTadadKala(kala.getTadadKala());
      
       
       kalaServise.updateKala(existingKala);
       
        return "redirect:/kala/kala";
    }
    @GetMapping("/kala/{id}")
    public String deleteKala(@PathVariable long id){
        kalaServise.deleteKalaById(id);
        return "redirect:/kala/kala";
    }
}


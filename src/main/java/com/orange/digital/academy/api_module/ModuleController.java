package com.orange.digital.academy.api_module;

import java.util.List;

import com.orange.digital.academy.api_module.Domain.Module;
import com.orange.digital.academy.api_module.Domain.ModuleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/modules")
public class ModuleController {


  ModuleService moduleService;

  @Autowired
    ModuleRepository repository;
    public ModuleController(ModuleService moduleService){
      this.moduleService = moduleService; 
    }

  //methode GET pour afficher un module
  @GetMapping
  public List<Module> list() {
      return moduleService.listAllModule();
  }
      
  //methode POST pour créer un module
  @PostMapping("/create")
  public String createModule(@RequestBody Module module) {
       moduleService.saveModule(module);
       return "Module créer avec succès";
  }

  //methode PUT pour la mise a jour d'un module
  @PutMapping("/update/{id}")
  public ResponseEntity<?> upsaveModule(@PathVariable(value = "id") Integer id_module, @RequestBody Module module) throws Exception{
    if(id_module == null){
      throw new ModuleNotFoundException(id_module);
    }
    moduleService.upsaveModule(module, id_module);
    return new ResponseEntity<>(HttpStatus.OK);
  }
    
  //methode DELETE pour supprimer un module
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<?> deleteModule(@PathVariable(value = "id") Integer id_module) throws ModuleNotFoundException {

    if(id_module == null){
      throw new ModuleNotFoundException(id_module);
    }
    moduleService.deleteModule(id_module);
    return new ResponseEntity<>(HttpStatus.OK);

  }
  
}

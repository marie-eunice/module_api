package com.orange.digital.academy.api_module;

import java.util.List;

import com.orange.digital.academy.api_module.Domain.Module;
import com.orange.digital.academy.api_module.Domain.ModuleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
    
    private ModuleRepository moduleRepository;

    @Autowired
    public ModuleService(ModuleRepository moduleRepository){
        this.moduleRepository = moduleRepository;
    }

    public List<Module> listAllModule(){
        return moduleRepository.findAll();
    }
    public void saveModule(Module module){
        moduleRepository.save(module);
    }

    public void upsaveModule(Module module, Integer id)  {
        
            module.setNom(module.getNom());
            module.setStatut(module.getStatut());
            module.setId_projet(module.getId_projet());
            moduleRepository.save(module);
  
    }

    public void deleteModule(Integer id){
        moduleRepository.deleteById(id);
    }
   

}

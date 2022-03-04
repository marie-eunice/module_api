package com.orange.digital.academy.api_module;

public class ModuleNotFoundException extends Exception {

    public ModuleNotFoundException(Integer id_module){
        super(String.format("Le module est introuvale avec cet identifiant: '%d'", id_module));
    }
}

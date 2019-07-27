/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.UsuarioService;

/**
 *
 * @author apalmeras
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;
    
    @GetMapping(produces = "application/json")
	public void getAllUsers() {
		// This returns a JSON or XML with the users
                System.out.println("here");
	//	return service.listar();
	}
        
}

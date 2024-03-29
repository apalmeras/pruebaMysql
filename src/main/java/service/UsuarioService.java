/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.UsuarioEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

/**
 *
 * @author apalmeras
 */
@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;
    
    public List<UsuarioEntity> listar()
    {
        return this.repository.findAll();
    }
}

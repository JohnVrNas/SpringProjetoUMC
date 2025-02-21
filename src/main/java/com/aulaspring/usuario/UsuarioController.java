/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aulaspring.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alunocmc
 */

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/criar")
    public String retornomsg(){
        return "teste";
    }

    @PostMapping("/criar")
    public UsuarioModel create(@RequestBody UsuarioModel usuarioModel){
        var usuario = this.userRepository.save(usuarioModel);
        System.out.println("esta passando pelo metodo post");
        return usuario;
    }
}

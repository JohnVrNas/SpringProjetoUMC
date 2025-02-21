/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aulaspring.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.util.UUID;


/**
 *
 * @author alunocmc
 */

@Data
@Entity(name ="tb_usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(generator = "UUID")

    private UUID id;
    private String nome;
    private String email;
    private String telefone;
}

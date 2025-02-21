package com.aulaspring.usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.UUID;

@Data
@Entity(name="tb_usuario")

public class Usuario {
    @Id
    @GeneratedValue(generator="UUID")
    private UUID id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
}
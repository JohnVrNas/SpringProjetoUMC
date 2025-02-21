package com.aulaspring.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public interface IUserRepository extends JpaRepository<UsuarioModel, UUID>{

}

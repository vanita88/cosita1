/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seseprtf.sese.Security.Service;

import com.seseprtf.sese.Security.Entity.Rol;
import com.seseprtf.sese.Security.Enums.RolNombre;
import com.seseprtf.sese.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
  @Autowired  
  RolRepository RolRepository;
  
  public Optional<Rol> getByRolNombre(RolNombre rolNombre){
     return RolRepository.findByRolNombre(rolNombre);
  }
  
  public void save(Rol rol){
      RolRepository.save(rol);
  }
}

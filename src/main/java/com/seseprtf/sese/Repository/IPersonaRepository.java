package com.seseprtf.sese.Repository;

import com.seseprtf.sese.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long > {
    
}

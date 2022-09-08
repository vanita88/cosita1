package com.seseprtf.sese.Interface;

import com.seseprtf.sese.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    ///traer lista de persona
    public List<Persona> getPersona();
    
    /// guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    /// eliminar objeto tipo persona
    public void deletePersona(Long id);
    
    ///buscar obejto tipo persona por id
    public Persona findPersona(Long id);
}

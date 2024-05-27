package com.example.crud.service;

import com.example.crud.interfaceService.IpersonaService;
import com.example.crud.interfaces.IPersona;
import com.example.crud.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona iPersona;

    @Override
    public List<Persona> showAllPersona() {
        return (List<Persona>) iPersona.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return iPersona.findById((long) id);
    }

    @Override
    public int save(Persona persona) {
        int res=0;
        Persona persona1 = iPersona.save(persona);
        if(!persona1.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        iPersona.deleteById((long) id);
    }
}

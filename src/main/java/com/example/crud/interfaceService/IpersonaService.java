package com.example.crud.interfaceService;

import com.example.crud.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IpersonaService {
    public List<Persona> showAllPersona();
    public Optional<Persona> listarId(int id);
    public int save(Persona persona);
    public void delete(int id);
}

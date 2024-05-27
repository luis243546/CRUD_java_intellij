package com.example.crud.interfaces;

import com.example.crud.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersona extends CrudRepository<Persona, Long> {
}

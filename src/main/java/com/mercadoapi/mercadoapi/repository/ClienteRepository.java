package com.mercadoapi.mercadoapi.repository;

import com.mercadoapi.mercadoapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//o tipo da entidade que vai ser utilizada é a Cliente e o id é do tipo Long
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

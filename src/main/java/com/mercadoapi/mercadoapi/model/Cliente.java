package com.mercadoapi.mercadoapi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //com esse identity no caso o banco vai ser o responsavel por
    private long id;                                    //criar o id

    @Column(nullable = false)
    private String nome;

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

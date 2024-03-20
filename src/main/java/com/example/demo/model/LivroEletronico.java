package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class LivroEletronico extends Livro {
    private String formato;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}

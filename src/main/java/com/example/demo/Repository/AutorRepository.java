package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    void adicionarLivro(Long autorId, Long livroId);
    void removerLivro(Long autorId, Long livroId);
}


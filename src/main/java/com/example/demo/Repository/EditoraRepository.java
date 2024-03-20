package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {
    void adicionarLivro(Long editoraId, Long livroId);
    void removerLivro(Long editoraId, Long livroId);
}


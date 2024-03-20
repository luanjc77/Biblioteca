package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}


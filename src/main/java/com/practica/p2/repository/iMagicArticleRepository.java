package com.practica.p2.repository;

import com.practica.p2.domain.MagicArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface iMagicArticleRepository extends JpaRepository<MagicArticle, UUID> {
}

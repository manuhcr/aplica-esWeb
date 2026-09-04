package com.example.imagemPecas.infra.repository;

import com.example.imagemPecas.application.images.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageRepository extends JpaRepository<Image,String> {

}

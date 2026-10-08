package com.example.imagemPecas.infra.repository;

import com.example.imagemPecas.application.images.domain.entity.Image;
import com.example.imagemPecas.domain.enums.ImageExtension;
import com.example.imagemPecas.infra.repository.specs.GenericSpecs;
import com.example.imagemPecas.infra.repository.specs.ImageSpecs;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.example.imagemPecas.infra.repository.specs.ImageSpecs.nameLike;
import static com.example.imagemPecas.infra.repository.specs.ImageSpecs.tagsLike;
import static org.springframework.data.jpa.domain.Specification.anyOf;


public interface ImageRepository extends JpaRepository<Image,String> , JpaSpecificationExecutor<Image> {
    /**
     *
     *
     * @param extension
     * @param query
     * @return
     * SELECT * FROM IMAGE WHERE 1 = 1 AND EXTENSION 'PNG' AND (NAME LIKE 'QUERY' OR TAGS LIKE 'QUERY')
     */
        default List<Image> findByExtensionAndNameOrTagsLike(ImageExtension extension, String query){
            //SELECT FROM IMAGE WHERE 1 = 1
            Specification<Image> spec = Specification.where(GenericSpecs.conjunction());

            if (extension != null){
                //AND EXTENSION = 'PNG'
                spec = spec.and(ImageSpecs.extensionEqual(extension));
            }
            if(StringUtils.hasText(query)) {
                //AND (NAME LIKE 'QUERY' OR TAGS LIKE 'QUERY')
                spec = spec.and(anyOf(nameLike(query), tagsLike(query)));
            }
            return findAll(spec);
        }

}

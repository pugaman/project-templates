package com.template.dao.repository.template;

import com.template.dao.entity.template.TemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
public interface TemplateEntityRepository extends JpaRepository<TemplateEntity, Long> {
}

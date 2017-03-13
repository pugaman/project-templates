package com.template.dao.entity.template;

import javax.persistence.*;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
@Entity
@Table(name = "template_entity")
public class TemplateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

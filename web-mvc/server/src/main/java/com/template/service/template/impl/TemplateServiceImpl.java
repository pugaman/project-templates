package com.template.service.template.impl;

import com.template.dao.repository.template.TemplateEntityRepository;
import com.template.exception.TemplateException;
import com.template.service.template.ITemplateService;
import com.template.utility.template.TemplateDataProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
@Service
public class TemplateServiceImpl implements ITemplateService{

    public static final String VALUE = "Value";

    @Autowired
    TemplateEntityRepository templateEntityRepository;

    @Override
    public void getResponse() throws TemplateException {
        templateEntityRepository.count();
        TemplateDataProcessor.processString(VALUE);
    }

}

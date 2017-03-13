package com.template.api.rest;

import com.template.exception.TemplateException;
import com.template.service.template.ITemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
@Controller
@RequestMapping("/api/rest/v0")
public class TemplateController {

    @Autowired
    ITemplateService templateService;

    @RequestMapping(path = "/answer", method = RequestMethod.GET)
    public ResponseEntity getAnswer() throws TemplateException {
        templateService.getResponse();
        return ResponseEntity.ok(null);
    }

    @ExceptionHandler
    public ResponseEntity handleErrors(TemplateException e){
        try{
            if (e != null) {
                throw e;
            }
            return ResponseEntity.ok(null);
        } catch (TemplateException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

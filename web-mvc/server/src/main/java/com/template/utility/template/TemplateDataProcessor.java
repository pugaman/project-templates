package com.template.utility.template;

import com.template.dto.template.TemplateDTO;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
public class TemplateDataProcessor {

    public static TemplateDTO processString(String string){
        return new TemplateDTO(string);
    }

}

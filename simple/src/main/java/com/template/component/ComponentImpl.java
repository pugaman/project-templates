package com.template.component;

import javax.annotation.PostConstruct;

/**
 * Created by pgolovenkov on 10.03.2017.
 */
public class ComponentImpl implements IComponent {

    @PostConstruct
    private void init(){
        doAction();
    }

    @Override
    public void doAction() {
        System.out.println("Done!");
    }

}

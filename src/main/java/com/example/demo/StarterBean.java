package com.example.demo;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import java.util.logging.Logger;

@ApplicationScoped
public class StarterBean {

 Logger logger = Logger.getLogger(StarterBean.class.getName());

  public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        logger.severe("Setup ....");
  }

}
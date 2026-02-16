package org.java.ejbs;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

// Statless or Statefull or Sigleton
@Stateless
@LocalBean
public class HelloBean {

    public HelloBean() {
    }

    public String sayHello(String name) {
        return "Hello EJB " + name;
    }
}

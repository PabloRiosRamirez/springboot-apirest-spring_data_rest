/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com

    Debemos indicar como se inicia nuestra aplicación web, normalmente utilizamos 
    el archivo web.xml para esta tarea, Spring Boot nos facilita el trabajo con la 
    clase base SpringBootServletInitializer que extenderemos y sobre-escribiremos 
    el método configure(SpringApplicationBuilder app) aquí indicaremos cual es la 
    clase que configurar el Servlet de nuestra aplicación.
 
**/

package com.pabloriosramirez.springboot;

import com.pabloriosramirez.springboot.springdatarest.SpringDataRestApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class SpringBootWebInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringDataRestApplication.class);
    }
}

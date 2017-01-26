package com.tornado.ecommerce.spring.initializer;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.tornado.ecommerce.spring.configuration.AppConfig;
import com.tornado.ecommerce.spring.configuration.HibernateConfiguration;
import com.tornado.ecommerce.spring.configuration.SecurityConfiguration;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
       return new Class[] { AppConfig.class,SecurityConfiguration.class,HibernateConfiguration.class,SecurityWebApplicationInitializer.class };
   }
 
   @Override
   protected Class<?>[] getServletConfigClasses() {
       return null;
   }
 
   @Override
   protected String[] getServletMappings() {
       return new String[] { "/" };
   }
}

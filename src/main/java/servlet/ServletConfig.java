package servlet;

import java.util.HashMap;
import java.util.Map;

import resources.MessageResource;
import service.MessageService;
import serviceImpl.MessageServiceImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import dao.MessageDao;
import daoImpl.MessageDaoImpl;

public class ServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        
        return Guice.createInjector(new ServletModule() {
            
            @Override
            protected void configureServlets() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("com.sun.jersey.api.json.POJOMappingFeature","true");
                // Bindings
                bind(MessageResource.class);
                bind(MessageDao.class).to(MessageDaoImpl.class);
                bind(MessageService.class).to(MessageServiceImpl.class);
                
                serve("/*").with(GuiceContainer.class, params);
                filter("/*").through(PersistFilter.class);
            }
            
        },  new JpaPersistModule("baseJpaUnit"));
    }

}

package uet.homestay.webapp;

import org.springframework.web
        .servlet.support
        .AbstractAnnotationConfigDispatcherServletInitializer;
import uet.homestay.webapp.config.MVCConfig;

public class WebInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        // TODO Auto-generated method stub
        return new Class[] { MVCConfig.class };
    }

    @Override
    protected String[] getServletMappings()
    {
        // TODO Auto-generated method stub
        return new String[] { "/" };
    }
}
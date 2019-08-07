package br.com.consultemed.utils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.consultemed.dao.GenericDAO;

public class DaoFactory<T, G>{
	
	@Inject
    EntityManager em;  
	
	public DaoFactory() {
	}
  
    @SuppressWarnings({ "rawtypes", "unchecked" })  	
    @Produces  
    @Dependent
    public   <T extends Serializable> GenericDAO<T, G>   createDAO(InjectionPoint injectionPoint)  
            throws ClassNotFoundException {  
  
        ParameterizedType type = (ParameterizedType) injectionPoint.getType();  
        Class classe = (Class) type.getActualTypeArguments()[0];  
        return new GenericDAO(classe);  
    }  
}

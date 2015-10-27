package com.cloudplatform.core.service;

import com.cloudplatform.core.dao.GenericDAO;
import com.cloudplatform.core.model.BaseModel;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless(name = "GenericServiceImpl", mappedName = "GenericServiceImpl")
public class GenericServiceImpl<T extends BaseModel<?>, PK> implements GenericService<T, PK> {

    @EJB(beanName = "GenericDAOImpl")
    private GenericDAO<T, PK> genericDAO;

    @Override
    public GenericDAO<T, PK> getBaseDAO() {
        return genericDAO;
    }

    @Override
    public void create(T t) {
        getBaseDAO().create(t);
    }

    @Override
    public void update(T t) {
        getBaseDAO().update(t);
    }

    public void delete(T t) {
        getBaseDAO().delete(t);
    }

    @Override
    public void delete(Class<T> t, PK id) {
        getBaseDAO().delete(t, id);
    }

    @Override
    public T findById(Class<T> t, PK id) {
        return getBaseDAO().findById(t, id);
    }

    @Override
    public List<T> list(Class<T> t) {
        return getBaseDAO().list(t);
    }

    @Override
    public List<T> list(Class<T> t, Integer index, Integer numberOfRecords) {
        return getBaseDAO().list(t, index, numberOfRecords);
    }

    @Override
    public PK count(Class<T> t) {
        return getBaseDAO().count(t);
    }


}

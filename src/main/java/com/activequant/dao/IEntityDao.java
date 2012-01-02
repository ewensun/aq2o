package com.activequant.dao;

import com.activequant.domainmodel.PersistentEntity;

public interface IEntityDao<T extends PersistentEntity> {

    public T load(String primaryKey) throws DaoException;

    public T[] loadAll() throws DaoException;

    public String[] loadIDs() throws DaoException;

    public void create(T t) throws DaoException;

    public void delete(T t) throws DaoException;

    public void update(T t) throws DaoException;

    public String[] findIDs(String key, String sValue);

    public String[] findIDs(String key, Double dValue);

    public String[] findIDs(String key, Long lValue);

    public String[] findIDs(int startIndex, int endIndex);

    int count();

}
package io.divide.client.cache;

import io.divide.client.BackendObject;
import io.divide.shared.web.transitory.query.Query;

import java.util.Collection;
import java.util.List;

/**
 * Created by williamwebb on 11/2/13.
 */
public interface LocalStorage {

    public <B extends BackendObject> List<B> query(Class<B> type, Query query);
    public <B extends BackendObject> List<B> getAllByType(Class<B> type);
    public <B extends BackendObject> void save(Collection<B> objects);
    public <B extends BackendObject> boolean exists(Class<B> type,String objectKey);
    public <B extends BackendObject> long count(Class<B> type);
}

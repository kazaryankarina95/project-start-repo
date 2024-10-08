package org.example.reposervice.repo.requests;

    public interface CrudInterface {
        Object create(Object obj);

        Object get(String id);

        Object update(Object obj);

        Object delete(String id);
    }
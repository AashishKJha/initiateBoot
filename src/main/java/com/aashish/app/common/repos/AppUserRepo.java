package com.aashish.app.common.repos;


import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AppUserRepo<T> extends CrudRepository<T, Long> {

}


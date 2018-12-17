package com.aashish.app.common.repos;

import org.springframework.data.repository.CrudRepository;

public interface AppUserRepo<T> extends CrudRepository<T, Long> {

}


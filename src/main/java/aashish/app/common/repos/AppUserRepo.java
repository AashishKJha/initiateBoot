package aashish.app.common.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AppUserRepo<T> extends CrudRepository<T, Long> {

}


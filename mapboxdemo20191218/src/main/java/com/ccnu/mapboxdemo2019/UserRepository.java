package com.ccnu.mapboxdemo2019;

import com.ccnu.mapboxdemo2019.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
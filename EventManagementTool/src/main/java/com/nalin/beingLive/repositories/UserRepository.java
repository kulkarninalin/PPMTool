package com.nalin.beingLive.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nalin.beingLive.pojo.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	@Override
	Iterable<User> findAllById(Iterable<Long> ids) ;

}

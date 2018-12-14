package com.nanuworkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nanuworkshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

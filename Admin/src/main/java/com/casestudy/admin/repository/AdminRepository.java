package com.casestudy.admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.admin.model.AdminModel;
@Repository
public interface AdminRepository extends MongoRepository<AdminModel,String>{

}

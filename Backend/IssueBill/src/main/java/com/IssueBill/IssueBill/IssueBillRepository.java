package com.IssueBill.IssueBill;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface IssueBillRepository extends MongoRepository<IssueBillDetails, Long>{

}

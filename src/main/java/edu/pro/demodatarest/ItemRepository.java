package edu.pro.demodatarest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/*
  @author   george
  @project   demo-data-rest
  @class  ItemRepository
  @version  1.0.0 
  @since 15.01.24 - 14.31
*/
@Repository
@RepositoryRestResource(collectionResourceRel = "items", path = "items")
public interface ItemRepository extends MongoRepository<Item, String> {
}

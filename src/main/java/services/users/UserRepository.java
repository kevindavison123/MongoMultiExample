package services.users;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by kevin on 6/27/17.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

package services.orgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kevin on 6/4/17.
 */
@Repository
public interface OrganizationRepository extends MongoRepository<Organization, String> {

    public Organization findByName(String name);
    public Organization findByWebsite(String website);
    public Organization findByTags(List<String> tags);

}

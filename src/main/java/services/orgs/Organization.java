package services.orgs;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kevin on 5/20/17.
 */
@Document(collection = "organizations")
public class Organization implements Serializable {


    @Id
    private String id;

    private String name;
    private String description;
    private String website;
    private List<String> tags;

    public Organization(){}

    public Organization(String name, String description, String website, List<String> tags) {
        this.name = name;
        this.description = description;
        this.website = website;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}

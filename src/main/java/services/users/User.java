package services.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kevin on 5/20/17.
 */
@Document(collection = "users")
public class User implements Serializable
{
    @JsonProperty("id")
    private Long id;

    @JsonProperty("first_name")
    private String first_name;

    @JsonProperty("last_name")
    private String last_name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("organizations")
    private List<String> organizations;
}

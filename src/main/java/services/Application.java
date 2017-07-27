package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.orgs.OrganizationRepository;
import services.users.UserRepository;

/**
 * Created by kevin on 7/26/17.
 */
@SpringBootApplication
public class Application {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrganizationRepository organizationRepository;

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}

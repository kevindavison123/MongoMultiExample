package services.orgs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.users.UserRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kevin on 6/4/17.
 */

@SpringBootApplication()
public class OrganizationApplication implements CommandLineRunner {
        public static void main(String[] args)
    {
        SpringApplication.run(OrganizationApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        organizationRepository.deleteAll();
        String[] tags = new String[] {"org", "peace", "love"};
        String[] tags1 = new String[] {"org", "food", "charity"};
        List<String> tag1 = new ArrayList<String>();
        List<String> tag2 = new ArrayList<String>();
        Collections.addAll(tag1, tags);
        Collections.addAll(tag2, tags1);



        // save a couple of customers
        organizationRepository.save(new Organization("TestOrg", "A Test of the desc","www.test.org", tag2));
        organizationRepository.save(new Organization("SomeOrg", "An org description","www.someOrg.org", tag1));


        // fetch all customers
        System.out.println("Organizations found with findAll():");
        System.out.println("-------------------------------");
        for (Organization organization : organizationRepository.findAll()) {
            System.out.println(organization);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Organization found with findByName('TestOrg'):");
        System.out.println("--------------------------------");
        System.out.println(organizationRepository.findByName("TestOrg"));

        System.out.println("Organization found with findByWebsite('www.someOrg.org'):");
        System.out.println("--------------------------------");
        System.out.println(organizationRepository.findByWebsite("TestOrg"));
    }
}

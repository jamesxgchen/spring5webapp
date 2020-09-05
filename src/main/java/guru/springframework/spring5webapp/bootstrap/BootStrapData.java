package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    public BootStrapData(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher p1 = new Publisher("Publisher1", "1 Fake Street", "Big city", "M1H4H3", "AB");
        Publisher p2 = new Publisher("Publisher2", "1 Real Street", "Small city", "P3H4H3", "BC");
        Publisher p3 = new Publisher("Publisher1", "1 Fake Street", "Big city", "M1H4H3", "AB");

        publisherRepository.save(p1);
        publisherRepository.save(p2);
        publisherRepository.save(p3);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of publishers: "+publisherRepository.count());
    }
}

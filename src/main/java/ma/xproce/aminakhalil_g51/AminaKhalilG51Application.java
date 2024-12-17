package ma.xproce.aminakhalil_g51;

import ma.xproce.aminakhalil_g51.dao.entities.Computer;
import ma.xproce.aminakhalil_g51.dao.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AminaKhalilG51Application {

    public static void main(String[] args) {
        SpringApplication.run(AminaKhalilG51Application.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerRepository computerRepository) {
        return args -> {
            computerRepository.save(Computer.builder()
                    .proc("Intel Core i7")
                    .ram("16GB")
                    .hardDrive("512GB SSD")
                    .macAddress("00-14-22-01-23-45")
                    .price(1200.00)
                    .build());

            computerRepository.save(Computer.builder()
                    .proc("AMD Ryzen 5")
                    .ram("8GB")
                    .hardDrive("1TB HDD")
                    .macAddress("00-14-22-01-23-46")
                    .price(800.00)
                    .build());

            computerRepository.save(Computer.builder()
                    .proc("Apple M1")
                    .ram("16GB")
                    .hardDrive("256GB SSD")
                    .macAddress("00-14-22-01-23-47")
                    .price(1500.00)
                    .build());

            computerRepository.save(Computer.builder()
                    .proc("Intel Core i5")
                    .ram("8GB")
                    .hardDrive("256GB SSD")
                    .macAddress("00-14-22-01-23-48")
                    .price(700.00)
                    .build());

            System.out.println("Initialisation des objets Computer dans la base de données terminée.");
        };
    }

}

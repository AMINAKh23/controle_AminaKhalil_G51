package ma.xproce.aminakhalil_g51.dao.repositories;

import ma.xproce.aminakhalil_g51.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findByProc(String proc);

}

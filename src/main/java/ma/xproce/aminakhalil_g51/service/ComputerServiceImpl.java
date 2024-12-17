package ma.xproce.aminakhalil_g51.service;


import ma.xproce.aminakhalil_g51.dao.entities.Computer;
import ma.xproce.aminakhalil_g51.dao.repositories.ComputerRepository;
import ma.xproce.aminakhalil_g51.dto.ComputerDto;
import ma.xproce.aminakhalil_g51.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    @Autowired
    private ComputerMapper computerMapper;

    @Override
    public ComputerDto saveComputer(ComputerDto computerDTO) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDTO);
        Computer savedComputer = computerRepository.save(computer);
        return computerMapper.fromComputerToComputerDto(savedComputer);
    }

    @Override
    public boolean deleteComputer(Long id) {
        if (computerRepository.existsById(id)) {
            computerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<ComputerDto> getAllComputers() {
        return computerRepository.findAll().stream()
                .map(computerMapper::fromComputerToComputerDto)
                .collect(Collectors.toList());
    }
}
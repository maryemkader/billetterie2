
package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.TypeBillet;
import repository.TypeBilletRepository;

@Service
public class TypeBilletService {

    private final TypeBilletRepository typeBilletRepository;

    public TypeBilletService(TypeBilletRepository typeBilletRepository) {
        this.typeBilletRepository = typeBilletRepository;
    }

    public List<TypeBillet> getAll() {
        return typeBilletRepository.findAll();
    }

    public TypeBillet getById(Long id) {
        return typeBilletRepository.findById(id).orElse(null);
    }

    public TypeBillet save(TypeBillet typeBillet) {
        return typeBilletRepository.save(typeBillet);
    }

    public void delete(Long id) {
        typeBilletRepository.deleteById(id);
    }
}

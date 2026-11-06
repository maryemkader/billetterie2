
package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Lieu;
import repository.LieuRepository;

@Service
public class LieuService {

    private final LieuRepository lieuRepository;

    public LieuService(LieuRepository lieuRepository) {
        this.lieuRepository = lieuRepository;
    }

    public List<Lieu> getAll() {
        return lieuRepository.findAll();
    }

    public Lieu getById(Long id) {
        return lieuRepository.findById(id).orElse(null);
    }

    public Lieu save(Lieu lieu) {
        return lieuRepository.save(lieu);
    }

    public void delete(Long id) {
        lieuRepository.deleteById(id);
    }
}

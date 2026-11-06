
package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Paiement;
import repository.PaiementRepository;

@Service
public class PaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    public List<Paiement> getAll() {
        return paiementRepository.findAll();
    }

    public Paiement getById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }
}

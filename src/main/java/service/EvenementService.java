
package service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Evenement;
import repository.EvenementRepository;

@Service
public class EvenementService {

    private final EvenementRepository evenementRepository;

    public EvenementService(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    public List<Evenement> getAll() {
        return evenementRepository.findAll();
    }

    public Evenement getById(Long id) {
        return evenementRepository.findById(id).orElse(null);
    }

    public Evenement save(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    public void delete(Long id) {
        evenementRepository.deleteById(id);
    }

    // 1. Recherche par titre
    public List<Evenement> rechercherParTitre(String titre) {
        return evenementRepository.rechercherParTitre(titre);
    }

    // 2. Recherche par catégorie
    public List<Evenement> rechercherParCategorie(Long categorieId) {
        return evenementRepository.rechercherParCategorie(categorieId);
    }

    // 3. Événements à venir
    public List<Evenement> rechercherEvenementsAVenir() {
        return evenementRepository.rechercherEvenementsAVenir(LocalDateTime.now());
    }
}

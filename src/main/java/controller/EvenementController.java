
package controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import model.Evenement;
import service.EvenementService;

@RestController
@RequestMapping("/api/evenements")
@CrossOrigin(origins = "*")
public class EvenementController {

    private final EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @GetMapping
    public List<Evenement> getAll() {
        return evenementService.getAll();
    }

    @GetMapping("/{id}")
    public Evenement getById(@PathVariable Long id) {
        return evenementService.getById(id);
    }

    @PostMapping
    public Evenement create(@RequestBody Evenement evenement) {
        return evenementService.save(evenement);
    }

    @PutMapping("/{id}")
    public Evenement update(@PathVariable Long id,
                            @RequestBody Evenement evenement) {
        evenement.setId(id);
        return evenementService.save(evenement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        evenementService.delete(id);
    }

    // 1. Recherche par titre
    @GetMapping("/rechercher")
    public List<Evenement> rechercherParTitre(@RequestParam String titre) {
        return evenementService.rechercherParTitre(titre);
    }

    // 2. Recherche par catégorie
    @GetMapping("/categorie/{categorieId}")
    public List<Evenement> rechercherParCategorie(
            @PathVariable Long categorieId) {
        return evenementService.rechercherParCategorie(categorieId);
    }

    // 3. Événements à venir
    @GetMapping("/a-venir")
    public List<Evenement> rechercherEvenementsAVenir() {
        return evenementService.rechercherEvenementsAVenir();
    }
}

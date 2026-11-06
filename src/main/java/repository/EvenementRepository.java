
package repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Evenement;

public interface EvenementRepository
        extends JpaRepository<Evenement, Long> {

    // 1. Rechercher les événements par titre
    @Query("SELECT e FROM Evenement e WHERE LOWER(e.titre) LIKE LOWER(CONCAT('%', :titre, '%'))")
    List<Evenement> rechercherParTitre(@Param("titre") String titre);

    // 2. Rechercher les événements par catégorie
    @Query("SELECT e FROM Evenement e WHERE e.categorie.id = :categorieId")
    List<Evenement> rechercherParCategorie(@Param("categorieId") Long categorieId);

    // 3. Rechercher les événements à venir
    @Query("SELECT e FROM Evenement e WHERE e.dateDebut > :date")
    List<Evenement> rechercherEvenementsAVenir(@Param("date") LocalDateTime date);
}


package controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import model.Lieu;
import service.LieuService;

@RestController
@RequestMapping("/api/lieux")
@CrossOrigin(origins = "*")
public class LieuController {

    private final LieuService lieuService;

    public LieuController(LieuService lieuService) {
        this.lieuService = lieuService;
    }

    @GetMapping
    public List<Lieu> getAll() {
        return lieuService.getAll();
    }

    @GetMapping("/{id}")
    public Lieu getById(@PathVariable Long id) {
        return lieuService.getById(id);
    }

    @PostMapping
    public Lieu create(@RequestBody Lieu lieu) {
        return lieuService.save(lieu);
    }

    @PutMapping("/{id}")
    public Lieu update(@PathVariable Long id, @RequestBody Lieu lieu) {
        lieu.setId(id);
        return lieuService.save(lieu);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        lieuService.delete(id);
    }
}

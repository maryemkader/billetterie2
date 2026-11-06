
package controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import model.TypeBillet;
import service.TypeBilletService;

@RestController
@RequestMapping("/api/types-billets")
@CrossOrigin(origins = "*")
public class TypeBilletController {

    private final TypeBilletService typeBilletService;

    public TypeBilletController(TypeBilletService typeBilletService) {
        this.typeBilletService = typeBilletService;
    }

    @GetMapping
    public List<TypeBillet> getAll() {
        return typeBilletService.getAll();
    }

    @GetMapping("/{id}")
    public TypeBillet getById(@PathVariable Long id) {
        return typeBilletService.getById(id);
    }

    @PostMapping
    public TypeBillet create(@RequestBody TypeBillet typeBillet) {
        return typeBilletService.save(typeBillet);
    }

    @PutMapping("/{id}")
    public TypeBillet update(@PathVariable Long id,
                             @RequestBody TypeBillet typeBillet) {
        typeBillet.setId(id);
        return typeBilletService.save(typeBillet);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        typeBilletService.delete(id);
    }
}

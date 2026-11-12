package com.ministry;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/prayers")
public class PrayerController {
    private final PrayerRepository repo;
    public PrayerController(PrayerRepository repo){this.repo=repo;}
    @PostMapping
    public Prayer create(@RequestBody Prayer p){ return repo.save(p); }
    @GetMapping
    public List<Prayer> all(){ return repo.findAllByOrderByCreatedAtDesc(); }
    @PostMapping("/{id}/prayed")
    public Prayer markPrayed(@PathVariable Long id){
        Prayer p = repo.findById(id).orElseThrow();
        p.setPrayedFor(true);
        return repo.save(p);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ repo.deleteById(id); }
    @GetMapping("/count")
    public long count(){ return repo.count(); }
}

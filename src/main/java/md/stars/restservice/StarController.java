package md.stars.restservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class StarController {

    @Autowired
    private StarRepository starRepository;

    // Create

    @PostMapping("/stars")
    //public Star createStar(@Valid @RequestBody Star star) {
    public Star createStar(@RequestBody Star star) {
        return starRepository.save(star);
    }

    // Read

    @GetMapping("/stars")
    public List<Star> getAllStars() {
        return starRepository.findAll();
    }

    @GetMapping("/stars/{name}")
    public List<Star> getStarsByName(@PathVariable(value = "name") String starName) {
        return starRepository.findByStarName(starName);
    }

    @GetMapping("/stars/telescope/{id}")
    public List<Star> getStarByTelescopeId(@PathVariable(value = "id") Long telescopeId) {
        return starRepository.findByTelescopeId(telescopeId);
    }
}

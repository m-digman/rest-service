package md.stars.restservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class StarController {

    @Autowired
    private StarRepository starRepository;

    /**
     * List all.
     *
     * @return the list
     */
    @GetMapping("/stars")   // GET Method for reading operation
    public List<Star> getAllStars() {
        return starRepository.findAll();
    }

    @GetMapping("/stars/{name}")   // GET Method for reading operation
    public List<Star> getStarsByName(@PathVariable(value = "name") String starName) {
        return starRepository.findByStarName(starName);
    }

    @GetMapping("/telescope/{id}")    // GET Method for Read operation
    public ResponseEntity<Star> getStarByTelescopeId(@PathVariable(value = "id") Long telescopeId)
            throws Exception {

        Star star = starRepository.findById(telescopeId)
                .orElseThrow(() -> new Exception("Telescope " + telescopeId + " not found"));
        return ResponseEntity.ok().body(star);
    }
}

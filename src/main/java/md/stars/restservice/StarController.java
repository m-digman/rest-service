package md.stars.restservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
}

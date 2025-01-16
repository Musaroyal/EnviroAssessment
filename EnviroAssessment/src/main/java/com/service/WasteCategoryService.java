import com.enviro.assessment.grad001.MavasMusa.EnviroAssessment.entity.WasteCategory;
import com.enviro.assessment.grad001.MavasMusa.EnviroAssessment.repository.WasteCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryService {
    private final WasteCategoryRepository repository;

    public WasteCategoryService(WasteCategoryRepository repository) {
        this.repository = repository;
    }

    public WasteCategory save(WasteCategory category) {
        return repository.save(category);
    }

    public List<WasteCategory> findAll() {
        return repository.findAll();
    }

    public Optional<WasteCategory> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

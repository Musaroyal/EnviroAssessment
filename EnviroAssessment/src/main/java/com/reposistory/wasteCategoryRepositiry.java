package com.enviro.assessment.grad001.MavasMusa.EnviroAssessment.repository;
import com.enviro.assessment.grad001.MavasMusa.EnviroAssessment.entity.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
@Repository
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, Long> {
    Optional<WasteCategory> findByCategoryName(String categoryName);
}

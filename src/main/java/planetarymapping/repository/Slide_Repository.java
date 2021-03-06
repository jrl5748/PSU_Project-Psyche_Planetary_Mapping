package planetarymapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import planetarymapping.model.Slide;

import java.util.List;

@Repository
public interface Slide_Repository extends JpaRepository<Slide, Integer> {
   List<Slide> findAll();

   Slide findAllById(Integer id);
   

}

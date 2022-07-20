package jana60.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import jana60.model.Teachers;

public interface TeacherRepository extends CrudRepository<Teachers, Integer> {

}
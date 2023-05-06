package gt.edu.umg.task.daos;

import gt.edu.umg.task.entities.Task;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;




public interface TaskDao extends CrudRepository<Task,Long>{
	Optional<Task> findById(Long id);
}

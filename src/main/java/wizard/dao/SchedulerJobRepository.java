package wizard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import wizard.model.SchedulerJob;

/**
 * Created by 10992 on 2017/4/17.
 */
public interface SchedulerJobRepository extends JpaRepository<SchedulerJob, Long> {

}

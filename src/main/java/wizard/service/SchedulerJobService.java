package wizard.service;

import wizard.model.SchedulerJob;

import java.util.List;

/**
 * Created by 10992 on 2017/5/4.
 */
public interface SchedulerJobService {

    SchedulerJob addSchedulerJob(SchedulerJob schedulerJob);
    void deleteSchedulerJob(Long id);
    List<SchedulerJob> findAll();
    SchedulerJob findById(Long id);
    SchedulerJob update(SchedulerJob schedulerJob);
}

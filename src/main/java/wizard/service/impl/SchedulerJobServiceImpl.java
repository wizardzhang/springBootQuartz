package wizard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wizard.dao.SchedulerJobRepository;
import wizard.model.SchedulerJob;
import wizard.service.SchedulerJobService;

import java.util.List;

/**
 * Created by 10992 on 2017/5/4.
 */
@Service
public class SchedulerJobServiceImpl implements SchedulerJobService {

    @Autowired
    SchedulerJobRepository schedulerJobRepository;

    @Override
    public SchedulerJob addSchedulerJob(SchedulerJob schedulerJob) {
        return  schedulerJobRepository.save(schedulerJob);
    }

    @Override
    public void deleteSchedulerJob(Long id) {
         schedulerJobRepository.delete(id);
    }

    @Override
    public List<SchedulerJob> findAll() {

        return schedulerJobRepository.findAll();
    }

    @Override
    public SchedulerJob findById(Long id) {

        return null;
    }

    @Override
    public SchedulerJob update(SchedulerJob schedulerJob) {

        return schedulerJobRepository.saveAndFlush(schedulerJob);
    }

}

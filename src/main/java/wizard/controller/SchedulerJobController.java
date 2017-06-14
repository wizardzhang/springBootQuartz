package wizard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import wizard.model.SchedulerJob;
import wizard.service.SchedulerJobService;

/**
 * Created by 10992 on 2017/4/17.
 */
@Controller
@RequestMapping("/")
public class SchedulerJobController {

    @Autowired
    private SchedulerJobService schedulerJobService;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }


    @RequestMapping(value = "/schedulerJobs/create", method = RequestMethod.GET)
    public String createPage(){
        return "create";
    }

    @RequestMapping(value = "/schedulerJobs/", method = RequestMethod.POST)
    public String createSchedulerJob(@RequestParam("jobName") String jobName,
                                     @RequestParam("jobGroup") String jobGroup,
                                     @RequestParam("jobStatus") String jobStatus,
                                     @RequestParam("cronExpression") String cronExpression,
                                     @RequestParam("desc") String desc){
        SchedulerJob job = new SchedulerJob(jobName, jobGroup, jobStatus, cronExpression, desc);
        schedulerJobService.addSchedulerJob(job);
        return String.format("redirect:/schedulerJobs/%d",job.getId());
    }

    @RequestMapping(value = "/schedulerJobs/get", method = RequestMethod.GET)
    public SchedulerJob getSchedulerJobById(@RequestParam("id") Long id){

        return schedulerJobService.findById(id);
    }

}

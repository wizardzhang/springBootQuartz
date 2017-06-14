package wizard.model;

import javax.persistence.*;

/**
 * Created by 10992 on 2017/4/17.
 */

@Entity
@Table(name = "scheduler_job")
public class SchedulerJob {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    /** 任务id **/
    private Long id;

    /** 任务名称 **/
    private String jobName;

    /** 任务描述 **/
    private String jobDesc;

    /** 任务分组 **/
    private String jobGroup;

    /** 任务状态 0禁用 1启用 2删除**/
    private String jobStatus;

    /** 任务运行时间表达式 **/
    private String cronExpression;

    public SchedulerJob() {}

    public SchedulerJob(String jobName, String jobDesc, String jobGroup, String jobStatus, String cronExpression) {
        this.jobName = jobName;
        this.jobDesc = jobDesc;
        this.jobGroup = jobGroup;
        this.jobStatus = jobStatus;
        this.cronExpression = cronExpression;
    }

    public SchedulerJob(Long id, String jobName, String jobGroup, String jobStatus, String cronExpression, String desc) {
        this.id = id;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.jobStatus = jobStatus;
        this.cronExpression = cronExpression;
        this.jobDesc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }




}

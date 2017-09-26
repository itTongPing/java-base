package simple;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

public class SimpleTriggerRunner {

	
	public static void main(String[] args) throws SchedulerException {
		
		JobDetail jobDetail=new JobDetailImpl("job1_1", "group1", SimpleJob.class);
		
		SimpleTrigger simpleTrigger=new SimpleTriggerImpl("trigger1_1", "tgroup1", new Date());
		
		SchedulerFactory scheduleFactory=new StdSchedulerFactory();
		
		
		Scheduler scheduler = scheduleFactory.getScheduler();
		scheduler.scheduleJob(jobDetail,simpleTrigger);
		
		scheduler.start();
		
		
		
	}
}

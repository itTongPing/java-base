package simple;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job {

	@Override
	public void execute(JobExecutionContext jobCtx) throws JobExecutionException {
					System.out.println(jobCtx.getTrigger().getStartTime());

	}

}

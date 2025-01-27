package srcs.workflow.executor;

import java.util.Map;

import srcs.workflow.job.Job;

/**
 * Abstract class representing a job executor. Subclasses should define the
 * execution strategy of the job.
 * 
 * @author check-leo
 *
 */
public abstract class JobExecutor {
	protected Job job;

	public JobExecutor(Job job) {

		this.job = job;
	}

	public abstract Map<String, Object> execute() throws Exception;
}

package com.sample.SpringBatch.rest;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@Autowired
	private JobLauncher jobLauncher;
	
	@Autowired
	private Job job;
	
	@PostMapping("/import")
	public void loadDataToDB() throws Exception
	{
		JobParameters jobParameter =new JobParametersBuilder().
				addLong("startAt", System.currentTimeMillis()).toJobParameters();
		
		jobLauncher.run(job, jobParameter);
	}

}

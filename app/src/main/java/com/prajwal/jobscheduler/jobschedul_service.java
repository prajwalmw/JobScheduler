package com.prajwal.jobscheduler;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class jobschedul_service extends JobService {
    private JobParameters params;

    @Override
    public boolean onStartJob(JobParameters params) {

        Toast.makeText(this,
                "MyJobService.onStartJob()",
                Toast.LENGTH_SHORT).show();
        /*
         * True - if your service needs to process
         * the work (on a separate thread).
         * False - if there's no more work to be done for this job.
         */
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Toast.makeText(this,
                "MyJobService.onStopJob()",
                Toast.LENGTH_SHORT).show();
        return false;
    }
}
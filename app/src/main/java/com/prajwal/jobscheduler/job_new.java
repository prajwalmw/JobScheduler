package com.prajwal.jobscheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;
import android.widget.Toast;

import java.util.logging.Logger;

public class job_new extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Toast.makeText(getApplicationContext(),
               "MyJobService.onStartJob()",
                Toast.LENGTH_SHORT).show();
        Log.d("KRN","KRANTHU: ");
        /*
         * True - if your service needs to process
         * the work (on a separate thread).
         * False - if there's no more work to be done for this job.
         */

        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Toast.makeText(this,
                "MyJobService.onStopJob()",
                Toast.LENGTH_SHORT).show();
       // jobFinished(jobParameters,true);
        return true; //true to reschedule
    }
}

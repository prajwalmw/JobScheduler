package com.prajwal.jobscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    JobScheduler mJobScheduler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJobScheduler = (JobScheduler)
                getSystemService(Context.JOB_SCHEDULER_SERVICE);
        JobInfo.Builder builder = new JobInfo.Builder(1,
                new ComponentName(getPackageName(),
                        job_new.class.getName()));
        builder.setPeriodic(5000);
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);

        if (mJobScheduler.schedule(builder.build()) <= 0) {
            Log.e(TAG, "onCreate: Some error while scheduling the job");
        }
            }
}

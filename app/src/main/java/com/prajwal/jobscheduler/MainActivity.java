package com.prajwal.jobscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
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

     /*   if(Build.VERSION.SDK_INT > Build.VERSION_CODES.N)
        {
            builder.setTriggerContentUpdateDelay(1000);
            //builder.setPeriodic(60000,6000);
        }
        else
        {
           // builder.setPeriodic(60000);
        }*/

        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_CELLULAR);
       // builder.setRequiredNetwork(JobInfo.NETWORK_TYPE_CELLULAR);

        //builder.setOverrideDeadline(2000);
        mJobScheduler.schedule(builder.build());


            }

}

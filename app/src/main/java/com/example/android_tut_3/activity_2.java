package com.example.android_tut_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;


//Basically we want our activity_2 to sleep for 5 seconds and then open up new activity i.e MainActivity
//We can accomplished this using thread
//threads are important for game dev
//Threads allow you to do multiple things at same time instead of waiting to get something done and doing something else

public class activity_2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //creating thread Thread=type of variable & timer=variable & creating thread with help of new keyword
        Thread timer = new Thread(){

            //thread is looking for run method
            public void run(){

                //in try, we try to do some methods
                //using try and catch so if the code defined in try not worked catch will store/caught all errors in it or tell what kinds of error you are looking to catch
                //e.g,catch will caught this type  InterruptedException e  of error if they occur catch (InterruptedException e)
                //after catching those errors we can use for debugging
                //in finally, we can perform the last steps i.e conclusion

                //Flow
                //1. In try, we run some commands or code like we sleep our device for 5sec
                //2. In catch, we pass a parameter and create variable of that exception type so it will catch that particular type of error
                //then using printStackTrace(); for debugging so our app runs successfully
                //3. In finally, we create an Intent variable and storing an action that we defined in manifest.xml in OpenMainActivity variable
                //then we call startActivity and pass that Intent variable to open the new activity

                try{
                    //5000miliseconds=5sec
                    //using sleep method to pause activity for 5sec
                    sleep(5000);
                }catch (InterruptedException e){

                    //InterruptedException(type of exception) e=variable
                    //printStackTrace() is for debugging basically it throws around
                    e.printStackTrace();

                }finally {
                    //creating OpenMainActivity of Intent type
                    //Intent was created based on the action ("com.example.android_tut_3.MainActivity") defined in Manifest.xml
                    Intent OpenMainActivity = new Intent("com.example.android_tut_3.MainActivity");

                    //startActivity is a method of Activity class that starts the activity on base of intent
                    //so Basically after storing the action in OpenMainActivity variable of Intent Type we pass that variable in startActivity()
                    startActivity(OpenMainActivity);
                }


            }

        };
        //using thread method to start
        timer.start();


    }
}

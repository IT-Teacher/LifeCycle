package uz.it_teacher.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Second onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Second onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Second onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Second onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Second onDestroy");
    }
}
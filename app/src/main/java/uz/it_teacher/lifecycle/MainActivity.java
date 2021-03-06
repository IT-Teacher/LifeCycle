package uz.it_teacher.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private static final String TAG = "Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Main onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

        Log.d(TAG,"Main onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Main onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Main onStop");
    }
}
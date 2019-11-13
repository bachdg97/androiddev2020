package vn.edu.usth.weather;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG", "This is a log output");
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("TAG", "This is a log output");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("TAG", "This is a log output");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "This is a log output");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "This is a log output");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "This is a log output");
    }
}

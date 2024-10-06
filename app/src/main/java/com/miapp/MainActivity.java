package com.miapp;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Iniciar App Center SDK
        AppCenter.start(getApplication(), "f85d2617-75dd-4f23-b22f-4a52d6dea89b", 
                        Analytics.class, Crashes.class);
    }
}

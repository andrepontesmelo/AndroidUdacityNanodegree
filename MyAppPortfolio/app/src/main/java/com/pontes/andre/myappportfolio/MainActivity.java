package com.pontes.andre.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void showToast(View view) {
        switch (view.getId()) {
            case R.id.button_movies:
                displayToast("This button will launch my movie app!");
                break;

            case R.id.button_scores:
                displayToast("This button will launch my scores app!");
                break;

            case R.id.button_library:
                displayToast("This button will launch my library app!");
                break;

            case R.id.button_build:
                displayToast("This button will launch my build app!");
                break;

            case R.id.button_xyz:
                displayToast("This button will launch my xyz app!");
                break;

            case R.id.button_own:
                displayToast("This button will launch my own app!");
                break;

        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

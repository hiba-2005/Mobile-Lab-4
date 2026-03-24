package com.example.fragmentslab4;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.fragmentslab4.FragmentOne;
import com.example.fragmentslab4.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    private Button btnFragment1, btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1 = findViewById(R.id.btnFragment1);
        btnFragment2 = findViewById(R.id.btnFragment2);

        // Afficher FragmentOne au démarrage
        if (savedInstanceState == null) {
            replaceFragment(new FragmentOne(), false);
        }

        btnFragment1.setOnClickListener(v -> replaceFragment(new FragmentOne(), true));
        btnFragment2.setOnClickListener(v -> replaceFragment(new FragmentTwo(), true));
    }

    private void replaceFragment(Fragment fragment, boolean addToBackStack) {
        if (addToBackStack) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
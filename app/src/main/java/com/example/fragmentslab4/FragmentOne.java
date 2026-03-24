package com.example.fragmentslab4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    private TextView messageText;
    private Button actionButton;

    public FragmentOne() {
        super(R.layout.fragmentone);
    }

    @Override
    public void onViewCreated(@NonNull View root, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(root, savedInstanceState);

        messageText = root.findViewById(R.id.textOne);
        actionButton = root.findViewById(R.id.btnHello);

        actionButton.setOnClickListener(v -> afficherMessage());
    }

    private void afficherMessage() {
        messageText.setText("Bienvenue dans le Fragment 1 🚀");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("FRAG_ONE", "Fragment actif");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("FRAG_ONE", "Fragment en pause");
    }
}
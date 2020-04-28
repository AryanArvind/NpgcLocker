package com.example.npgclocker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChoiceSelection extends AppCompatActivity {

    private Button btnFaculty;
    private Button btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_selection);

        btnStudent = findViewById(R.id.btnStudent);
        btnFaculty = findViewById(R.id.btnFaculty);
        btnFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceSelection.this,FacultyLogin.class);
                startActivity(intent);finish();
            }
        });
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceSelection.this, StudentSignup.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

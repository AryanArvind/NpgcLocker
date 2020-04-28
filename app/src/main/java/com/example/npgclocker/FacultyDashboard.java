package com.example.npgclocker;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class FacultyDashboard extends AppCompatActivity {
    public static final String STUDENTS = "students";
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_dashboard);
        db.collection(STUDENTS).get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                List<DocumentSnapshot> documents = queryDocumentSnapshots.getDocuments();
                if (documents.size()>0) {
                    updateUI(documents);
                }else{
                    updateUI(null);
                }
            }
        });
    }

    private void updateUI(List<DocumentSnapshot> documents) {
        for (DocumentSnapshot document : documents) {
            StudentModel student = document.toObject(StudentModel.class);
            Toast.makeText(this, student.username, Toast.LENGTH_SHORT).show();
        }
    }
}

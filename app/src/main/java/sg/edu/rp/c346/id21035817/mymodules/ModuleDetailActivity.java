package sg.edu.rp.c346.id21035817.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName, tvAcademicYear, tvSemester, tvModuleCredit, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        Log.d("AnswerActivity1", "onCreate() called.");

        tvModuleCode.findViewById(R.id.textViewModuleCode);
        tvModuleName.findViewById(R.id.textViewModuleName);
        tvAcademicYear.findViewById(R.id.textViewAcademicYear);
        tvSemester.findViewById(R.id.textViewSemester);
        tvModuleCredit.findViewById(R.id.textViewModuleCredit);
        tvVenue.findViewById(R.id.textViewVenue);
        btnBack.findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int academicYear = intentReceived.getIntExtra("AcademicYear", 0);
        int semester = intentReceived.getIntExtra("Semester", 0);
        int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        tvModuleCode.setText("Module Code: " + moduleCode);
        tvModuleName.setText("Module Name: " + moduleName);
        tvAcademicYear.setText("Academic Year: " + academicYear);
        tvSemester.setText("Semester: " + semester);
        tvModuleCredit.setText("Module Credit: " + moduleCredit);
        tvVenue.setText("Venue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }
}
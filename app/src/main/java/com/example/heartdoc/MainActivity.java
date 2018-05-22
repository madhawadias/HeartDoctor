package com.example.heartdoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner genderSpinner;
    private Spinner ageSpinner;
    private Spinner cholesSpinner;
    private Spinner sbpSpinner;

    private CheckBox dMellittusCheckBox, smokerCheckBox;

    private Button resultButton;

    private ImageView resultImage;

    private String result="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultButton = (Button) findViewById(R.id.button);
        genderSpinner=(Spinner) findViewById(R.id.spinnerGender);
        ageSpinner=(Spinner) findViewById(R.id.spinnerAge);
        cholesSpinner=(Spinner) findViewById(R.id.cholesSpinner);
        sbpSpinner=(Spinner) findViewById(R.id.sbpSpinner);
        resultImage=(ImageView) findViewById(R.id.imageColour);

        dMellittusCheckBox=(CheckBox) findViewById(R.id.checkBoxDMellitus);
        smokerCheckBox=(CheckBox) findViewById(R.id.checkBoxSmoker);

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = genderSpinner.getSelectedItem().toString();
                Log.d("GENDER : ", gender);
                String age = ageSpinner.getSelectedItem().toString();
                Log.d("AGE : ", age);
                String choles = cholesSpinner.getSelectedItem().toString();
                Log.d("CHOLESTEROL : ", choles);
                String sbp = sbpSpinner.getSelectedItem().toString();
                Log.d("SBP : ", sbp);

                //================================
                // Diabetes Mellitus is CHECKED
                //================================
                if(dMellittusCheckBox.isChecked()){
                    //MALE
                    if(gender.equals("Male")){
                        // SMOKER
                        if(smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                        }

                        // NON - SMOKER
                        if(!smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.green);
                                }
                            }
                        }

                    }
                    //FEMALE
                    if(gender.equals("Female")){
                        // SMOKER
                        if(smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                        }

                        // NON - SMOKER
                        if(!smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                        }

                    }
                }


                /******************************************/
                /******************************************/

                //==================================
                // Diabetes Mellitus is NOT CHECKED
                //==================================
                if(!dMellittusCheckBox.isChecked()){
                    //MALE
                    if(gender.equals("Male")){
                        // SMOKER
                        if(smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                        }

                        // NON - SMOKER
                        if(!smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.green);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.green);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.green);
                                }
                            }
                        }

                    }
                    //FEMALE
                    if(gender.equals("Female")){
                        // SMOKER
                        if(smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.red);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                        }

                        // NON - SMOKER
                        if(!smokerCheckBox.isChecked()){
                            // AGE = 70
                            if (age.equals("≥ 70")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 60
                            if (age.equals("60 - 69")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 50
                            if (age.equals("50 - 59")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.red);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                            // AGE = 40
                            if (age.equals("40 - 49")) {
                                // SBP = 180
                                if(sbp.equals("≥ 180") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("≥ 180") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("≥ 180") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }if(sbp.equals("≥ 180") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 160
                                if(sbp.equals("160 - 179") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("160 - 179") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("160 - 179") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }if(sbp.equals("160 - 179") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.darkred);
                                }
                                // SBP = 140
                                if(sbp.equals("140 - 159") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("140 - 159") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }if(sbp.equals("140 - 159") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.orange);
                                }
                                // SBP = 120
                                if(sbp.equals("120 - 139") &&choles.equals("≤ 189")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("190 - 227")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("228 - 265")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("266 - 303")){
                                    resultImage.setImageResource(R.drawable.green);
                                }if(sbp.equals("120 - 139") &&choles.equals("≥ 304")){
                                    resultImage.setImageResource(R.drawable.yellow);
                                }
                            }
                        }

                    }
                }


            }
        });
    }
}

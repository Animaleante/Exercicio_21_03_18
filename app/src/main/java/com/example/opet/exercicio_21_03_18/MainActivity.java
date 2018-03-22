package com.example.opet.exercicio_21_03_18;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editNumber;
    private SeekBar seekNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber = findViewById(R.id.editNumber);
        seekNumber = findViewById(R.id.seekNumber);

        seekNumber.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser)
                    editNumber.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        editNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() > 0) {
                    int parsedVal = 0;
                    try {
                        parsedVal = Integer.parseInt(s.toString());
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Você digitou um valor grande demais", Toast.LENGTH_SHORT).show();
                    }
//                    if(parsedVal >= seekNumber.getMin() && parsedVal <= seekNumber.getMax()) {
                    if(parsedVal >= 1 && parsedVal <= seekNumber.getMax()) {
                        seekNumber.setProgress(parsedVal);
                    } else {
                        seekNumber.setProgress(seekNumber.getMax());
                    }
                } else {
                    seekNumber.setProgress(1);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }
}

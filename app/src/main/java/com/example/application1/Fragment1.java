package com.example.application1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    RadioButton radioButton1, radioButton2;
    TextView textView;
    EditText editText;
    Button button;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false); // Corrected layout file
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        radioButton1 = view.findViewById(R.id.rd1);
        radioButton2 = view.findViewById(R.id.rd2);
        textView = view.findViewById(R.id.txt1);
        editText = view.findViewById(R.id.ed1);
        button = view.findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which radio button is selected
                if (radioButton1.isChecked()) {
                    convertToCelsius();
                } else if (radioButton2.isChecked()) {
                    convertToFahrenheit();
                }
            }

            private void convertToCelsius() {
                String e = editText.getText().toString();
                if (!e.isEmpty()) {
                    double fahrenheit = Double.parseDouble(e);
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    String result = String.valueOf(celsius);
                    textView.setText(result);
                }
            }

            private void convertToFahrenheit() {
                String e = editText.getText().toString();
                if (!e.isEmpty()) {
                    double celsius = Double.parseDouble(e);
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    String result = String.valueOf(fahrenheit);
                    textView.setText(result);
                }
            }
        });

    }
}

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

public class Fragment2 extends Fragment {

    RadioButton radioButton3, radioButton4;
    TextView textView;
    EditText editText;
    Button button;

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false); // Corrected layout file
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        radioButton3 = view.findViewById(R.id.rd3);
        radioButton4 = view.findViewById(R.id.rd4);
        textView = view.findViewById(R.id.txt2);
        editText = view.findViewById(R.id.ed2);
        button = view.findViewById(R.id.btn2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check which radio button is selected
                if (radioButton3.isChecked()) {
                    convertToCelsius();
                } else if (radioButton4.isChecked()) {
                    convertToFahrenheit();
                }
            }

            private void convertToCelsius() {
                String e = editText.getText().toString();
                if (!e.isEmpty()) {
                    double killometers = Double.parseDouble(e);
                    double miles = killometers / 1.609 ;
                    textView.setText(String.valueOf(miles));


                }
            }


            private void convertToFahrenheit() {
                String e = editText.getText().toString();
                if (!e.isEmpty()) {
                    double miles = Double.parseDouble(e);
                    double kilometers = miles * 1.60934;
                    textView.setText(String.valueOf(kilometers));
                }
            }
        });

    }
}

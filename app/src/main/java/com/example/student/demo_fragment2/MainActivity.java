package com.example.student.demo_fragment2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtmain;
    Button btnmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtmain = findViewById(R.id.edt_main);
        btnmain = findViewById(R.id.btn_main);

        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentA fragmentA = new FragmentA();
                Bundle bundle = new Bundle();

                bundle.putString("Main to A", edtmain.getText().toString());
                fragmentA.setArguments(bundle);

                fragmentTransaction.add(R.id.layoutmain,fragmentA);
                fragmentTransaction.commit();
            }
        });

    }
}

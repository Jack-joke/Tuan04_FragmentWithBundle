package com.example.student.demo_fragment2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {
    TextView tvfraga;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        tvfraga = (TextView)view.findViewById(R.id.tv_fraga);

        Bundle bundle = getArguments();
        if (bundle != null){
            tvfraga.setText(bundle.getString("Main to A"));
        }
        return view;
    }
}

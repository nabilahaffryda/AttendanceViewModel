package com.example.attendanceviewmodel.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.attendanceviewmodel.R;
import com.example.attendanceviewmodel.viewmodel.AttendViewModel;
import com.example.attendanceviewmodel.databinding.FragmentFormAttendBinding;

public class FormAttendFragment extends Fragment {

    private AttendViewModel mViewModel;

    public static FormAttendFragment newInstance(){
        return new FormAttendFragment();
    }

    public FormAttendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        FragmentFormAttendBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_form_attend, container, false);
        View view = binding.getRoot();
        mViewModel = new ViewModelProvider(this).get(AttendViewModel.class);
        binding.setAttendViewModel(mViewModel);
        binding.setLifecycleOwner(this);
        return view;
    }
}
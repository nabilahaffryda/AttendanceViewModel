package com.example.attendanceviewmodel.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.attendanceviewmodel.models.Attend;

public class AttendViewModel extends ViewModel {

    public MutableLiveData<String> name = new MutableLiveData<>();
    public MutableLiveData<String> nim = new MutableLiveData<>();
    public MutableLiveData<String> classes = new MutableLiveData<>();

    public MutableLiveData<Attend> attendMutableLiveData = new MutableLiveData<>();
    public Attend atd = new Attend();

    public void onClicked(){
        atd = new Attend(name.getValue(), nim.getValue(), classes.getValue());
        attendMutableLiveData.setValue(atd);
        Log.d("Add Student Name : ", String.valueOf(atd.getName()));
        Log.d("Add Student NIM : ", String.valueOf(atd.getNim()));
        Log.d("Add Student Class : ", String.valueOf(atd.getClasses()));
    }
}

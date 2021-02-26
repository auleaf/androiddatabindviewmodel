package com.yyzq.mytv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.yyzq.mytv.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    //Person person = new Person("我是你", 21);
    MyViewModel myViewModel;
    ActivityMainBinding binding =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        //binding.setPerson(person);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);


    }

    public void sendMessage(View view){
        //person = new Person("test", 21);
        //binding.setPerson(person);
        //
        /*
        Log.d(TAG,"sendbutton");
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String msg = editText.getText().toString();

        Intent intent = new Intent(this,DisplayMsgActivity.class);
        intent.putExtra("msg",msg);

        startActivity(intent);
*/
    }
}
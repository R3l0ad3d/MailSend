package com.example.user.mailsend;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.mailsend.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

    }

    private void sendEmail() {
        //Getting content for email
        String email = binding.etTO.getText().toString().trim();
        String subject = binding.etSubject.getText().toString().trim();
        String message = binding.etMassage.getText().toString().trim();

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();
    }

    public void sendMail(View view) {
        sendEmail();
    }
}

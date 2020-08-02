package com.example.dilatua;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //Parte Registrazione: reindirizzamento su RegistratiActivity
        TextView registrati = findViewById(R.id.registrati_login);
        String reg = "Registrati!";
        SpannableString ss = new SpannableString(reg);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View v) {
                Intent intent = new Intent(LoginActivity.this, RegistrazioneActivity.class);
                startActivity(intent);
            }
        };

        ss.setSpan(clickableSpan1,0,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        registrati.setText(ss);
        registrati.setMovementMethod(LinkMovementMethod.getInstance());

        //Parte dimentica Credenziali: ReimpostaPasswordActivity
        TextView reimpostaPassword = findViewById(R.id.reimposta_pwd_login);
        String reimpPwd = "Hai dimenticato la Password?";
        SpannableString ss2 = new SpannableString(reimpPwd);

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View v) {
                Intent intent = new Intent(LoginActivity.this, ReimpostaPasswordActivity.class);
                startActivity(intent);
            }
        };

        ss2.setSpan(clickableSpan2,0,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        reimpostaPassword.setText(ss2);
        reimpostaPassword.setMovementMethod(LinkMovementMethod.getInstance());

    }
}

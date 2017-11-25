package com.moodyphone.moodyphone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void AddNew(View view)
    {
        View view2 = (LayoutInflater.from(HomeActivity.this)).inflate(R.layout.activity_dialogtextinput, null);

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(HomeActivity.this);
        alertBuilder.setView(view2);
        final EditText userInput = (EditText) view2.findViewById(R.id.userInput);
        alertBuilder.setCancelable(true)
                .setPositiveButton(getString(R.string.OK), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        TextView label = (TextView) findViewById(R.id.userInputText);
                        label.setText(userInput.getText().toString());
                    }
                });
        alertBuilder.setNegativeButton(getString(R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        Dialog dialog = alertBuilder.create();
        dialog.show();
    }
}

package net.ozero.sqlitetraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonAdd;
    private Button buttonRead;
    private Button buttonClear;

    private EditText editTextName;
    private EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);

        buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);

        buttonRead = findViewById(R.id.buttonRead);
        buttonRead.setOnClickListener(this);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
    }


    @Override
    public void onClick(View v) {

        String name = editTextName.getText().toString();
        String email = editTextEmail.getText().toString();

        switch (v.getId()) {

            case R.id.buttonAdd:
                break;

            case R.id.buttonRead:
                break;

            case R.id.buttonClear:
                break;

        }

    }
}

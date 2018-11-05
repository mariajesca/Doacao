package dsdm.ufc.doacao.fragments.donate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import dsdm.ufc.doacao.R;

public class TitleDonate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_donate);
    }

    public void btnTitleOnClick(View view) {
        EditText editText = findViewById(R.id.edt_title);
        String title = editText.getText().toString();
        Intent intent = new Intent( TitleDonate.this, DescriptionDonate.class );
        intent.putExtra("title", title);
        startActivity(intent);
    }
}
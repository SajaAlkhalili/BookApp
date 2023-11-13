package edu.birzeit.students.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private TextView txtResult;
private Spinner spnbook;
private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult=findViewById(R.id.txtResult);
        spnbook=findViewById(R.id.spnBooks);
        btnSearch=findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="";
                str=spnbook.getSelectedItem().toString();
                DataBase db=new DataBase();
                List<Book>result=db.getBook(str);
                String r="";
                for (Book b :result){
                    r+=b.getTitle()+" "+b.getAuther()+"\n";
                }
                txtResult.setText(r);
            }
        });
    }
}
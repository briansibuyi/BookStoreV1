package com.example.brian.bookstorev1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminPane extends AppCompatActivity {

    Button View_books,Ordered_books,AddBook,Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_pane);

        View_books =(Button)findViewById(R.id.View_list);
        Ordered_books =(Button)findViewById(R.id.view_order);
        AddBook =(Button)findViewById(R.id.add_Books);
        Logout =(Button)findViewById(R.id.Logout_btn);


        View_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(AdminPane.this,ShowImagesActivity.class);
                startActivity(z);
            }
        });

        Ordered_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(AdminPane.this,Ordered_Books.class);
                startActivity(z);
            }
        });

        AddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z = new Intent(AdminPane.this,MainActivity.class);
                startActivity(z);
            }
        });



        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent z = new Intent(AdminPane.this,LoginActivity.class);
                startActivity(z);

                Toast.makeText(AdminPane.this,"Logout Successful",Toast.LENGTH_LONG).show();
            }
        });
    }


}

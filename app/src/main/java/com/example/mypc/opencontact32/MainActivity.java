package com.example.mypc.opencontact32;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    private static final int PICK_CONTACT = 1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button searchbutton= (Button) findViewById(R.id.openContact);
    }

    public void openContact(View v)
    {
        Intent intent= new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);
        startActivityForResult(intent,PICK_CONTACT );
    }

    // handle after selecting a contact from the list
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_CONTACT && resultCode == RESULT_OK) {
            Toast.makeText(MainActivity.this,"Result Processing Complete",Toast.LENGTH_SHORT).show();
        }
    }


}

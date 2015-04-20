package com.example.teamduke.collegecompanion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;


public class LibraryActivity extends ActionBarActivity {

    static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";

    public String title;

    public TextView bookTitle;

    public ImageView bookImage;

    SQLiteDatabase QRresult = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        bookTitle = (TextView) findViewById(R.id.bookTitleTextView);
        bookImage = (ImageView) findViewById(R.id.bookimageMain);


        try{


            // Opens a current database or creates it
            // Pass the database name, designate that only this app can use it
            // and a DatabaseErrorHandler in the case of database corruption
            QRresult = this.openOrCreateDatabase("results", MODE_PRIVATE, null);

            // Execute an SQL statement that isn't select
            QRresult.execSQL("CREATE TABLE results " +
                    "(id integer primary key, result TEXT);");

            // The database on the file system
            File database = getApplicationContext().getDatabasePath("results.db");

            // Check if the database exists
            if (database.exists()) {
                Toast.makeText(this, "Database Created", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Database Missing", Toast.LENGTH_SHORT).show();
            }

        }
        catch(Exception e){

            Log.e("CONTACTS ERROR", "Error Creating Database");
        }
    }



    public void Access_camera (View view){
        try {

            Intent intent = new Intent(ACTION_SCAN);
            intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
            startActivityForResult(intent, 0);
            bookTitle = (TextView) findViewById(R.id.bookTitleTextView);
        } catch (ActivityNotFoundException anfe) {
            showDialog(LibraryActivity.this, "No Scanner Found", "Download a scanner code activity?", "Yes", "No").show();

        }

    }

    private static AlertDialog showDialog(final Activity act, CharSequence title, CharSequence message, CharSequence buttonYes, CharSequence buttonNo) {
        AlertDialog.Builder downloadDialog = new AlertDialog.Builder(act);
        downloadDialog.setTitle(title);
        downloadDialog.setMessage(message);
        downloadDialog.setPositiveButton(buttonYes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Uri uri = Uri.parse("market://search?q=pname:" + "com.google.zxing.client.android");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    act.startActivity(intent);
                } catch (ActivityNotFoundException anfe) {

                }
            }
        });
        downloadDialog.setNegativeButton(buttonNo, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        return downloadDialog.show();
    }



    public void onActivityResult(int requestCode, int resultCode, Intent intent) {


        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                String contents = intent.getStringExtra("SCAN_RESULT");
                String format = intent.getStringExtra("SCAN_RESULT_FORMAT");

                Toast toast = Toast.makeText(this, "Content:" + contents + " Format:" + format, Toast.LENGTH_LONG);
                toast.show();

                QRresult.execSQL("INSERT INTO results (result)VALUES ('"+contents+"');");
                Cursor qrCursor = QRresult.rawQuery("SELECT result FROM results", null);


                int resultColumn = qrCursor.getColumnIndex("result");

                qrCursor.moveToFirst();
                String Title = "";

                if(qrCursor != null && (qrCursor.getCount() > 0)){

                    do{
                        // Get the results and store them in a String
                        String result= qrCursor.getString(resultColumn);

                        Title = result;

                        // Keep getting results as long as they exist
                    }while(qrCursor.moveToNext());



                    bookTitle.setText("Programming C#");
                    bookImage.setImageResource(R.drawable.programming_c_);



                } else {

                    Toast.makeText(this, "No Results to Show", Toast.LENGTH_SHORT).show();
                    bookTitle.setText("");
                }

                qrCursor.close();

            }
        }

    }
    public void Book_Activity(View view) {
        Intent getBuilding = new Intent(this,BookActivity.class);

        final int result = 1;
        getBuilding.putExtra("callingActivity", "LibraryActivity");
        startActivityForResult(getBuilding, result);
    }
}


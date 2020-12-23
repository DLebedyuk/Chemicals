package com.example.chemicals;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /* private RecyclerView recyclerView;
    private ChemAdapter adapter;
    private List<Chemical> listItems; */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog dialogBuilder = new AlertDialog.Builder(this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.add_chem_dialog, null);

        final EditText editName = (EditText) dialogView.findViewById(R.id.chem_description);
        final EditText editDescription = (EditText) dialogView.findViewById(R.id.chem_name);

        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /* recyclerView = (RecyclerView) findViewById(R.id.chem_list);
        //recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        //Generate sample data

        for (int i = 0; i<10; i++) {
            listItems.add(new Chemical("Item " + (i + 1), "Description of item " + (i+1)));
        }

        //Set adapter
        adapter = new ChemAdapter(listItems, this);
        recyclerView.setAdapter(adapter); */
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogBuilder.setView(dialogView);
                dialogBuilder.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
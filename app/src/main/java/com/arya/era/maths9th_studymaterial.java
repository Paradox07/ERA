package com.arya.era;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class maths9th_studymaterial extends AppCompatActivity {

    ListView class9mathslistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_maths9th_studymaterial);
        class9mathslistview=findViewById(R.id.class9mathslistview);
        String[] class9mathspdffiles = {"Chapter 1. NUMBER SYSTEM","Chapter 2. POLYNOMIALS","Chapter 3. COORDINATE GEOMETRY",
                "Chapter 4. LINEAR EQUATIONS IN TWO VARIABLE", "Chapter 5. INTRODUCTION TO EUCLID’S GEOMETRY","Chapter 6. LINES AND ANGELS",
                "Chapter 7. TRIANGLES","Chapter 8. QUADRILATERALS",
                "Chapter 9. AREA","Chapter 10. CIRCLES","Chapter 11. CONSTRUCTIONS",
                "Chapter 12. HERON'S FORMULA","Chapter 13. SURFACE AREA AND VOLUMES","Chapter 14. STATISTICS",
                "Chapter 15. PROBABILITY","Exemplar : Chapter-1","Exemplar : Chapter-2",
                "Exemplar : Chapter-3","Exemplar : Chapter-4","Exemplar : Chapter-5",
                "Exemplar : Chapter-6","Exemplar : Chapter-7","Exemplar : Chapter-8",
                "Exemplar : Chapter-9","Exemplar : Chapter-10","Exemplar : Chapter-11",
                "Exemplar : Chapter-12","Exemplar : Chapter-13","Exemplar : Chapter-14 & 15"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class9mathspdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class9mathslistview.setAdapter(adapter);
        class9mathslistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class9mathslistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),maths9pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}



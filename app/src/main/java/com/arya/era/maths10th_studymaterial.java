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

public class maths10th_studymaterial extends AppCompatActivity {

    ListView class10mathslistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_maths10th_studymaterial);
        class10mathslistview=findViewById(R.id.class10mathslistview);
        String[] class10mathspdffiles = {"Chapter 1. REAL NUMBERS","Chapter 2. POLYNOMIALS","Chapter 3. PAIR OF LINEAR EQUATIONS IN TWO VARIABLE",
                "Chapter 4. QUADRATIC EQUATIONS", "Chapter 5. ARITHMETIC PROGRESSIONS","Chapter 6. TRIANGLES",
                "Chapter 7. COORDINATE GEOMETRY","Chapter 8. INTRODUCTION TO TRIGONOMETRY",
                "Chapter 9. SOME APPLICATIONS OF TRIGONOMETRY","Chapter 10. CIRCLES","Chapter 11. CONSTRUCTIONS",
                "Chapter 12. AREAS RELATED TO CIRCLES","Chapter 13. SURFACE AREAS AND VOLUMES","Chapter 14. STATISTICS",
                "Chapter 15. PROBABILITY","Exemplar : Chapter-1","Exemplar : Chapter-2",
                "Exemplar : Chapter-3","Exemplar : Chapter-4","Exemplar : Chapter-5",
                "Exemplar : Chapter-6","Exemplar : Chapter-7","Exemplar : Chapter-8 & 9",
                "Exemplar : Chapter-10","Exemplar : Chapter-11",
                "Exemplar : Chapter-12","Exemplar : Chapter-13","Exemplar : Chapter-14 & 15","ANSWERS"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class10mathspdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class10mathslistview.setAdapter(adapter);
        class10mathslistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class10mathslistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),maths10pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}


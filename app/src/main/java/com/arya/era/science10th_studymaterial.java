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

public class science10th_studymaterial extends AppCompatActivity {

    ListView class10sciencelistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science10th_studymaterial);

        class10sciencelistview=findViewById(R.id.class10sciencelistview);
        String[] class10sciencepdffiles = {"Chapter 1. CHEMICAL REACTIONS AND EQUATIONS","Chapter 2. ACIDS, BASES AND SALTS",
                "Chapter 3. METAL AND NON-METALS",
                "Chapter 4. CARBON AND ITS COMPOUNDS",
                "Chapter 5. PERIODIC CLASSIFICATION OF ELEMENTS","Chapter 6. LIFE PROCESS",
                "Chapter 7. CONTROL AND COORDINATION","Chapter 8. HOW DO ORGANISMS REPRODUCE?",
                "Chapter 9. HEREDITY AND EVOLUTION","Chapter 10. LIGHT-REFLECTION AND REFRACTION",
                "Chapter 11. THE HUMAN EYE AND THE COLOURFUL WORLD",
                "Chapter 12. ELECTRICITY",
                "Chapter 13. MAGNETIC EFFECTS OF ELECTRIC CURRENT","Chapter 14. SOURCES OF ENERGY",
                "Chapter 15. OUR ENVIRONMENT","Chapter 16. SUSTAINABLE MANAGEMENT OF NATURAL RESOURCES",
                "Exemplar : Chapter-1","Exemplar : Chapter-2",
                "Exemplar : Chapter-3","Exemplar : Chapter-4","Exemplar : Chapter-5",
                "Exemplar : Chapter-6","Exemplar : Chapter-7","Exemplar : Chapter-8",
                "Exemplar : Chapter-9","Exemplar : Chapter-10","Exemplar : Chapter-11",
                "Exemplar : Chapter-12","Exemplar : Chapter-13","Exemplar : Chapter-14",
                "Exemplar : Chapter-15","Exemplar : Chapter-16","ANSWERS"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class10sciencepdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class10sciencelistview.setAdapter(adapter);
        class10sciencelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class10sciencelistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),science10pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}


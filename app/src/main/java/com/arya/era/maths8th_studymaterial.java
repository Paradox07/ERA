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

public class maths8th_studymaterial extends AppCompatActivity {

    ListView class8mathslistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_maths8th_studymaterial);

        class8mathslistview=findViewById(R.id.class8mathslistview);
        String[] class8mathspdffiles = {"Chapter 1. RATIONAL NUMBERS","Chapter 2. LINEAR EQUATIONS IN ONE VARIABLE","Chapter 3. UNDERSTANDING QUADRILATERALS",
                "Chapter 4. PRACTICAL GEOMETRY", "Chapter 5. DATA HANDLING","Chapter 6. SQUARES AND SQUARE ROOTS",
                "Chapter 7. CUBES AND CUBE ROOTS","Chapter 8. COMPARING QUANTITIES",
                "Chapter 9. ALGEBRIC EXPRESSIONS AND IDENTITIES","Chapter 10. VISUALISING SOLID SHAPES","Chapter 11. MENSURATION",
                "Chapter 12. EXPONENTS AND POWERS","Chapter 13. DIRECT AND INVERSE PROPORTIONS","Chapter 14. FACTORISATION",
                "Chapter 15. INTRODUCTION TO GRAPHS","Chapter 16. PLAYING WITH NUMBERS","Exemplar : Chapter-1","Exemplar : Chapter-3 & 4",
                "Exemplar : Chapter-5","Exemplar : Chapter-6 & 7","Exemplar : Chapter-8",
                "Exemplar : Chapter-9 & 14","Exemplar : Chapter-10","Exemplar : Chapter-11",
                "Exemplar : Chapter-12","Exemplar : Chapter-13","Exemplar : Chapter-15","ANSWERS"
               };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class8mathspdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class8mathslistview.setAdapter(adapter);
        class8mathslistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class8mathslistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),maths8pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}

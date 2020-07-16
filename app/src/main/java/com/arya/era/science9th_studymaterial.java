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

public class science9th_studymaterial extends AppCompatActivity {

    ListView class9sciencelistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science9th_studymaterial);

        class9sciencelistview=findViewById(R.id.class9sciencelistview);
        String[] class9sciencepdffiles = {"Chapter 1. MATTER IN OUR SURROUNDINGS","Chapter 2. IS MATTER AROUND US PURE?",
                "Chapter 3. ATOMS AND MOLECULES",
                "Chapter 4. STRUCTURE OF ATOMS",
                "Chapter 5. THE FUNDAMENTAL UNIT OF LIFE","Chapter 6. TISSUES",
                "Chapter 7. DIVERSITY IN LIVING ORGANISMS","Chapter 8. MOTION",
                "Chapter 9. FORCE AND LAWS OF MOTION","Chapter 10. GRAVITATION",
                "Chapter 11. WORK AND ENERGY",
                "Chapter 12. SOUND",
                "Chapter 13. WHY DO WE FALL ILL?","Chapter 14. NATURAL RESOURCES",
                "Chapter 15. IMPROVEMENT IN FOOD RESOURCES",
                "Exemplar : Chapter-1","Exemplar : Chapter-2",
                "Exemplar : Chapter-3","Exemplar : Chapter-4","Exemplar : Chapter-5",
                "Exemplar : Chapter-6","Exemplar : Chapter-7","Exemplar : Chapter-8",
                "Exemplar : Chapter-9","Exemplar : Chapter-10","Exemplar : Chapter-11",
                "Exemplar : Chapter-12","Exemplar : Chapter-13","Exemplar : Chapter-14",
                "Exemplar : Chapter-15"
               };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class9sciencepdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class9sciencelistview.setAdapter(adapter);
        class9sciencelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class9sciencelistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),science9pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}

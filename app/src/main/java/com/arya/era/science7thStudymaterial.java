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

public class science7thStudymaterial extends AppCompatActivity {

    ListView class7sciencelistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science7th_studymaterial);
        class7sciencelistview=findViewById(R.id.class7sciencelistview);
        String[] class7sciencepdffiles = {"Chapter 1. NUTRITION IN PLANTS","Chapter 2. NUTRITION IN ANIMALS","Chapter 3. FIBRE TO FABRIC",
                "Chapter 4. HEAT",
                "Chapter 5. ACIDS, BASES AND SALTS","Chapter 6. PHYSICAL AND CHEMICAL CHANGES",
                "Chapter 7. WEATHER, CLIMATE AND ADAPTATIONS OF ANIMALS OF CLIMATE","Chapter 8. WINDS, STORMS AND CYCLONES",
                "Chapter 9. SOIL","Chapter 10. RESPIRATION IN ORGANISMS","Chapter 11. TRANSPORTATION IN ANIMALS AND PLANTS",
                "Chapter 12. REPRODUCTION IN PLANTS",
                "Chapter 13. MOTION AND TIME","Chapter 14. ELECTRIC CURRENT AND ITS EFFECTS","Chapter 15. LIGHT",
                "Chapter 16. WATER: A PRECIOUS RESOURCE","Chapter 17. FORESTS: OUR LIFELINE","Chapter 18. WASTE WATER STORY",
                "Exemplar : Chapter-1","Exemplar : Chapter-2",
                "Exemplar : Chapter-3","Exemplar : Chapter-4","Exemplar : Chapter-5",
                "Exemplar : Chapter-6","Exemplar : Chapter-7","Exemplar : Chapter-8",
                "Exemplar : Chapter-9","Exemplar : Chapter-10","Exemplar : Chapter-11",
                "Exemplar : Chapter-12","Exemplar : Chapter-13","Exemplar : Chapter-14",
                "Exemplar : Chapter-15","Exemplar : Chapter-16","Exemplar : Chapter-17",
                "Exemplar : Chapter-18","ANSWERS"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class7sciencepdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class7sciencelistview.setAdapter(adapter);
        class7sciencelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class7sciencelistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),science7pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}

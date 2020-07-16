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

public class maths7thStudymaterial extends AppCompatActivity {

    ListView class7mathslistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_maths7th_studymaterial);

        class7mathslistview=findViewById(R.id.class7mathslistview);
        String[] class7mathspdffiles = {"Chapter 1. INTEGERS","Chapter 2. FRACTIONS AND DECIMALS","Chapter 3. DATA HANDLING","Chapter 4. SIMPLE EQUATIONS",
                "Chapter 5. LINES & ANGLES","Chapter 6. THE TRIANGLES AND ITS PROPERTIES","Chapter 7. CONGRUENCE OF TRIANGLES","Chapter 8. COMPARING QUANTITIES",
                "Chapter 9. RATIONAL NUMBERS","Chapter 10. PRACTICAL GEOMETRY","Chapter 11. PERIMETER AND AREA","Chapter 12. ALGEBRIC EXPRESSIONS",
                "Chapter 13. EXPONENTS AND POWERS","Chapter 14. SYMMETRY","Chapter 15. VISUALISING SOLID SHAPES"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class7mathspdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class7mathslistview.setAdapter(adapter);
        class7mathslistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class7mathslistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),maths7pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}

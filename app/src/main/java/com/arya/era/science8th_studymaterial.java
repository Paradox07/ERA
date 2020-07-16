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

public class science8th_studymaterial extends AppCompatActivity {

    ListView class8sciencelistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_science8th_studymaterial);
        class8sciencelistview=findViewById(R.id.class8sciencelistview);
        String[] class8sciencepdffiles = {"Chapter 1. CROP PRODUCTION AND MANAGEMENT","Chapter 2. MICROORGANISMS: FRIEND AND FOE",
                "Chapter 3. SYNTHETIC FIBRES AND PLASTICS",
                "Chapter 4. MATERIALS: METALS AND NON-METALS",
                "Chapter 5. COAL AND PETROLEUM","Chapter 6. COMBUSTION AND FLAME",
                "Chapter 7. CONSERVATION OF PLANTS AND ANIMALS","Chapter 8. CELL STRUCTURE AND FUNCTIONS",
                "Chapter 9. REPRODUCTION IN ANIMALS","Chapter 10. REACHING THE AGE OF ADOLESCENCE",
                "Chapter 11. FORCE AND PRESSURE",
                "Chapter 12. FRICTION",
                "Chapter 13. SOUND","Chapter 14. CHEMICAL EFFECTS OF ELECTRIC CURRENT","Chapter 15. SOME NATURAL PHENOMENA",
                "Chapter 16. LIGHT","Chapter 17. STARS AND THE SOLAR SYSTEM","Chapter 18. POLLUTION OF AIR AND WATER",
                "Exemplar : Chapter-1","Exemplar : Chapter-2",
                "Exemplar : Chapter-3","Exemplar : Chapter-4","Exemplar : Chapter-5",
                "Exemplar : Chapter-6","Exemplar : Chapter-7","Exemplar : Chapter-8",
                "Exemplar : Chapter-9","Exemplar : Chapter-10","Exemplar : Chapter-11",
                "Exemplar : Chapter-12","Exemplar : Chapter-13","Exemplar : Chapter-14",
                "Exemplar : Chapter-15","Exemplar : Chapter-16","Exemplar : Chapter-17",
                "Exemplar : Chapter-18","ANSWERS"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,class8sciencepdffiles){

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = view.findViewById(android.R.id.text1);

                return view;
            }
        };

        class8sciencelistview.setAdapter(adapter);
        class8sciencelistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>  adapterView, View view, int i, long l) {

                String item = class8sciencelistview.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),science8pdfopener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}

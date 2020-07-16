package com.arya.era;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context=context;
    }

    public int[] parent_icons = {
      R.drawable.female_parent,
            R.drawable.male_parent,
            R.drawable.female_parent
    };

    public String[] parent_comments = {
            "''ERA improves the result of my child, with committed teachers at affordable price.''",
            "''Teachers are dedicated and cleared all the doubts patiently.''",
            "''I see a positive attitude in my son after enrolling with ERA.''"
    };
    public String[] parents_names = {
      "Mrs. Poonam Chauhan",
      "Mr. Mahender Singh",
      "Mrs. Pandey"
    };

    public String[] parent_student_relation = {
      "Yash’s Mother",
      "Manvi’s Father",
      "Chirag’s Mother"
    };

    public String[] parent_address = {
      "Saharanpur, (Uttar Pradesh)",
            "Delhi - NCR",
            "Silvassa, (Dadra & Nagar Haveli)"

    };

    @Override
    public int getCount() {
        return parent_comments.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView parents_icon = view.findViewById(R.id.parents_icon);
        TextView parents_comments = view.findViewById(R.id.parents_comments);
        TextView parents_name = view.findViewById(R.id.parents_name);
        TextView parents_student_relation = view.findViewById(R.id.parents_student_relation);
        TextView parents_address = view.findViewById(R.id.parents_address);

        parents_icon.setImageResource(parent_icons[position]);
        parents_comments.setText(parent_comments[position]);
        parents_name.setText(parents_names[position]);
        parents_student_relation.setText(parent_student_relation[position]);
        parents_address.setText(parent_address[position]);

        container.addView(view);

        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);

    }
}

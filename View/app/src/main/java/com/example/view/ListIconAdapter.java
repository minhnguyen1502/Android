package com.example.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListIconAdapter extends ArrayAdapter<Icon> {

    private final List<Icon> icons;

    private static class viewholder {
        LinearLayout ll_ic;
        ImageView iv_ic;
        TextView tv_title;
        CheckBox cbSelected;
    }
    public ListIconAdapter(@NonNull Context context, List<Icon> icons) {
        super(context, R.layout.icon_item, icons);
        this.icons = icons;
    }



    @NonNull
    @Override
    // chọc vào template bên kia để chỉnh sửa
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Icon icon = icons.get(position); // lấy 1 tk icon lên
        final viewholder viewHolder;

        if (convertView == null){ // check view đã khởi tạo chưa
            // khởi tạo view
            viewHolder = new viewholder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.icon_item, parent, false); // khởi tạo 1 cái view rỗng( view ở template)

            viewHolder.iv_ic = convertView.findViewById(R.id.iv_icon); // tìm icon trong convertView
            viewHolder.tv_title = convertView.findViewById(R.id.tv_title);
            viewHolder.ll_ic = convertView.findViewById(R.id.ll_item);
            viewHolder.cbSelected = convertView.findViewById(R.id.cb_selected);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (viewholder) convertView.getTag(); // nếu đã khởi tạo chỉ cần getTag lấy view ra
        }

        viewHolder.cbSelected.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                icons.get(position).setSelected(b);
                notifyDataSetChanged();
            }
        });

        viewHolder.iv_ic.setImageResource(icon.getId());
        viewHolder.tv_title.setText(icon.getText());
        viewHolder.cbSelected.setChecked(icon.isSelected());



        viewHolder.ll_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}

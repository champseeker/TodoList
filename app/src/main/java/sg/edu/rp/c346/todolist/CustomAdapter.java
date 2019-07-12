package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDo> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDo> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewDate);

        ToDo currentVersion = versionList.get(position);

        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getDate());

        return rowView;
    }


}

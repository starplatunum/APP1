package com.example.app1;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class myAdapter extends ArrayAdapter implements AdapterView.OnItemClickListener,AdapterView.OnItemLongClickListener {
    public myAdapter(@NonNull Context context, int resource, @NonNull ArrayList<HashMap<String, String>> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list, parent, false);
        }
        Map<String, String> map = (Map<String, String>) getItem(position);
        TextView title = (TextView) itemView.findViewById(R.id.title);
        TextView detail = (TextView) itemView.findViewById(R.id.detail);
        title.setText("Title:" + map.get("title"));
        detail.setText("detail:" + map.get("detail"));
        return itemView;

    }

    String TAG="lalala:";
    @Override
    public void onItemClick(AdapterView<?> parent, View view,
                            int position, long id) {
        //remove();
        Object itemAtPosition = parent.getItemAtPosition(position);
        HashMap<String, String> map = (HashMap<String, String>) itemAtPosition;
        String titleStr = map.get("title");
        String detailStr = map.get("detail");
        Log.i(TAG, "onItemClick: titleStr=" + titleStr);
        Log.i(TAG, "onItemClick: detailStr=" + detailStr);
        //TextView title = (TextView) view.findViewById(R.id.title);
        //TextView detail = (TextView) view.findViewById(R.id.detail);

        second.putExtra("money", titleStr);
        second.putExtra("rate", detailStr);
        getContext().startActivity(second);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        remove(adapterView.getItemAtPosition(i));
        return true;
    }
}

package com.example.trantung.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trantung.hoclistviewnangcao.R;
import com.example.trantung.model.DanhBa;

import java.util.List;

import static com.example.trantung.hoclistviewnangcao.R.id.txtTenDanhDa;

/**
 * Created by Tran Tung on 14-Jul-17.
 */

public class DanhBaAdapter extends ArrayAdapter<DanhBa>
{

    Activity context;           //man hinh su dung layout nay
    int resource;               //layou cho tung dong mun hien thi (lam theo khach hang)
    List<DanhBa> objects;       //danh sách nguồn dữ liệu mún hhieern thị lên giao dien

    public DanhBaAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =this.context.getLayoutInflater();
        View row= inflater.inflate(this.resource, null);

        TextView txtTenDanhBa = (TextView) row.findViewById(R.id.txtTenDanhDa);
        TextView txtSDT = (TextView) row.findViewById(R.id.txtSDT);
        ImageButton btnCall = (ImageButton) row.findViewById(R.id.btnCall);
        ImageButton btnDetail= (ImageButton) row.findViewById(R.id.btnDetail);
        ImageButton btnSMS = (ImageButton) row.findViewById(R.id.btnSMS);

        final DanhBa danhda = this.objects.get(position);
        txtTenDanhBa.setText(danhda.getTen());
        txtSDT.setText(danhda.getSDT());

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCick(danhda);
            }
        });
        return row;
    }

    private void XuLyCick(DanhBa danhda) {
        Toast.makeText(this.context, "Ban chon:"+danhda.getTen(), Toast.LENGTH_LONG ).show();
    }


}

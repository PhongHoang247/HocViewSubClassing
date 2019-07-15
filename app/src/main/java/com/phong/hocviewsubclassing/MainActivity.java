package com.phong.hocviewsubclassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuLyGioiThieu(View view) {
        LinearLayout.LayoutParams params = //Tạo biến params để thiết lập chiều rộng chiều cao cho layout
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout linearLayout = new LinearLayout(this);//This là màn hình hiện tại MainActivity
        linearLayout.setLayoutParams(params);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView txtMsg = new TextView(this);
        txtMsg.setText("Hello anh em!!! Hê hê hê hê");
        txtMsg.setLayoutParams(params);
        linearLayout.addView(txtMsg);//Đẩy vào linearLayout

        Button btnBack = new Button(this)//View sub clasing
        {
            @Override
            public boolean performClick() {//Gán sự kiện cho Button này thông qua hàm performClick
                setContentView(R.layout.activity_main);
                return super.performClick();
            }
        };
        btnBack.setText("Trở về");
        btnBack.setLayoutParams(params);
        linearLayout.addView(btnBack);//Đẩy vào linearLayout

        setContentView(linearLayout);
    }
}

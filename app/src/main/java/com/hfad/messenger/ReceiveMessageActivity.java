package com.hfad.messenger;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE = "message"; // 這是我們要傳進 Intent 的額外資訊的名稱

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();  // 取得  Intent
        String messageText = intent.getStringExtra(EXTRA_MESSAGE); // getStringExtra() 方法從中取得訊息
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageText); // 將文字增加到 message 文字視圖元件
    }
}

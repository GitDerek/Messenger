package com.hfad.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText; // 必須匯入 EditText 類別，因為要在 activity 的程式碼中使用它

public class CreateMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // 在按鈕被點擊時，屬發 onSendMessage() 方法
    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(this, ReceiveMessageActivity.class); // 建立 intent，然後將文字漆加到裡頭
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,  messageText);  // 使用常數作為這項額外資訊的名稱，確保
                                                                              // CreateMessageActivity 與 ReceiveMessageActivity
                                                                              // 使用相同的字串。
        startActivity(intent);  // 使用 Intent 啟動 ReceiveMessageActivity
    }
}
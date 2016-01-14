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

        Intent intent = new Intent(Intent.ACTION_SEND); // 代替建立明確指定 ReceiveMessageActivity 的 intent，改為建立使用 send action 的 Intent
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,  messageText);
        String chooserTitle = getString(R.string.chooser);  // 取得選擇器的標題。 getString() 方法被用來取得字串資源的值。
        Intent chooserIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chooserIntent);  // 啟動使用者選取的 activity
    }
}
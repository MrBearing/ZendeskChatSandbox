package com.tasktoys.myzendeskchatapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zopim.android.sdk.api.ZopimChat
import com.zopim.android.sdk.prechat.ZopimChatActivity

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        ZopimChat.init(getString(R.string.zendesk_account_key))// stringで定義の必要があります。
    }

    fun startChatActivity(view : View){
        startActivity(Intent(view.context,ZopimChatActivity::class.java ))
    }
}

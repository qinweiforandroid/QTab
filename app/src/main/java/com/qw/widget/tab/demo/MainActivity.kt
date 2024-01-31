package com.qw.widget.tab.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.qw.widget.tab.BaseTab
import com.qw.widget.tab.TabLayout
import com.qw.widget.tab.TabView

class MainActivity : AppCompatActivity(), TabLayout.OnTabClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mTabLayout = findViewById<TabLayout>(R.id.mTabLayout)
        val tabs = ArrayList<BaseTab>()
        tabs.add(
            TabView.Tab.Builder()
                .setImgResId(R.drawable.selector_tab_ui_btn)
                .setLabelResId(R.string.tab_home)
                .setLabelColorResId(R.color.selector_tab_label)
                .setClazz(null)
                .builder()
        )

        tabs.add(
            TabView.Tab.Builder()
                .setImgResId(R.drawable.selector_tab_mine_btn)
                .setLabelResId(R.string.tab_me)
                .setLabelColorResId(R.color.selector_tab_label)
                .setClazz(null)
                .builder()
        )
        mTabLayout.initData(tabs, this)
        mTabLayout.setCurrentTab(0)
    }

    override fun onTabItemClick(currentIndex: Int, tab: BaseTab?): Boolean {
        if (currentIndex == 1) {
            Toast.makeText(this, "先登录", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }
}
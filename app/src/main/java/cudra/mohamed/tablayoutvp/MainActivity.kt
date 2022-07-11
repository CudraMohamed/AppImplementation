package cudra.mohamed.tablayoutvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.GRAVITY_FILL
import cudra.mohamed.tablayoutvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var tab_layout: TabLayout? = null
    var recycler_view: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        tab_layout = findViewById<TabLayout>(R.id.tab_layout)
//        recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
//
//        tab_layout!!.addTab(tab_layout!!.newTab().setText("Home"))
//        tab_layout!!.addTab(tab_layout!!.newTab().setText("Settings"))
//        tab_layout!!.addTab(tab_layout!!.newTab().setText("Contacts"))
//        tab_layout!!.tabGravity = TabLayout.GRAVITY_FILL
//
//        val adapter = MyAdapter(this, supportFragmentManager, tab_layout!!.tabCount)
//        recycler_view!!.adapter = adapter
//
//        recycler_view!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
//
//        tab_layout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab) {
//                recycler_view!!.currentItem = tab.position
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab) {
//
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab) {
//
//            }
//        })

    }
}


//        tab_layout=findViewById(R.id.tab_layout)
//        view_pager=findViewById(R.id.view_pager)
//
//        tab_layout!!.addTab(tab_layout!!.newTab().setText("Home"))
//        tab_layout!!.addTab(tab_layout!!.newTab().setText("Contacts"))
//        tab_layout!!.addTab(tab_layout!!.newTab().setText("Settings"))
//        tab_layout!!.tabGravity=GRAVITY_FILL
//
//        var adapter=MyAdapter(this,supportFragmentManager,tab_layout!!.tabCount)
//        view_pager!!.adapter=adapter
//
//        view_pager!!.addOnLayoutChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
//
//        tab_layout!!.addOnTabSelectedListener(object : TabLayout.TabLayoutOnPageChangeListener(tab_layout) {
//            fun onTabSelected(tab:TabLayout.Tab){
//                view_pager!!.currentItem=tab.position
//            }
//            fun onTabUnselected(tab:TabLayout.Tab){
//
//            }
//            fun onTabReselected(tab:TabLayout){
//
//            }
//        })
//    }
//}

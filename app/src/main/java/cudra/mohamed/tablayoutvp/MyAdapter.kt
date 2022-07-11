package cudra.mohamed.tablayoutvp

import android.content.Context
import android.provider.Settings
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(private var myContext:Context,fm:FragmentManager,internal var totalTabs:Int):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when (position){
            0->{
               //var homeFragment:HomeFragment=HomeFragment()
                return HomeFragment()
            }
            1->{
                return SettingsFragment()
            }
            2->{
                //var movieFragment=MovieFragment()
                return ContactsFragment()
            }
            else-> {
                return Fragment()
            }
        }
    }
    
    //counting number of tabs

    override fun getCount(): Int {
        return totalTabs
    }
    
}
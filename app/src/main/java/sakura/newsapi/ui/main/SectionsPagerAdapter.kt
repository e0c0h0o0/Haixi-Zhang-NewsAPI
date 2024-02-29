package sakura.newsapi.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import sakura.newsapi.Global
import sakura.newsapi.R
import java.util.Locale

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val title = Global.CATEGORYS[position]

        return title.substring(0, 1).uppercase(Locale.ROOT) + title.substring(1)
    }

    override fun getCount(): Int {
        return Global.CATEGORYS.size
    }
}
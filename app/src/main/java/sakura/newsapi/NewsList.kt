package sakura.newsapi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.viewbinding.ViewBinding
import sakura.newsapi.databinding.LayoutNewsCardBinding





open class NewsCardHolder(private val binding: LayoutNewsCardBinding, val context: Context): ViewHolder(binding.root) {

    fun bind(article: Article) {
        binding.uTitle.text = article.title
        binding.uTitleContainer.setOnClickListener {
            val intent = Intent(context, WebBrowserActivity::class.java)
            intent.putExtra("url", article.url)
            context.startActivity(intent)
        }
    }

}



class NewListAdapter(private val articles: List<Article>, val context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ViewBinding

        return NewsCardHolder(LayoutNewsCardBinding.inflate(inflater, parent, false), context)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val article = articles[position]

        (holder as NewsCardHolder).bind(article)
    }


}



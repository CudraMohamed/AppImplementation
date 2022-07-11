package cudra.mohamed.tablayoutvp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FragmentsRVAdapter(var chatList:List<Person>): RecyclerView.Adapter<FragmentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FragmentViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return FragmentViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FragmentViewHolder, position: Int) {
        var currentPerson=chatList.get(position)
        holder.tvName.text=currentPerson.name
        holder.tvTime.text=currentPerson.time
        holder.tvText.text=currentPerson.text

    }

    override fun getItemCount(): Int {
        return chatList.size
    }
}
class FragmentViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvTime=itemView.findViewById<TextView>(R.id.tvTime)
    var tvText=itemView.findViewById<TextView>(R.id.tvText)
    var ivPerson=itemView.findViewById<ImageView>(R.id.ivPerson)
    var ivDone=itemView.findViewById<ImageView>(R.id.ivDone)
}

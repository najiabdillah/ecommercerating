package ecommercerating.com
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import ecommercerating.com.R

class Adapter(val listUniv: ArrayList<Model>) : RecyclerView.Adapter<Adapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_ecom, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUniv.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, rank, photo, overview, identity) = listUniv[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvRank.text = rank

        val mContext = holder.itemView.context

        holder.btn.setOnClickListener {
            val moveDetail = Intent(mContext, Detail::class.java)
            moveDetail.putExtra(Detail.EXTRA_RANK, rank)
            moveDetail.putExtra(Detail.EXTRA_NAME, name)
            moveDetail.putExtra(Detail.EXTRA_PHOTO, photo)
            moveDetail.putExtra(Detail.EXTRA_IDENTITY, identity)
            moveDetail.putExtra(Detail.EXTRA_OVERVIEW, overview)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRank: TextView = itemView.findViewById(R.id.tv_item_rank)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btn: Button = itemView.findViewById(R.id.button_details)
    }

}
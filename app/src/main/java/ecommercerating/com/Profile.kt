package ecommercerating.com
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import ecommercerating.com.R

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val actionbar = supportActionBar
        actionbar!!.title = "Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgMe: ImageView = findViewById(R.id.img_item_photo)

//        val tImg = "https://scontent.fjog1-1.fna.fbcdn.net/v/t1.0-9/50711532_2192566407430895_7726942818895134720_o.jpg?_nc_cat=106&_nc_oc=AQmvQhyGW3xBgQGpktNNu_DEKIRkvS3ZMbMYOwHe4XieymDhQqfemNPJYXxRFzixH7w&_nc_ht=scontent.fjog1-1.fna&oh=36326363ae472174b1f9d82cfe2c3b39&oe=5E5718F0"

        Glide.with(this)
//            .load(tImg)
//            .apply(RequestOptions())
//            .into(imgMe)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

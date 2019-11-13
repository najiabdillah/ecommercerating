package ecommercerating.com


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ecommercerating.com.Dataecommerce

class MainActivity : AppCompatActivity() {
    private lateinit var rvUniv: RecyclerView
    private var list: ArrayList<Model> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "E-Commerce Rating 2019"

        rvUniv = findViewById(R.id.rv_univ)
        rvUniv.setHasFixedSize(true)

        list.addAll(Dataecommerce.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvUniv.layoutManager = LinearLayoutManager(this)
        val listUnivAdapter = Adapter(list)
        rvUniv.adapter = listUnivAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@MainActivity, Profile::class.java)
                startActivity(iAbout)
            }
        }
    }
}

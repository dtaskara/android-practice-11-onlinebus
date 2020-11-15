package kz.iitu.onlinebus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Services : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        val recyclerView = findViewById(
            R.id.my_recycler_view) as? RecyclerView;
        recyclerView?.layoutManager = LinearLayoutManager(this)

        val item = Item(1);
        val item2 = Item(2);
        val item3 = Item(3);
        val item4 = Item(4);
        val item5 = Item(5);
        val items = listOf(item,
            item2, item3, item4, item5
        );
        recyclerView?.adapter = ItemAdapter(items, onItemClick = {
            intent = Intent(this, Service::class.java)
            startActivity(intent)
        });
    }
}
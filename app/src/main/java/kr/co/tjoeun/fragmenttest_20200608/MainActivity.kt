package kr.co.tjoeun.fragmenttest_20200608

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.fragmenttest_20200608.adapters.MyAdapter

class MainActivity : BaseActivity() {

    lateinit var myAdapter : MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myAdapter = MyAdapter(supportFragmentManager)
        myViewPager.adapter = myAdapter
    }

}

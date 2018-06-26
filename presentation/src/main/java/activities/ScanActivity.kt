package activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import viewModelFactories.views.BottomBarVMF
import wetickets.wescanapp.R

class ScanActivity(
        val bottomBarVMF: BottomBarVMF = BottomBarVMF()
) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}
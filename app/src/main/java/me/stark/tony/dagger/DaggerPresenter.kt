package me.stark.tony.dagger

import android.widget.Toast
import javax.inject.Inject

class DaggerPresenter
@Inject
constructor(var activity: DaggerActivity) {

    fun getView(): DaggerActivity{
        return activity
    }

    fun showSuccessTips(){
        Toast.makeText(getView(),"success!!!",Toast.LENGTH_LONG).show()
    }



}
package com.iliyadev.firststart.utils

import android.content.Context
import android.view.Gravity
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.iliyadev.firststart.R

object PopupMenuHandler {

    fun showPopupMenu(context: Context, anchorView: View) {
        val popupMenu = PopupMenu(context, anchorView)
        popupMenu.gravity = Gravity.END // تنظیم راست به چپ یا چپ به راست
        val inflater: MenuInflater = popupMenu.menuInflater
        inflater.inflate(R.menu.popup_menu, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { menuItem: MenuItem ->
            handleMenuItemClick(context, menuItem)
        }
        popupMenu.show()
    }

    private fun handleMenuItemClick(context: Context, menuItem: MenuItem): Boolean {
        return when (menuItem.itemId) {
            R.id.option1 -> {
                //Toast.makeText(context, "گزینه ۱ انتخاب شد", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option2 -> {
                //Toast.makeText(context, "گزینه ۲ انتخاب شد", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }
}

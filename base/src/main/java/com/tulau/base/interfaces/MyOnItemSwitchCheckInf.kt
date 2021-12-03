package com.tulau.base.interfaces

import com.tulau.base.views.MySwitchButton

interface MyOnItemSwitchCheckInf {
    fun onSwitchCheck(view: MySwitchButton?, data: Any?, position: Int, isChecked: Boolean)
}
package com.tulaune.base.interfaces

import com.tulaune.base.views.MySwitchButton

interface MyOnItemSwitchCheckInf {
    fun onSwitchCheck(view: MySwitchButton?, data: Any?, position: Int, isChecked: Boolean)
}
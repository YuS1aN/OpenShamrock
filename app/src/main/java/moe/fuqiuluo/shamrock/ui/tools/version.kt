package moe.fuqiuluo.shamrock.ui.tools

import android.content.Context

fun getShamrockVersion(context: Context): String {
    try {
        val packageManager = context.packageManager
        val packageInfo = packageManager.getPackageInfo("moe.fuqiuluo.shamrock", 0)
        return packageInfo.versionName
    } catch (e: Exception) {
        return ""
    }
}
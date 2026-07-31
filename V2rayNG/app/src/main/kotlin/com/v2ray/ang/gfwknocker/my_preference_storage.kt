package com.v2ray.ang.gfwknocker

import android.content.Context

/**
 * Placeholder for GFW-knocker SharedPreferences wrapper.
 * The original implementation is closed-source and not included
 * in the MahsaNG upstream; this stub satisfies the compiler
 * so the rest of the GFW-knocker server logic can link.
 */
class my_preference_storage(private val ctx: Context) {
    private val prefs = ctx.getSharedPreferences("gfwknocker", Context.MODE_PRIVATE)

    fun get_value(key: String, default: String): String = prefs.getString(key, default) ?: default
    fun put_value(key: String, value: String) { prefs.edit().putString(key, value).apply() }
}
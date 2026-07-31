package com.v2ray.ang.gfwknocker

import android.content.Context

/**
 * Placeholder for GFW-knocker config-package reader.
 * The original implementation downloads and parses remote
 * configs; this stub satisfies the compiler so the GFW-knocker
 * server code can link.
 */
class config_pkg_reader(private val url: String, private val asset: String, private val ctx: Context) {
    fun fetch_json_config(force: Boolean): Boolean = false
    fun get_server_list(): String = ""
}
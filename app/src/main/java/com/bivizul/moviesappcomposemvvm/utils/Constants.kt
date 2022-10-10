package com.bivizul.moviesappcomposemvvm.utils

import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat

object Constants {

    const val BASE_URL = "https://api.tvmaze.com"
    const val TAG = "checkData"
}

@Composable
fun HtmlText(html: String, modifier: Modifier = Modifier) {

    AndroidView(
        modifier = modifier,
        factory = { context -> TextView(context) },
        update = { it.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_COMPACT) }
    )

}
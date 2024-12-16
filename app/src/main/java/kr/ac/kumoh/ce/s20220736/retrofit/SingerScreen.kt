package kr.ac.kumoh.ce.s20220736.retrofit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun SingerList() {
    Box (
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = "가수 리스트",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 70.sp,
            textAlign = TextAlign.Center
        )
    }
}
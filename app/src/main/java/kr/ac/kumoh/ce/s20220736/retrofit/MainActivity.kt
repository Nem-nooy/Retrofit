package kr.ac.kumoh.ce.s20220736.retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.ac.kumoh.ce.s20220736.retrofit.ui.theme.RetrofitTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetrofitTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(viewModel: SongViewModel = viewModel()) {
    val songList by viewModel.songList.observeAsState(emptyList())
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        SongList(
            list = songList,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun SongList(list: List<Song>, modifier: Modifier) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 8.dp),
    ) {
//        item {
//            Text("Header")
//        }
        items(list) { song ->
            SongItem(song)
        }
//        item {
//            Text("Footer")
//        }
    }
}

@Composable
fun SongItem(song: Song) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xffffffcc))      // 밝은 노란색
            .padding(16.dp)
    ) {
        TextTitle(song.title)
        TextSinger(song.singer)
    }
}

@Composable
fun TextTitle(title: String) {
    Text(title, fontSize = 30.sp)
}

@Composable
fun TextSinger(singer: String) {
    Text(singer, fontSize = 20.sp)
}
package kr.ac.kumoh.ce.s20220736.retrofit

data class Song(
    // val로 만든 건, 한 번 만들면 초기화를 못한다는 것에 유의.
    val id: Int,
    val title: String,
    val singer: String,
    val rating: Int,
    val lyrics: String?,
)

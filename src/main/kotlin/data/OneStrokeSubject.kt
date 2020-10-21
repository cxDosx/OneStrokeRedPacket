package data

data class OneStrokeSubject(
    val data: Data
)

data class Data(
    val connects: String,
    val vertexes: String
)

data class Connect(
    val x1: Int,
    val y1: Int,
    val x2: Int,
    val y2: Int
)

data class Vertexes(
    val x: Int,
    val y: Int
)
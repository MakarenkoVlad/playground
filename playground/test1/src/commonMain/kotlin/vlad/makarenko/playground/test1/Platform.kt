package vlad.makarenko.playground.test1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
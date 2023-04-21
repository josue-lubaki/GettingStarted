package ca.josue_lubaki.gettingstarted

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
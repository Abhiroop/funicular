package funicular

object Config {
    val NTHREADS = java.lang.Runtime.getRuntime.availableProcessors
    val BOUND = 100
    val MAX_WORKERS = 1000
    val MAXTHREADS = 32767
}
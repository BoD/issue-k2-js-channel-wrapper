import kotlinx.coroutines.channels.Channel

fun main() {
  println("Hello, World!")
  val channel = ChannelWrapper<String>(Channel())
  channel.trySend("Hello, World!")
}

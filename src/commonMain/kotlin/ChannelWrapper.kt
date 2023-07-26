import kotlinx.coroutines.channels.Channel

class ChannelWrapper<E>(private val wrapped: Channel<E>) : Channel<E> by wrapped

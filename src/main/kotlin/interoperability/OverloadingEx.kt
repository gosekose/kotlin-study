package interoperability

import kotlin.math.*

@JvmOverloads
fun restrictToRange(
    what: Int,
    from: Int = Int.MAX_VALUE,
    to: Int = Int.MIN_VALUE,
): Int {
    return max(from, min(to, what))
}
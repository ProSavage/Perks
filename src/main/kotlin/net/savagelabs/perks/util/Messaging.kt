package net.savagelabs.perks.util

import net.savagelabs.perks.Perks

fun log(message: String) = Perks.INSTANCE.logger.info(message)
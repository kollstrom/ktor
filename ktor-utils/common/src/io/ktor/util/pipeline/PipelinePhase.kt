/*
 * Copyright 2014-2019 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.util.pipeline

/**
 * Represents a phase in a pipeline
 *
 * @param name a name for this phase
 */
class PipelinePhase(val name: String) {
    override fun toString() = "Phase('$name')"
}

/**
 * An exception about misconfigured phases in a pipeline
 */
class InvalidPhaseException(message: String) : Throwable(message)

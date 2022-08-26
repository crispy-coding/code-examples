package org.crispycoding.intuitive

import org.springframework.stereotype.Service

@Service
open class SimpleTextProvider {
    open fun getText(): String {
        return "Hello, I'm the SimpleTextProvider."
    }
}
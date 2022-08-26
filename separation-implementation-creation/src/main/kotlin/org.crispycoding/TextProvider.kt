package org.crispycoding

import org.springframework.stereotype.Service

@Service
open class TextProvider {
    open fun getText(): String {
        return "hello"
    }
}
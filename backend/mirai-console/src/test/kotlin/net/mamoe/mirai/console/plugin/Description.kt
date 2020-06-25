/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 *
 */

package net.mamoe.mirai.console.plugin

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.yamlkt.Yaml
import org.intellij.lang.annotations.Language
import org.junit.jupiter.api.Test

class Description {
    @Test
    fun testDescription() {
        @Language("yaml")
        val description = """
name: Testing
main: net.mamoe.mirai.console.plugin.testing.Testing
author: Karlatemp
version: "1.0-SNAPSHOT"
"""
        val desc = Yaml.nonStrict.parse(JvmPluginDescription.serializer(), description)
        println(desc)
    }
}
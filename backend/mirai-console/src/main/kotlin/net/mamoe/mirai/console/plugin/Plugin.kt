/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.plugin

import net.mamoe.mirai.console.plugin.jvm.JvmPlugin
import java.io.File

/**
 * 表示一个 mirai-console 插件.
 *
 * @see JvmPlugin
 * @see PluginDescription 插件描述
 */
interface Plugin {
    /**
     * 所属插件加载器实例
     */
    val loader: PluginLoader<*, *>

    /**
     * 插件数据目录
     */
    val dataFolder: File

    /**
     * 获取插件是否已经启动 (Enabled)
     */
    val isEnable: Boolean
}
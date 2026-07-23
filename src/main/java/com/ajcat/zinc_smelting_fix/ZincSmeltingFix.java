package com.ajcat.zinc_smelting_fix; // 确保包名与你的 group_id 一致

import net.neoforged.fml.common.Mod;

@Mod(ZincSmeltingFix.MOD_ID) // 注解声明这是一个模组入口类
public class ZincSmeltingFix {
    // 定义并公开 MOD_ID 常量，方便在其他地方引用
    public static final String MOD_ID = "zinc_smelting_fix";

    // 构造函数，NeoForge 在加载模组时会调用它[reference:4]
    public ZincSmeltingFix() {
        // 因为只需要数据包配方，这里可以为空
    }
}
# **123Technology**
可能是没活硬整罢。

一些参考来自TST。

千万记得更新lang文件 ， 否则tooltip会有很大错误 。

有关于123的TT机器爆炸, 可在配置文件内控制

材质来源 ： JulianChum  ABKQPO  LyeeR

部分结构来源 ：JulianChum LyeeR 商陆 Tmeex


代码支持 ：

EOHBUFFER : Safari_Xiu

NHU : Keriils TC_traveler

kevenzh HuimaoX

感谢老登登们。
## **机器内容**
***
### 神之艾萨锻炉：神之艾萨锻炉 & 太空组装模块
默认为神之艾萨锻炉模式，在主机中塞入星阵以解锁太空组装模式。

tips：结构的原因不支持共用。
***
### 狄拉克潮汐：巨型量子操纵者（MegaQFT）
重写配方池且独立于量子操纵者，不需要催化剂，不再是概率产出，而是百分百。

不同结构方块提供不同加成：

耗时倍率 = 1 - (**时空膨胀场等级** * 0.1)

产出倍率：**力场发生器等级**=X 产出倍率=Y

if X＜6， Y=1

if 8≥X≥6，Y=2

if X＞8， Y=3

狄拉克逆变模式会有意想不到的惊喜
***
### 中国石化
***
集成石油化工处理机器

主机塞入**铱锇钐粉**解锁无损超频
***
### 唐山炼钢厂
***
正常耗时倍率 : 1 / 线圈等级

无线耗时 = 240s / 编程电路编号 ^ 2

无线EU消耗 = 功率 * 耗时 * 编程电路编号 ^ 2

非无线模式执行无损超频
***
### 红日之将军恩情工厂：巨型PCB工厂 & 贴片工坊 & NMD晶圆厂 & 元件聚合者
***
主机放入一团蜂群, 按照堆叠数量获得相应加速**(log2(蜂群数量)**, 舍弃小数向下取整。

**碳纳米蜂群** -- -2%

**超时空蜂群** -- 30%

**永恒蜂群** -- 75%

**宇宙素蜂群** -- 150%

运行时消耗**恩情** 1个/t

sfg信道 = 0 解锁PCB工厂

sfg信道 = 2 解锁贴片工坊

sfg信道 = 5 解锁NMD晶圆厂

sfg信道 = 8 解锁元件聚合者

更换力场后结构不成型请重放主机
***
### 艾萨集成工厂
***
集成艾萨处理工厂
***
### 压缩硅岩精炼厂
***
类似于压缩核聚变，更高效率生产硅岩燃料满足老登的需求
***
### 硅岩通化
***
大型硅岩燃料厂升级版本
***
### 老八蜜汁工厂：化工厂 & 化学反应釜
***
化工厂模式 ： 耗时 = NEI耗时 * (1 - 线圈等级 * 0.15),最低耗时倍率为0.1; 并行16, 无催化剂消耗, 有损超频

大型化学反应釜模式 : 耗时 = NEI耗时 * (1 - 线圈等级 * 0.1), 最低耗时倍率为0.1; 无限制并行, 无损超频

玻璃等级决定化工厂等级

螺丝刀右键主机切换模式

不成型请重放主机

如遇配方不执行，请放置一个普通输入总线，并将所有输入总线的编程电路调到一致

主机放入铱锇钐合金粉解锁化工厂无损超频及并行限制
***
## **机器配方池**
zs配方脚本编写请查阅GTTweaker in Github与MineTweaker3 or CraftTweaker教程

神之艾萨锻炉 : "otht.recipe.MegaIsaForge"

狄拉克潮汐 : "otht.recipe.OTEMegaQFT"

中国石化 : "otht.recipe.SINOPEC"

唐山炼钢厂 : "otht.recipe.TSSF"

红日之将军恩情工厂(巨型PCB工厂, 贴片工坊, NMD晶圆厂, 元件聚合者) "otht.recipe.MegaPCB" , "otht.recipe.MegaPCB_A" , "otht.recipe.MegaPCB_B" , "otht.recipe.MegaPCB_C"

木聚变反应堆 : otht.recipe.WoodenFusionReactor

艾萨集成工厂 : otht.recipe.MISA

压缩精炼厂独有配方池 : otht.recipe.NQF

硅岩通化配方池 : otht.recipe.fuel.nq (谨慎添加)

## **关于GTNH**

1.3.0及其以下版本只支持GTNH2.6.1 , GTNH2.6.0可以运行但不保证无bug

1.3.0+支持GTNH2.7.0 or GTNH2.7.2

## **关于模型**

绫波丽模型 : BlockBench bbmodel文件存于src\main\resources\assets\123technology\models

作者 : NewMaa 2025-1-17

明日香模型 : BlockBench bbmodel文件存于src\main\resources\assets\123technology\models

作者：HuimaoX 2025-2-4

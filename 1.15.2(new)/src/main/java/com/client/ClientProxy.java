import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
public class ClientProxy extends CommonProxy{
@Override
public void preInit(FMLPreInitializationEvent event){
super.preInit(event);
}
@Override
public void init(FMLInitializationEvent event){
super.init(event);
}
@Override
public void postInit(FMLPostInitializationEvent event){
super.postInit(event);
}
}
//版权声明：本文为CSDN博主「遗世紫丁香」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/lyh20000420/article/details/83659163
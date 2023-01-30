package xarmat.xarmatequipment;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = XarmatEquipment.MODID, name = XarmatEquipment.NAME, version = XarmatEquipment.VERSION, acceptedMinecraftVersions = XarmatEquipment.MC_VERSION)
public class XarmatEquipment {

	public static final String MODID = "xarmatequipment";
	public static final String NAME = "Xarmat Equipment";
	public static final String VERSION = "1.0.0";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(XarmatEquipment.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(XarmatEquipment.NAME + " mod send you a massage: For this is how God loved the world: He gave his one and only Son, so that everyone who believes in him will not perish but have eternal life.");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}

}

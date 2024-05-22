package jjplayz565.mod1;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.registry.*;
import net.minecraft.sound.SoundEvent;
import net.fabricmc.fabric.api.registry.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

@SuppressWarnings("unused")
public class MyFirstMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("my-first-mod");
	
	public static final CustomItem SQUEAKY_BALL = Registry.register(Registries.ITEM, new Identifier("mod1", "squeaky_ball"), new CustomItem(new FabricItemSettings().maxCount(1)));

	public static ToolItem SQUEAKY_SWORD = Registry.register(Registries.ITEM, new Identifier("mod1", "squeaky_sword"), new SqueakySword(SqueakyBallToolMaterial.INSTANCE, 5, 1.6f, new FabricItemSettings()));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
			content.addAfter(Items.SNOWBALL, SQUEAKY_BALL);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
			content.addAfter(Items.TRIDENT, SQUEAKY_SWORD);
		});

		CustomSounds.initialize();
	}
}
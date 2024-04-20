package satisfy.bakery.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import satisfy.bakery.Bakery;

@SuppressWarnings("all")
public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> BAKERY_TABS = DeferredRegister.create(Bakery.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> BAKERY_TAB = BAKERY_TABS.register("bakery", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(ObjectRegistry.BREAD_CRATE.get(), 1))
            .title(Component.translatable("creativetab.bakery.tab"))
            .displayItems((parameters, out) -> {
                try {
                    java.util.Arrays.asList(
                            ObjectRegistry.KITCHEN_SINK,
                            ObjectRegistry.BAKER_STATION,
                            ObjectRegistry.BRICK_COUNTER,
                            ObjectRegistry.CABINET,
                            ObjectRegistry.DRAWER,
                            ObjectRegistry.WALL_CABINET,
                            ObjectRegistry.IRON_TABLE,
                            ObjectRegistry.IRON_CHAIR,
                            ObjectRegistry.WALL_DISPLAY,
                            ObjectRegistry.CAKE_DISPLAY,
                            ObjectRegistry.CUPCAKE_DISPLAY,
                            ObjectRegistry.CAKE_STAND,
                            ObjectRegistry.BREADBOX,
                            ObjectRegistry.TRAY,
                            ObjectRegistry.SMALL_COOKING_POT_ITEM,
                            ObjectRegistry.ROLLING_PIN,
                            ObjectRegistry.BREAD_KNIFE,
                            ObjectRegistry.STREET_SIGN,
                            ObjectRegistry.BREAD_CRATE,
                            ObjectRegistry.CHOCOLATE_BOX,
                            ObjectRegistry.JAR,
                            ObjectRegistry.STRAWBERRY_JAM,
                            ObjectRegistry.SWEETBERRY_JAM,
                            ObjectRegistry.GLOWBERRY_JAM,
                            ObjectRegistry.APPLE_JAM,
                            ObjectRegistry.CHOCOLATE_JAM,
                            ObjectRegistry.CAKE_DOUGH,
                            ObjectRegistry.SWEET_DOUGH,
                            ObjectRegistry.CROISSANT,
                            ObjectRegistry.CRUSTY_BREAD_BLOCK,
                            ObjectRegistry.BREAD_BLOCK,
                            ObjectRegistry.BAGUETTE_BLOCK,
                            ObjectRegistry.TOAST_BLOCK,
                            ObjectRegistry.BRAIDED_BREAD_BLOCK,
                            ObjectRegistry.BUN_BLOCK,
                            ObjectRegistry.STRAWBERRY_CAKE_SLICE,
                            ObjectRegistry.SWEETBERRY_CAKE_SLICE,
                            ObjectRegistry.CHOCOLATE_CAKE_SLICE,
                            ObjectRegistry.CHOCOLATE_GATEAU_SLICE,
                            ObjectRegistry.BUNDT_CAKE_SLICE,
                            ObjectRegistry.LINZER_TART_SLICE,
                            ObjectRegistry.APPLE_PIE_SLICE,
                            ObjectRegistry.GLOWBERRY_PIE_SLICE,
                            ObjectRegistry.CHOCOLATE_TART_SLICE,
                            ObjectRegistry.STRAWBERRY_CAKE,
                            ObjectRegistry.SWEETBERRY_CAKE,
                            ObjectRegistry.CHOCOLATE_CAKE,
                            ObjectRegistry.CHOCOLATE_GATEAU,
                            ObjectRegistry.BUNDT_CAKE,
                            ObjectRegistry.LINZER_TART,
                            ObjectRegistry.APPLE_PIE,
                            ObjectRegistry.GLOWBERRY_TART,
                            ObjectRegistry.CHOCOLATE_TART,
                            ObjectRegistry.PUDDING_SLICE,
                            ObjectRegistry.STRAWBERRY_GLAZED_COOKIE,
                            ObjectRegistry.SWEETBERRY_GLAZED_COOKIE,
                            ObjectRegistry.CHOCOLATE_GLAZED_COOKIE,
                            ObjectRegistry.STRAWBERRY_CUPCAKE,
                            ObjectRegistry.SWEETBERRY_CUPCAKE,
                            ObjectRegistry.APPLE_CUPCAKE,
                            ObjectRegistry.JAM_ROLL,
                            ObjectRegistry.CORNET,
                            ObjectRegistry.PUDDING,
                            ObjectRegistry.WAFFLE_BLOCK,
                            ObjectRegistry.MISSLILITU_BISCUIT,
                            ObjectRegistry.CHOCOLATE_TRUFFLE,
                            ObjectRegistry.VEGETABLE_SANDWICH,
                            ObjectRegistry.SANDWICH,
                            ObjectRegistry.STONE_BRICKS_STOVE,
                            ObjectRegistry.COBBLESTONE_STOVE,
                            ObjectRegistry.DEEPSLATE_STOVE,
                            ObjectRegistry.GRANITE_STOVE,
                            ObjectRegistry.MUD_STOVE,
                            ObjectRegistry.SANDSTONE_STOVE,
                            ObjectRegistry.END_STOVE,
                            ObjectRegistry.RED_NETHER_BRICKS_STOVE,
                            ObjectRegistry.QUARTZ_STOVE,
                            ObjectRegistry.WANDERING_BAKER_SPAWN_EGG,
                            ObjectRegistry.BAKERY_STANDARD
                    ).forEach(itemSupplier -> {
                        ItemStack itemStack = new ItemStack(itemSupplier.get(), 1);
                        if (itemStack.getCount() != 1) {
                            throw new IllegalStateException("Invalid stack size for item: " + itemSupplier.get());
                        }
                        out.accept(itemStack);
                    });
                } catch (Exception e) {
                    System.err.println("Error adding items to creative tab: " + e.getMessage());
                    e.printStackTrace();
                }
            })
            .build());

    public static void init() {
        BAKERY_TABS.register();
    }
}

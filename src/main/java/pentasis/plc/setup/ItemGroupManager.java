package pentasis.plc.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ItemGroupManager extends ItemGroup {

    public Supplier<ItemStack> displayStack;

    public ItemGroupManager(String label, Supplier<ItemStack> displayStack) {
        super(label);
        this.displayStack = displayStack;
    }

    @Nonnull
    @Override
    public ItemStack createIcon() {
        return displayStack.get();
    }
}

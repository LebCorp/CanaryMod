package net.canarymod.api.world.blocks.properties;

import net.minecraft.block.properties.PropertyEnum;

/**
 * PropertyEnum wrapper implementation
 *
 * @author Jason Jones (darkdiplomat)
 */
public class CanaryBlockEnumProperty extends CanaryBlockProperty implements BlockEnumProperty {

    protected CanaryBlockEnumProperty(PropertyEnum property) {
        super(property);
    }

    @Override
    public String getName(Enum value) {
        //Im not sure how this will work yet honestly...
        return ((PropertyEnum) getNative()).a(value);
    }
}
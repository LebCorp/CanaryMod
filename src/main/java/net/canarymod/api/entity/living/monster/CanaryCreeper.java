package net.canarymod.api.entity.living.monster;

import net.canarymod.api.entity.EntityType;
import net.minecraft.entity.monster.EntityCreeper;

/**
 * Creeper wrapper implementation
 *
 * @author Chris (damagefilter)
 * @author Jason (darkdiplomat)
 */
public class CanaryCreeper extends CanaryEntityMob implements Creeper {

    private boolean damageEntity = true, damageWorld = true;

    /**
     * Constructs a new wrapper for EntityCreeper
     *
     * @param entity
     *         the EntityCreeper to wrap
     */
    public CanaryCreeper(EntityCreeper entity) {
        super(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityType getEntityType() {
        return EntityType.CREEPER;
    }

    @Override
    public String getFqName() {
        return "Creeper";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCanDamageWorld(boolean canDamage) {
        damageWorld = canDamage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canDamageWorld() {
        return damageWorld;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCanDamageEntities(boolean canDamage) {
        damageEntity = canDamage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canDamageEntities() {
        return damageEntity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCharged() {
        return getHandle().n();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCharged(boolean charged) {
        getHandle().setCharged(charged);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getPower() {
        return getHandle().bl;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setPower(float power) {
        getHandle().bk = (int) power;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void detonate() {
        getHandle().bl = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getFuse() {
        return getHandle().bk;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFuse(int fuse) {
        getHandle().bk = fuse;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void increaseFuse(int increase) {
        getHandle().bk += increase;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void decreaseFuse(int decrease) {
        getHandle().bk -= decrease;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAgro() {
        return getHandle().ck() == 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAgro(boolean agro) {
        getHandle().a(agro ? 1 : -1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityCreeper getHandle() {
        return (EntityCreeper) entity;
    }
}

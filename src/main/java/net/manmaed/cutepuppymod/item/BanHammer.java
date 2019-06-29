package net.manmaed.cutepuppymod.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

/**
 * Created by manmaed on 16/06/2019.
 */
public class BanHammer extends SwordItem {

    private final float attackDamage;
    private final float attackSpeed;

    public BanHammer(ToolMaterial material, int attack_damage, float attack_speed, Settings item$Settings_1) {
        super(material, attack_damage, attack_speed, item$Settings_1);
        this.attackSpeed = attack_speed;
        this.attackDamage = (float)attack_damage + material.getAttackDamage();
    }
}

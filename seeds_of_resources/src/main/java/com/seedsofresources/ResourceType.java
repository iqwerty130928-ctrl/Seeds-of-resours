package com.seedsofresources;

/**
 * List of all growable resources.
 * To add a new one: add a line here, then add a recipe, loot table,
 * blockstate, models, textures and lang entries with the same id.
 */
public enum ResourceType {
    COAL("coal"),
    IRON("iron"),
    DIAMOND("diamond");

    public final String id;

    ResourceType(String id) {
        this.id = id;
    }
}

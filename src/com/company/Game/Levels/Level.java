package com.company.Game.Levels;

import com.company.Game.Mobs.Mob;
import com.company.Game.Player;

import java.util.ArrayList;

/**
 * Created by tylercai on 7/30/16.
 */
public abstract class Level {

    private Player p;
    private ArrayList<Mob> mobs;

    public Level(Player p) {
        this.p = p;
    }
}

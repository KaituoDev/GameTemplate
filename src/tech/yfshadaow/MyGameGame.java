package tech.yfshadaow;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.util.BoundingBox;

import java.io.IOException;

import static tech.yfshadaow.GameUtils.world;

public class MyGameGame extends Game implements Listener {

    private static final MyGameGame instance = new MyGameGame((MyGame) Bukkit.getPluginManager().getPlugin("MyGame"));


    private MyGameGame(MyGame plugin) {
        this.plugin = plugin;
        players = plugin.players;
        initGame(plugin, "MyGame", "§eMyGame", 10, new Location(world, 1000, 15, -996), BlockFace.NORTH,
                new Location(world, 996, 15, -1000), BlockFace.EAST, new Location(world, 1000, 14, -1000), new BoundingBox(970, 31, -1030, 1030, 129, -970));
    }


    public static MyGameGame getInstance() {
        return instance;
    }

    @Override
    protected void initGameRunnable() {
        gameRunnable = () -> {

        };
    }

    @Override
    protected void savePlayerQuitData(Player p) throws IOException {

    }


    @Override
    protected void rejoin(Player player) {

    }


}

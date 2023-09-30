package fun.kaituo.gametemplate;

import fun.kaituo.gameutils.Game;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.io.IOException;

public class GameTemplateGame extends Game implements Listener {

    private static final GameTemplateGame instance = new GameTemplateGame((GameTemplate) Bukkit.getPluginManager().getPlugin("MyGame"));


    private GameTemplateGame(GameTemplate plugin) {
        this.plugin = plugin;
        players = plugin.players;
        initializeGame(plugin, "MyGame", "§eMyGame",
                new Location(world, 0, 89, 0));
        initializeButtons(new Location(world, 0,0,0), BlockFace.NORTH,
                new Location(world, 0,0,0), BlockFace.EAST);
    }


    public static GameTemplateGame getInstance() {
        return instance;
    }




    @Override
    protected void quit(Player player) throws IOException {

    }

    @Override
    protected boolean rejoin(Player player) {
        return false;
    }

    @Override
    protected boolean join(Player player) {
        return false;
    }

    @Override
    protected void forceStop() {

    }
}

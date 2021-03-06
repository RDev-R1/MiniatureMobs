package com.rdev.consts;

import org.bukkit.ChatColor;

/**
 * A class holding all the String constants for ease of use, simple classification and modularity.
 */
public final class Constants {

    private static final String WARN = ChatColor.RED + "";
    private static final String SUCCESS = ChatColor.DARK_GREEN + "" + ChatColor.BOLD;
    private static final String DARK_BLUE = ChatColor.DARK_BLUE + "" + ChatColor.BOLD;
    private static final String GOLD = ChatColor.GOLD + "" + ChatColor.BOLD;
    private static final String YELLOW = ChatColor.YELLOW + "" + ChatColor.BOLD;

    public static class General {
        public static final String PLUGIN_NAME = "MiniatureMobs";
        public static final String COMMAND_SHORTCUT = "MiniatureMobs";
    }

    public static class Command {
        public static final String NOT_PLAYER_ERROR = WARN + "You must be a player to use this command.";
        public static final String MAIN_COMMAND_USAGE = String.format("%sUSAGE:%s /%s <cmd>\n"
                        + "\n"
                        + "%sSupported Command:%s\n"
                        + SUCCESS + "/" + General.PLUGIN_NAME+ "" + ChatColor.RESET + " - Set the current location as the hub.\n"
                        + "/" + General.COMMAND_SHORTCUT+ " spawnmob <mobname> <amount>" + ChatColor.RESET + " - Spawn a custom monster\n",
                ChatColor.RED + "" + ChatColor.BOLD,
                ChatColor.RESET,
                General.PLUGIN_NAME,
                ChatColor.BOLD, ChatColor.RESET);

        public static final String NOT_A_NUMBER = SUCCESS + "Please enter a valid number!";
        public static final String MOB_CONFIGUCATION_NOT_FOUND = WARN + "Mob configuration name " + YELLOW + "%mob% " + WARN +"could not be found.";
        public static final String SPAWN_MOB_SUCCESS = SUCCESS + "%mob% sucessfully spawned!";
    }

    // Preventing class from being initialized.
    private Constants() {
    }
}

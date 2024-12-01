package dev.qelli.minecraft.xserversync.utils;

public class Constants {

    public static class Channels {
        public static final String Main = "tab_sync";
    }

    public static class Actions {
        public static class Players {
            public static final String Join = "actions.player.join";
            public static final String Quit = "actions.player.quit";
            public static final String Update = "actions.player.update";
            public static final String Message = "actions.player.message";
        }

        public static class Instances {
            public static final String Sync = "instance.sync";
            public static final String Sync_OK = "instance.sync_ok";
            public static final String Sync_EXIT = "instance.sync_exit";
        }
    }

}


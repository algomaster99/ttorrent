package com.turn.ttorrent.cli;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ClientMainTest {

    @Test
    public void triggerCli() {
        ClientMain.main(new String[]{"src/test/resources/test_folder.torrent"});
        assertTrue(true);
    }
}

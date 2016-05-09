/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audiochanger;

import com.jacob.com.LibraryLoader;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

/**
 *
 * @author crsst
 */
public class AudioChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("lib", "jacob-1.15-M4-x64.dll");
        System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

        /**
         * LIST AVAIL OUTPUTS BZZZZ BZZZZZZZ
         */
        int ctr = 1;
        for (Mixer.Info thisMixerInfo : AudioSystem.getMixerInfo()) {
            if (thisMixerInfo.getDescription().contains("Playback")) {
                System.out.println(ctr + ": " + " Mixer: " + thisMixerInfo.getDescription()
                        + " [" + thisMixerInfo.getName() + "]");
                ++ctr;
            }
        }
        /**
         * START SCRIPT BZZZZ BZZZZZZZ
         */
//        AutoItX script = new AutoItX();
//        int itemNum = 1;
//        String configWinTitle = "Sound";
//        
//        script.run("control mmsys.cpl"); //runs the sound control applet and hides it
//        script.winWaitActive(configWinTitle); //waits for window to be active
//        script.send("{TAB}{TAB}{TAB}{TAB}"); //put focus sa list
//        for (int i = 0; i < itemNum; i++) {
//            script.send("{DOWN}");
//        }
//        script.send("!s"); //press alt-s para ma-select yung device
//        script.WinClose(configWinTitle);

    }

}

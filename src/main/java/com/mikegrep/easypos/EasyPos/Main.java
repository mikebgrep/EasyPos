
package com.mikegrep.easypos.EasyPos;

import com.mikegrep.easypos.Ui.AppFrame;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author mike
 */

//FlatGradiantoNatureGreenIJTheme.setup();
//FlatArcIJTheme.setup();
//FlatArcDarkIJTheme.setup();

public class Main {
    public static void main(String args[]) throws IOException, SQLException {
       try{
           FlatArcDarkIJTheme.setup();
       } catch(Exception e){
           e.printStackTrace();
       }
        AppFrame frame = new AppFrame();
        frame.setVisible(true);
    }
}

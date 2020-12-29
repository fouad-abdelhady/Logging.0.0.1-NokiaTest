/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger.loogerLevels;

import java.util.LinkedList;
import java.util.List;
import logger.Logging;

/**
 *
 * @author Fouad
 */
public class InfoC extends LogEntry {

    private static List<InfoC> L_INFO_LIST = new LinkedList<>();

    public InfoC(String message, Object sourceP) {
        super(Logging.INFO, message, sourceP);
        L_INFO_LIST.add(this);
    }

    public InfoC(String message) {
        super(Logging.INFO, message);
        L_INFO_LIST.add(this);
    }
}

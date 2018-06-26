/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winexpert;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author balag
 */
class WinPanel extends JPanel{

    public WinPanel(){
		String ACTION_KEY = "theAction";
		Action actionListener= new AbstractAction() {
		     
			public void actionPerformed(ActionEvent actionEvent) {
		        actionEvent.getSource();
		      }
		};
		

		KeyStroke win = KeyStroke.getKeyStroke((char) KeyEvent.VK_WINDOWS);
	    InputMap inputMap =getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	    inputMap.put(win, ACTION_KEY);
	    ActionMap actionMap = getActionMap();
	    actionMap.put(ACTION_KEY, actionListener);
	    setActionMap(actionMap);


            KeyStroke esc = KeyStroke.getKeyStroke((char) KeyEvent.VK_ESCAPE);
	    InputMap inputMapEsc =getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	    inputMapEsc.put(esc, ACTION_KEY);
	    ActionMap actionMapEsc = getActionMap();
	    actionMapEsc.put(ACTION_KEY, actionListener);
	    setActionMap(actionMapEsc);	    
	    
            KeyStroke altTab = KeyStroke.getKeyStroke(KeyEvent.VK_TAB, InputEvent.ALT_MASK);
	    InputMap inputMap1 =getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	    inputMap1.put(altTab, ACTION_KEY);
	    ActionMap actionMap1 = getActionMap();
	    actionMap1.put(ACTION_KEY, actionListener);
	    setActionMap(actionMap1);

            KeyStroke altF4 = KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK);
	    InputMap inputMap2 =getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
	    inputMap2.put(altF4, ACTION_KEY);
	    ActionMap actionMap2 = getActionMap();
	    actionMap.put(ACTION_KEY, actionListener);
	    setActionMap(actionMap2);

	    
		
		//WINDOWS KEY
		KeyStroke winKey = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE),KeyEvent.VK_WINDOWS);
		InputMap inputMap0 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap0.put(winKey, ACTION_KEY);
		ActionMap actionMap0 = getActionMap();
		actionMap0.put(ACTION_KEY, actionListener);
		setActionMap(actionMap0);
		
		//CTRL+SHIFT
		KeyStroke ctrlShift = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE),(InputEvent.CTRL_MASK&InputEvent.SHIFT_MASK));
		InputMap inputMap01 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap01.put(ctrlShift, ACTION_KEY);
		ActionMap actionMap01 = getActionMap();
		actionMap01.put(ACTION_KEY, actionListener);
		setActionMap(actionMap01);
		
		//ALT OR CTRL OR SHIFT
		KeyStroke altCtrlShift = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE), (InputEvent.ALT_MASK|InputEvent.CTRL_MASK|InputEvent.SHIFT_MASK));
		InputMap inputMap02 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap02.put(altCtrlShift, ACTION_KEY);
		ActionMap actionMap02 = getActionMap();
		actionMap02.put(ACTION_KEY, actionListener);
		setActionMap(actionMap02);
		
		//CTRL + ALT
		KeyStroke altCtrl = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE), (InputEvent.ALT_MASK&InputEvent.CTRL_MASK));
		InputMap inputMap3 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap3.put(altCtrl, ACTION_KEY);
		ActionMap actionMap3 = getActionMap();
		actionMap3.put(ACTION_KEY, actionListener);
		setActionMap(actionMap3);
		
		//CTRL + WIN
		KeyStroke ctrlWin = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE), (KeyEvent.VK_WINDOWS&InputEvent.CTRL_MASK));
		InputMap inputMap4 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap4.put(ctrlWin, ACTION_KEY);
		ActionMap actionMap4 = getActionMap();
		actionMap4.put(ACTION_KEY, actionListener);
		setActionMap(actionMap4);
		
		//ALT+SHIFT
		KeyStroke ctrlAlt = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE), (InputEvent.ALT_MASK&InputEvent.SHIFT_MASK));
		InputMap inputMap5 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap5.put(ctrlAlt, ACTION_KEY);
		ActionMap actionMap5 = getActionMap();
		actionMap5.put(ACTION_KEY, actionListener);
		setActionMap(actionMap5);
		
		//ONE KEY
		KeyStroke one = KeyStroke.getKeyStroke((char) (KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE));
		InputMap inputMap6 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap6.put(one, ACTION_KEY);
		ActionMap actionMap6 = getActionMap();
		actionMap6.put(ACTION_KEY, actionListener);
		setActionMap(actionMap6);

		//WINDOWS+ALT OR +CTRL OR +SHIFT
		KeyStroke winAltCtrlShift = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE),(KeyEvent.VK_WINDOWS&(InputEvent.ALT_MASK|InputEvent.CTRL_MASK|InputEvent.SHIFT_MASK)));
		InputMap inputMap7 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap7.put(winAltCtrlShift, ACTION_KEY);
		ActionMap actionMap7 = getActionMap();
		actionMap7.put(ACTION_KEY, actionListener);
		setActionMap(actionMap7);
		
		//WINDOWS+ (ALT+CTRL) OR (ALT+SHIFT) OR (CTRL+SHIFT)
		KeyStroke winAltCtrlShift2 = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE),(KeyEvent.VK_WINDOWS&((InputEvent.ALT_MASK&InputEvent.CTRL_MASK)|(InputEvent.CTRL_MASK&InputEvent.SHIFT_MASK)|(InputEvent.ALT_MASK&InputEvent.SHIFT_MASK))));
		InputMap inputMap8 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap8.put(winAltCtrlShift2, ACTION_KEY);
		ActionMap actionMap8 = getActionMap();
		actionMap8.put(ACTION_KEY, actionListener);
		setActionMap(actionMap8);
		
		//(ALT+CTRL) OR (ALT+SHIFT) OR (CTRL+SHIFT)
		KeyStroke AltCtrlShift2 = KeyStroke.getKeyStroke((KeyEvent.VK_A|KeyEvent.VK_B|KeyEvent.VK_C|KeyEvent.VK_D|KeyEvent.VK_E|KeyEvent.VK_F|KeyEvent.VK_G|KeyEvent.VK_H|KeyEvent.VK_I|KeyEvent.VK_J|KeyEvent.VK_K|KeyEvent.VK_L|KeyEvent.VK_M|KeyEvent.VK_N|KeyEvent.VK_O|KeyEvent.VK_P|KeyEvent.VK_Q|KeyEvent.VK_R|KeyEvent.VK_S|KeyEvent.VK_T|KeyEvent.VK_U|KeyEvent.VK_V|KeyEvent.VK_W|KeyEvent.VK_X|KeyEvent.VK_Y|KeyEvent.VK_Z|KeyEvent.VK_1|KeyEvent.VK_2|KeyEvent.VK_3|KeyEvent.VK_4|KeyEvent.VK_5|KeyEvent.VK_6|KeyEvent.VK_7|KeyEvent.VK_8|KeyEvent.VK_9|KeyEvent.VK_0|KeyEvent.VK_F1|KeyEvent.VK_F2|KeyEvent.VK_F3|KeyEvent.VK_F4|KeyEvent.VK_F5|KeyEvent.VK_F6|KeyEvent.VK_F7|KeyEvent.VK_F8|KeyEvent.VK_9|KeyEvent.VK_F10|KeyEvent.VK_F11|KeyEvent.VK_F12|KeyEvent.VK_TAB|KeyEvent.VK_CAPS_LOCK|KeyEvent.VK_HOME|KeyEvent.VK_UP|KeyEvent.VK_DOWN|KeyEvent.VK_RIGHT|KeyEvent.VK_LEFT|KeyEvent.VK_INSERT|KeyEvent.VK_DELETE|KeyEvent.VK_PAGE_UP|KeyEvent.VK_PAGE_DOWN|KeyEvent.VK_END|KeyEvent.VK_ENTER|KeyEvent.VK_SLASH|KeyEvent.VK_PERIOD|KeyEvent.VK_COMMA|KeyEvent.VK_EQUALS|KeyEvent.VK_OPEN_BRACKET|KeyEvent.VK_CLOSE_BRACKET|KeyEvent.VK_SEMICOLON|KeyEvent.VK_BACK_SLASH|KeyEvent.VK_BACK_SPACE|KeyEvent.VK_SPACE|KeyEvent.VK_SEPARATOR|KeyEvent.VK_META|KeyEvent.VK_QUOTE),((InputEvent.ALT_MASK&InputEvent.CTRL_MASK)|(InputEvent.CTRL_MASK&InputEvent.SHIFT_MASK)|(InputEvent.ALT_MASK&InputEvent.SHIFT_MASK)));
		InputMap inputMap9 = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap9.put(AltCtrlShift2, ACTION_KEY);
		ActionMap actionMap9 = getActionMap();
		actionMap9.put(ACTION_KEY, actionListener);
		setActionMap(actionMap9);
				
		
	}
}

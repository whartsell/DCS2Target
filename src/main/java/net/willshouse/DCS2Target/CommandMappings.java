package net.willshouse.DCS2Target;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by whartsell on 12/27/2014.
 */
public class CommandMappings {
    public static List<List<String>> commandFilters;
    static {
        commandFilters = new ArrayList<List<String>>();
        // ORDER MATTERS
        // Remove the quotes
        commandFilters.add(new ArrayList<String>(Arrays.asList("\"", "")));
        //Remap the KP to the USB Macros
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num/","USB_KPForwardSlash")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num*","USB_KPAsterisk")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num-","USB_KPMinus")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num+","USB_KPPlus")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("NumEnter","USB_KPEnter")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num1","USB_KP1")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num2","USB_KP2")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num3","USB_KP3")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num4","USB_KP4")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num5","USB_KP5")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num6","USB_KP6")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num7","USB_KP7")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num8","USB_KP8")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num9","USB_KP9")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num0","USB_KP0")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num.","USB_KPDecimal")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Num=","USB_KPEquals")));
        // Now were safe to replace the concatonation to the proper format for TARGET
        commandFilters.add(new ArrayList<String>(Arrays.asList(" - "," + ")));
        // Modifiers
        commandFilters.add(new ArrayList<String>(Arrays.asList("LShift","L_SHIFT")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("LCtrl","L_CTL")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("LWin","L_WIN")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("LAlt","L_ALT")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("RShift","R_SHIFT")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("RCtrl","R_CTL")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("RWin","R_WIN")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("RAlt","R_ALT")));
        //Named Keys
        commandFilters.add(new ArrayList<String>(Arrays.asList("SysRQ","USB_PrintScreen")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Scroll","USB_ScrollLock")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Pause","USB_Break")));
        //commandFilters.add(new ArrayList<String>(Arrays.asList("NULL","USB_Break")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Insert","USB_Insert")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Home","USB_Home")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("PageUp","USB_PageUp")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Delete","USB_Delete")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("End","USB_End")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Insert","USB_Insert")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("PageDown","USB_PageDown")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Right","USB_RightArrow")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Left","USB_LeftArrow")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Down","USB_DownArrow")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Up","USB_UpArrow")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("NumLock","USB_NumLock")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Enter","USB_Return")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("ESC","USB_Escape")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Back","USB_Backspace")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Tab","USB_Tab")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Space","USB_Space")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("-","USB_Minus")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("=","USB_Equals")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("[","USB_LBracket")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("]","USB_RBracket")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("\\","USB_BackSlash")));
        commandFilters.add(new ArrayList<String>(Arrays.asList(";","USB_SemiColon")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("'","USB_Apostrophe")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("`","USB_Tilde")));
        commandFilters.add(new ArrayList<String>(Arrays.asList(",","USB_Comma")));
        commandFilters.add(new ArrayList<String>(Arrays.asList(".","USB_Period")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("/","USB_ForwardSlash")));
        //commandFilters.add(new ArrayList<String>(Arrays.asList("NULL","USB_CapsLock")));
        //Function Keys
        commandFilters.add(new ArrayList<String>(Arrays.asList("F1","USB_F1")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F2","USB_F2")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F3","USB_F3")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F4","USB_F4")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F5","USB_F5")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F6","USB_F6")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F7","USB_F7")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F8","USB_F8")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F9","USB_F9")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F10","USB_F10")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F11","USB_F11")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F12","USB_F12")));
        // a-z0-9
        commandFilters.add(new ArrayList<String>(Arrays.asList("A","USB_A")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("B","USB_B")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("C","USB_C")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("D","USB_D")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("E","USB_E")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("F","USB_F")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("G","USB_G")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("H","USB_H")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("I","USB_I")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("J","USB_J")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("K","USB_K")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("L","USB_L")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("M","USB_M")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("N","USB_N")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("O","USB_O")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("P","USB_P")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Q","USB_Q")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("R","USB_R")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("S","USB_S")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("T","USB_T")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("U","USB_U")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("V","USB_V")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("W","USB_W")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("X","USB_X")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Y","USB_Y")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("Z","USB_Z")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("1","USB_1")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("2","USB_2")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("3","USB_3")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("4","USB_4")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("5","USB_5")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("6","USB_6")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("7","USB_7")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("8","USB_8")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("9","USB_9")));
        commandFilters.add(new ArrayList<String>(Arrays.asList("0","USB_0")));











    }


}

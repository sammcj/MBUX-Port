
package com.rndash.mbheadunit.nativeCan.canB

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TP_TELEAID_KOMBI4 (ID 0x01A1)
**/

object TP_TELEAID_KOMBI4 {

    	/** Gets Communication TELEAID to KOMBI **/
	fun get_tp_teleaid_kombi() : Int = CanBusNative.getECUParameterB(CanBAddrs.TP_TELEAID_KOMBI4, 0, 64)
	
	
}
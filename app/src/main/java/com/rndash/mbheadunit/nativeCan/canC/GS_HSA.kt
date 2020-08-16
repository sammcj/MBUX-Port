
package com.rndash.mbheadunit.nativeCan.canC

import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_HSA (ID 0x050A)
**/

object GS_HSA {

    	/** Gets manual control on the test bench **/
	fun get_hsa() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HSA, 0, 64)
	
	
}
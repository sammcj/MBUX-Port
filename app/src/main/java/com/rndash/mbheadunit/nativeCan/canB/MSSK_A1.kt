
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MSSK_A1 (ID 0x0046)
**/

object MSSK_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MSSK_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.MSSK_A1)

	/** Gets direction flashing left **/
	fun get_bli_li_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 4, 1) != 0
	
	/** Sets direction flashing left **/
	fun set_bli_li_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets right direction flashing **/
	fun get_bli_re_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 3, 1) != 0
	
	/** Sets right direction flashing **/
	fun set_bli_re_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on high beam **/
	fun get_fl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 2, 1) != 0
	
	/** Sets switch on high beam **/
	fun set_fl_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on headlight flasher **/
	fun get_lhp_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 1, 1) != 0
	
	/** Sets switch on headlight flasher **/
	fun set_lhp_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on the horn **/
	fun get_sgh_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 0, 1) != 0
	
	/** Sets switch on the horn **/
	fun set_sgh_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on tap wiping **/
	fun get_tipp_wisch_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 12, 1) != 0
	
	/** Sets Switch on tap wiping **/
	fun set_tipp_wisch_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on washing **/
	fun get_waschen_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 11, 1) != 0
	
	/** Sets Switch on washing **/
	fun set_waschen_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets MSSK in position I (rain sensor operation) **/
	fun get_sch_wi_int_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 10, 1) != 0
	
	/** Sets MSSK in position I (rain sensor operation) **/
	fun set_sch_wi_int_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets MSSK in position II (level 1) **/
	fun get_sch_wi_1_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 9, 1) != 0
	
	/** Sets MSSK in position II (level 1) **/
	fun set_sch_wi_1_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets MSSK in position III (level 2) **/
	fun get_sch_wi_2_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 8, 1) != 0
	
	/** Sets MSSK in position III (level 2) **/
	fun set_sch_wi_2_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on the rear fog light **/
	fun get_nsl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 22, 1) != 0
	
	/** Sets Switch on the rear fog light **/
	fun set_nsl_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 22, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on the fog lights **/
	fun get_nsw_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 21, 1) != 0
	
	/** Sets Switch on the fog lights **/
	fun set_nsw_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 21, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on low beam **/
	fun get_abl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 20, 1) != 0
	
	/** Sets switch on low beam **/
	fun set_abl_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 20, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on parking lights **/
	fun get_stl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 19, 1) != 0
	
	/** Sets switch on parking lights **/
	fun set_stl_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets Hazard warning lights on **/
	fun get_wbl_ein_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 18, 1) != 0
	
	/** Sets Hazard warning lights on **/
	fun set_wbl_ein_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets Wipe / wash the rear window **/
	fun get_heck_wisch_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 17, 1) != 0
	
	/** Sets Wipe / wash the rear window **/
	fun set_heck_wisch_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets Intermittent wiping of the rear window **/
	fun get_heck_int_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 16, 1) != 0
	
	/** Sets Intermittent wiping of the rear window **/
	fun set_heck_int_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets Open the sunroof **/
	fun get_shd_auf_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 27, 1) != 0
	
	/** Sets Open the sunroof **/
	fun set_shd_auf_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** Gets Close the sunroof **/
	fun get_shd_zu_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 26, 1) != 0
	
	/** Sets Close the sunroof **/
	fun set_shd_zu_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets Open the lifting roof **/
	fun get_hd_auf_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 25, 1) != 0
	
	/** Sets Open the lifting roof **/
	fun set_hd_auf_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets Sunroof stop **/
	fun get_shd_stop() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A1, 24, 1) != 0
	
	/** Sets Sunroof stop **/
	fun set_shd_stop(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.MSSK_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MSSK_A1 (0x0046):
		|	direction flashing left: ${get_bli_li_k()}
		|	right direction flashing: ${get_bli_re_k()}
		|	switch on high beam: ${get_fl_ein_k()}
		|	switch on headlight flasher: ${get_lhp_ein_k()}
		|	switch on the horn: ${get_sgh_ein_k()}
		|	Switch on tap wiping: ${get_tipp_wisch_k()}
		|	Switch on washing: ${get_waschen_k()}
		|	MSSK in position I (rain sensor operation): ${get_sch_wi_int_k()}
		|	MSSK in position II (level 1): ${get_sch_wi_1_k()}
		|	MSSK in position III (level 2): ${get_sch_wi_2_k()}
		|	Switch on the rear fog light: ${get_nsl_ein_k()}
		|	Switch on the fog lights: ${get_nsw_ein_k()}
		|	switch on low beam: ${get_abl_ein_k()}
		|	switch on parking lights: ${get_stl_ein_k()}
		|	Hazard warning lights on: ${get_wbl_ein_k()}
		|	Wipe / wash the rear window: ${get_heck_wisch_k()}
		|	Intermittent wiping of the rear window: ${get_heck_int_k()}
		|	Open the sunroof: ${get_shd_auf_k()}
		|	Close the sunroof: ${get_shd_zu_k()}
		|	Open the lifting roof: ${get_hd_auf_k()}
		|	Sunroof stop: ${get_shd_stop()}
	""".trimMargin("|")
}

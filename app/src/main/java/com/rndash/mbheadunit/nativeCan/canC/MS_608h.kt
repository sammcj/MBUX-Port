
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_608h (ID 0x0608)
**/

object MS_608h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MS_608h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.MS_608h)

	/** Gets engine coolant temperature **/
	fun get_t_mot() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 0, 8)
	
	/** Sets engine coolant temperature **/
	fun set_t_mot(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/** Gets intake air temperature **/
	fun get_t_luft() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 8, 8)
	
	/** Sets intake air temperature **/
	fun set_t_luft(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets vehicle code series **/
	fun get_fcod_br() : FCOD_BR = when(CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 19, 5)) {
		 0 -> FCOD_BR.BR221
		 1 -> FCOD_BR.BR129
		 2 -> FCOD_BR.BR210
		 3 -> FCOD_BR.BR202
		 4 -> FCOD_BR.BR220
		 5 -> FCOD_BR.BR170
		 6 -> FCOD_BR.BR203
		 7 -> FCOD_BR.BR168
		 8 -> FCOD_BR.BR163
		 9 -> FCOD_BR.BR208
		 10 -> FCOD_BR.BR463
		 11 -> FCOD_BR.BR215
		 12 -> FCOD_BR.BR230
		 13 -> FCOD_BR.BR211
		 14 -> FCOD_BR.BR209
		 15 -> FCOD_BR.BR461
		 16 -> FCOD_BR.BR240
		 17 -> FCOD_BR.BR251
		 18 -> FCOD_BR.BR171
		 19 -> FCOD_BR.BR164
		 20 -> FCOD_BR.BR169
		 21 -> FCOD_BR.BR199
		 22 -> FCOD_BR.BR216
		 23 -> FCOD_BR.BR219
		 24 -> FCOD_BR.BR454
		 25 -> FCOD_BR.NCV2
		 26 -> FCOD_BR.VITO
		 27 -> FCOD_BR.SPRINTER
		 28 -> FCOD_BR.NCV3
		 29 -> FCOD_BR.NCV1
		 30 -> FCOD_BR.REST
		 31 -> FCOD_BR.SNV
		 else -> throw Exception("Invalid raw value for FCOD_BR")
	}
	
	/** Sets vehicle code series **/
	fun set_fcod_br(f: CanFrame, p: FCOD_BR) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 5, p.raw)
	}
	
	/** Gets vehicle code body **/
	fun get_fcod_kar() : FCOD_KAR = when(CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 16, 3)) {
		 0 -> FCOD_KAR.W
		 1 -> FCOD_KAR.V
		 2 -> FCOD_KAR.C
		 3 -> FCOD_KAR.S
		 4 -> FCOD_KAR.A
		 5 -> FCOD_KAR.R
		 6 -> FCOD_KAR.SS
		 7 -> FCOD_KAR.SNV
		 else -> throw Exception("Invalid raw value for FCOD_KAR")
	}
	
	/** Sets vehicle code body **/
	fun set_fcod_kar(f: CanFrame, p: FCOD_KAR) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 3, p.raw)
	}
	
	/** Gets Vehicle code motor 7Bit, Bit0-5 (Bit6 -> Signal FCOD_MOT6) **/
	fun get_fcod_mot() : FCOD_MOT = when(CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 26, 6)) {
		 0 -> FCOD_MOT.M272E35
		 1 -> FCOD_MOT.M271E18ML105
		 2 -> FCOD_MOT.M271E18ML120
		 3 -> FCOD_MOT.M112E37
		 4 -> FCOD_MOT.M272E25
		 5 -> FCOD_MOT.M272E30
		 7 -> FCOD_MOT.M112E28
		 8 -> FCOD_MOT.M112E32
		 10 -> FCOD_MOT.M273E46
		 11 -> FCOD_MOT.M273E55
		 12 -> FCOD_MOT.M112E26
		 13 -> FCOD_MOT.M113E43
		 14 -> FCOD_MOT.M113E50
		 18 -> FCOD_MOT.M271E18ML140
		 19 -> FCOD_MOT.M271DE18ML105
		 20 -> FCOD_MOT.M271DE18ML125
		 22 -> FCOD_MOT.M111E_E23ML
		 23 -> FCOD_MOT.M111E_E20
		 24 -> FCOD_MOT.M111E_E20ML
		 25 -> FCOD_MOT.M112E32_140
		 26 -> FCOD_MOT.M266E20ATL
		 27 -> FCOD_MOT.M266E15
		 28 -> FCOD_MOT.M266E17
		 29 -> FCOD_MOT.M266E20
		 30 -> FCOD_MOT.M275E55
		 31 -> FCOD_MOT.M137E58
		 32 -> FCOD_MOT.OM640DE20LA60
		 34 -> FCOD_MOT.OM640DE20LA80
		 35 -> FCOD_MOT.OM642DE30LA160
		 36 -> FCOD_MOT.OM640DE20LA100
		 37 -> FCOD_MOT.OM613DE32LA
		 39 -> FCOD_MOT.OM628DE40LA
		 40 -> FCOD_MOT.OM642DE30LA140
		 43 -> FCOD_MOT.OM612DE27LA
		 44 -> FCOD_MOT.OM611DE22LA100
		 45 -> FCOD_MOT.OM611DE22LA85
		 46 -> FCOD_MOT.OM611DE22LA75
		 64 -> FCOD_MOT.M134E11
		 65 -> FCOD_MOT.M135E13
		 66 -> FCOD_MOT.M135E15
		 67 -> FCOD_MOT.M135E15ATL
		 68 -> FCOD_MOT.M272DE25
		 69 -> FCOD_MOT.M272DE30
		 70 -> FCOD_MOT.M272DE35
		 71 -> FCOD_MOT.M273DE46
		 72 -> FCOD_MOT.M273DE55
		 79 -> FCOD_MOT.M271E18MLATTR115
		 80 -> FCOD_MOT.M271E18MLATTR141
		 96 -> FCOD_MOT.OM629DE40LA
		 99 -> FCOD_MOT.OM642DE30LARED140
		 else -> throw Exception("Invalid raw value for FCOD_MOT")
	}
	
	/** Sets Vehicle code motor 7Bit, Bit0-5 (Bit6 -> Signal FCOD_MOT6) **/
	fun set_fcod_mot(f: CanFrame, p: FCOD_MOT) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 26, 6, p.raw)
	}
	
	/** Gets transmission control not available **/
	fun get_gs_nvh() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 25, 1) != 0
	
	/** Sets transmission control not available **/
	fun set_gs_nvh(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets Vehicle code engine with 7 bits, bit 6 **/
	fun get_fcod_mot6() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 24, 1) != 0
	
	/** Sets Vehicle code engine with 7 bits, bit 6 **/
	fun set_fcod_mot6(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/** Gets Fixed maximum speed **/
	fun get_v_max_fix() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 32, 8)
	
	/** Sets Fixed maximum speed **/
	fun set_v_max_fix(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 8, p)
	}
	
	/** Gets consumption **/
	fun get_vb() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 40, 16)
	
	/** Sets consumption **/
	fun set_vb(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 40, 16, p)
	}
	
	/** Gets Particle filter correction offset FMMOTMAX **/
	fun get_pfko() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 60, 4)
	
	/** Sets Particle filter correction offset FMMOTMAX **/
	fun set_pfko(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 60, 4, p)
	}
	
	/** Gets switch on additional consumer **/
	fun get_zvb_ein_ms() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 59, 1) != 0
	
	/** Sets switch on additional consumer **/
	fun set_zvb_ein_ms(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 59, 1, if(p) 1 else 0)
	}
	
	/** Gets Particle filter warning **/
	fun get_pfw() : PFW = when(CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 57, 2)) {
		 0 -> PFW.OK
		 1 -> PFW.PFW1
		 2 -> PFW.PFW2
		 3 -> PFW.SNV
		 else -> throw Exception("Invalid raw value for PFW")
	}
	
	/** Sets Particle filter warning **/
	fun set_pfw(f: CanFrame, p: PFW) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 57, 2, p.raw)
	}
	
	/** Gets switch on additional water pump **/
	fun get_zwp_ein_ms() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_608h, 56, 1) != 0
	
	/** Sets switch on additional water pump **/
	fun set_zwp_ein_ms(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 56, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.MS_608h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MS_608h (0x0608):
		|	engine coolant temperature: ${get_t_mot()}
		|	intake air temperature: ${get_t_luft()}
		|	vehicle code series: ${get_fcod_br()}
		|	vehicle code body: ${get_fcod_kar()}
		|	Vehicle code motor 7Bit, Bit0-5 (Bit6 -> Signal FCOD_MOT6): ${get_fcod_mot()}
		|	transmission control not available: ${get_gs_nvh()}
		|	Vehicle code engine with 7 bits, bit 6: ${get_fcod_mot6()}
		|	Fixed maximum speed: ${get_v_max_fix()}
		|	consumption: ${get_vb()}
		|	Particle filter correction offset FMMOTMAX: ${get_pfko()}
		|	switch on additional consumer: ${get_zvb_ein_ms()}
		|	Particle filter warning: ${get_pfw()}
		|	switch on additional water pump: ${get_zwp_ein_ms()}
	""".trimMargin("|")
}
